package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzew.zzb;
import com.google.android.gms.internal.measurement.zzfi.zzc;
import com.google.android.gms.internal.measurement.zzfi.zzd;
import com.google.android.gms.internal.measurement.zzfi.zze;
import com.google.android.gms.internal.measurement.zzfi.zzl;
import com.google.android.gms.internal.measurement.zzfi.zzm;
import com.google.android.gms.internal.measurement.zzfi.zzn;
import com.google.android.gms.internal.measurement.zzob;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzt extends zzmo {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzt(zzmp zzmp0) {
        super(zzmp0);
    }

    private final zzv zza(Integer integer0) {
        if(this.zzc.containsKey(integer0)) {
            return (zzv)this.zzc.get(integer0);
        }
        zzv zzv0 = new zzv(this, this.zza, null);
        this.zzc.put(integer0, zzv0);
        return zzv0;
    }

    private final boolean zza(int v, int v1) {
        zzv zzv0 = (zzv)this.zzc.get(v);
        return zzv0 == null ? false : zzv.zza(zzv0).get(v1);
    }

    final List zza(String s, List list0, List list1, Long long0, Long long1) {
        a a3;
        zzx zzx1;
        zzbc zzbc1;
        Map map3;
        Iterator iterator4;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(list0);
        Preconditions.checkNotNull(list1);
        this.zza = s;
        this.zzb = new HashSet();
        this.zzc = new a();
        this.zzd = long0;
        this.zze = long1;
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
        boolean z = zzob.zza() && this.zze().zzf(this.zza, zzbi.zzbg);
        boolean z1 = zzob.zza() && this.zze().zzf(this.zza, zzbi.zzbf);
        Map map0 = Collections.emptyMap();
        if(z1 && z) {
            map0 = this.zzh().zzk(this.zza);
        }
        Map map1 = this.zzh().zzj(this.zza);
        if(!map1.isEmpty()) {
            Map map2 = map1;
            for(Object object0: new HashSet(map1.keySet())) {
                Integer integer0 = (Integer)object0;
                integer0.intValue();
                zzl zzfi$zzl0 = (zzl)map2.get(integer0);
                BitSet bitSet0 = new BitSet();
                BitSet bitSet1 = new BitSet();
                a a0 = new a();
                if(zzfi$zzl0 != null && zzfi$zzl0.zza() != 0) {
                    for(Object object1: zzfi$zzl0.zzh()) {
                        zzd zzfi$zzd0 = (zzd)object1;
                        if(zzfi$zzd0.zzf()) {
                            a0.put(zzfi$zzd0.zza(), (zzfi$zzd0.zze() ? zzfi$zzd0.zzb() : null));
                        }
                    }
                }
                a a1 = new a();
                if(zzfi$zzl0 != null && zzfi$zzl0.zzc() != 0) {
                    for(Iterator iterator3 = zzfi$zzl0.zzj().iterator(); iterator3.hasNext(); iterator3 = iterator4) {
                        Object object2 = iterator3.next();
                        zzm zzfi$zzm0 = (zzm)object2;
                        if(!zzfi$zzm0.zzf() || zzfi$zzm0.zza() <= 0) {
                            iterator4 = iterator3;
                        }
                        else {
                            iterator4 = iterator3;
                            a1.put(zzfi$zzm0.zzb(), zzfi$zzm0.zza(zzfi$zzm0.zza() - 1));
                        }
                    }
                }
                if(zzfi$zzl0 != null) {
                    int v = 0;
                    while(v < zzfi$zzl0.zzd() << 6) {
                        if(zzmz.zza(zzfi$zzl0.zzk(), v)) {
                            map3 = map2;
                            this.zzj().zzp().zza("Filter already evaluated. audience ID, filter ID", integer0, v);
                            bitSet1.set(v);
                            if(zzmz.zza(zzfi$zzl0.zzi(), v)) {
                                bitSet0.set(v);
                                goto label_62;
                            }
                        }
                        else {
                            map3 = map2;
                        }
                        a0.remove(v);
                    label_62:
                        ++v;
                        map2 = map3;
                    }
                }
                Object object3 = map1.get(integer0);
                if(z1 && z) {
                    List list2 = (List)map0.get(integer0);
                    if(list2 != null && this.zze != null && this.zzd != null) {
                        for(Object object4: list2) {
                            int v1 = ((zzb)object4).zzb();
                            long v2 = ((long)this.zze) / 1000L;
                            if(((zzb)object4).zzi()) {
                                v2 = ((long)this.zzd) / 1000L;
                            }
                            if(a0.containsKey(v1)) {
                                a0.put(v1, v2);
                            }
                            if(a1.containsKey(v1)) {
                                a1.put(v1, v2);
                            }
                        }
                    }
                }
                zzv zzv0 = new zzv(this, this.zza, ((zzl)object3), bitSet0, bitSet1, a0, a1, null);
                this.zzc.put(integer0, zzv0);
            }
        }
        if(!list0.isEmpty()) {
            zzx zzx0 = new zzx(this, null);
            a a2 = new a();
            for(Object object5: list0) {
                zze zzfi$zze0 = (zze)object5;
                zze zzfi$zze1 = zzx0.zza(this.zza, zzfi$zze0);
                if(zzfi$zze1 != null) {
                    zzao zzao0 = this.zzh();
                    String s1 = this.zza;
                    zzbc zzbc0 = zzao0.zzd(s1, "");
                    if(zzbc0 == null) {
                        zzao0.zzj().zzu().zza("Event aggregate wasn\'t created during raw event logging. appId, event", zzfr.zza(s1), zzao0.zzi().zza(""));
                        zzbc1 = new zzbc(s1, "", 1L, 1L, 1L, zzfi$zze0.zzd(), 0L, null, null, null, null);
                    }
                    else {
                        zzbc1 = new zzbc(zzbc0.zza, zzbc0.zzb, zzbc0.zzc + 1L, zzbc0.zzd + 1L, zzbc0.zze + 1L, zzbc0.zzf, zzbc0.zzg, zzbc0.zzh, zzbc0.zzi, zzbc0.zzj, zzbc0.zzk);
                    }
                    this.zzh().zza(zzbc1);
                    long v3 = zzbc1.zzc;
                    Map map4 = (Map)a2.get("");
                    if(map4 == null) {
                        map4 = this.zzh().zzf(this.zza, "");
                        a2.put("", map4);
                    }
                    for(Object object6: map4.keySet()) {
                        Integer integer1 = (Integer)object6;
                        int v4 = (int)integer1;
                        if(this.zzb.contains(integer1)) {
                            this.zzj().zzp().zza("Skipping failed audience ID", integer1);
                        }
                        else {
                            boolean z2 = true;
                            for(Object object7: ((List)map4.get(integer1))) {
                                zzx1 = zzx0;
                                zzz zzz0 = new zzz(this, this.zza, v4, ((zzb)object7));
                                a3 = a2;
                                z2 = zzz0.zza(this.zzd, this.zze, zzfi$zze1, v3, zzbc1, this.zza(v4, ((zzb)object7).zzb()));
                                if(z2) {
                                    this.zza(integer1).zza(zzz0);
                                    zzx0 = zzx1;
                                    a2 = a3;
                                    continue;
                                }
                                this.zzb.add(integer1);
                                goto label_132;
                            }
                            zzx1 = zzx0;
                            a3 = a2;
                        label_132:
                            if(!z2) {
                                this.zzb.add(integer1);
                            }
                            zzx0 = zzx1;
                            a2 = a3;
                        }
                    }
                }
            }
        }
        if(!list1.isEmpty()) {
            a a4 = new a();
            for(Object object8: list1) {
                zzn zzfi$zzn0 = (zzn)object8;
                Map map5 = (Map)a4.get("");
                if(map5 == null) {
                    map5 = this.zzh().zzg(this.zza, "");
                    a4.put("", map5);
                }
                Iterator iterator10 = map5.keySet().iterator();
            label_149:
                if(!iterator10.hasNext()) {
                    continue;
                }
                Object object9 = iterator10.next();
                Integer integer2 = (Integer)object9;
                int v5 = (int)integer2;
                if(this.zzb.contains(integer2)) {
                    this.zzj().zzp().zza("Skipping failed audience ID", integer2);
                    continue;
                }
                boolean z3 = true;
                for(Object object10: ((List)map5.get(integer2))) {
                    com.google.android.gms.internal.measurement.zzew.zze zzew$zze0 = (com.google.android.gms.internal.measurement.zzew.zze)object10;
                    if(this.zzj().zza(2)) {
                        this.zzj().zzp().zza("Evaluating filter. audience, filter, property", integer2, (zzew$zze0.zzi() ? zzew$zze0.zza() : null), this.zzi().zzc(""));
                        this.zzj().zzp().zza("Filter definition", this.g_().zza(zzew$zze0));
                    }
                    if(zzew$zze0.zzi() && zzew$zze0.zza() <= 0x100) {
                        zzab zzab0 = new zzab(this, this.zza, v5, zzew$zze0);
                        z3 = zzab0.zza(this.zzd, this.zze, zzfi$zzn0, this.zza(v5, zzew$zze0.zza()));
                        if(z3) {
                            this.zza(integer2).zza(zzab0);
                            continue;
                        }
                        this.zzb.add(integer2);
                        break;
                    }
                    this.zzj().zzu().zza("Invalid property filter ID. appId, id", zzfr.zza(this.zza), String.valueOf((zzew$zze0.zzi() ? zzew$zze0.zza() : null)));
                    z3 = false;
                    break;
                }
                if(z3) {
                    goto label_149;
                }
                this.zzb.add(integer2);
                goto label_149;
            }
        }
        List list3 = new ArrayList();
        Set set0 = this.zzc.keySet();
        set0.removeAll(this.zzb);
        for(Object object11: set0) {
            zzv zzv1 = (zzv)this.zzc.get(((Integer)object11));
            Preconditions.checkNotNull(zzv1);
            zzc zzfi$zzc0 = zzv1.zza(((int)(((Integer)object11))));
            list3.add(zzfi$zzc0);
            zzao zzao1 = this.zzh();
            String s2 = this.zza;
            zzl zzfi$zzl1 = zzfi$zzc0.zzd();
            zzao1.zzak();
            zzao1.zzt();
            Preconditions.checkNotEmpty(s2);
            Preconditions.checkNotNull(zzfi$zzl1);
            byte[] arr_b = zzfi$zzl1.zzbv();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("app_id", s2);
            contentValues0.put("audience_id", ((Integer)object11));
            contentValues0.put("current_results", arr_b);
            try {
                if(zzao1.e_().insertWithOnConflict("audience_filter_values", null, contentValues0, 5) != -1L) {
                    continue;
                }
                zzao1.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzfr.zza(s2));
            }
            catch(SQLiteException sQLiteException0) {
                zzao1.zzj().zzg().zza("Error storing filter results. appId", zzfr.zza(s2), sQLiteException0);
            }
        }
        return list3;
    }

    @Override  // com.google.android.gms.measurement.internal.zzmo
    protected final boolean zzc() {
        return false;
    }
}

