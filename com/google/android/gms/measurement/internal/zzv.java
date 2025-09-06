package com.google.android.gms.measurement.internal;

import androidx.collection.a;
import com.google.android.gms.internal.measurement.zzfi.zzc.zza;
import com.google.android.gms.internal.measurement.zzfi.zzc;
import com.google.android.gms.internal.measurement.zzfi.zzd;
import com.google.android.gms.internal.measurement.zzfi.zzl;
import com.google.android.gms.internal.measurement.zzfi.zzm;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzob;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzv {
    private String zza;
    private boolean zzb;
    private zzl zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map zzf;
    private Map zzg;
    private final zzt zzh;

    private zzv(zzt zzt0, String s) {
        this.zzh = zzt0;
        super();
        this.zza = s;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new a();
        this.zzg = new a();
    }

    private zzv(zzt zzt0, String s, zzl zzfi$zzl0, BitSet bitSet0, BitSet bitSet1, Map map0, Map map1) {
        this.zzh = zzt0;
        super();
        this.zza = s;
        this.zzd = bitSet0;
        this.zze = bitSet1;
        this.zzf = map0;
        this.zzg = new a();
        if(map1 != null) {
            for(Object object0: map1.keySet()) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(((Long)map1.get(((Integer)object0))));
                this.zzg.put(((Integer)object0), arrayList0);
            }
        }
        this.zzb = false;
        this.zzc = zzfi$zzl0;
    }

    zzv(zzt zzt0, String s, zzl zzfi$zzl0, BitSet bitSet0, BitSet bitSet1, Map map0, Map map1, zzy zzy0) {
        this(zzt0, s, zzfi$zzl0, bitSet0, bitSet1, map0, map1);
    }

    zzv(zzt zzt0, String s, zzy zzy0) {
        this(zzt0, s);
    }

    static BitSet zza(zzv zzv0) {
        return zzv0.zzd;
    }

    final zzc zza(int v) {
        List list0;
        ArrayList arrayList0;
        zza zzfi$zzc$zza0 = zzc.zzb();
        zzfi$zzc$zza0.zza(v);
        zzfi$zzc$zza0.zza(this.zzb);
        zzl zzfi$zzl0 = this.zzc;
        if(zzfi$zzl0 != null) {
            zzfi$zzc$zza0.zza(zzfi$zzl0);
        }
        com.google.android.gms.internal.measurement.zzfi.zzl.zza zzfi$zzl$zza0 = zzl.zze().zzb(zzmz.zza(this.zzd)).zzd(zzmz.zza(this.zze));
        if(this.zzf == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList(this.zzf.size());
            for(Object object0: this.zzf.keySet()) {
                int v1 = (int)(((Integer)object0));
                Long long0 = (Long)this.zzf.get(((Integer)object0));
                if(long0 != null) {
                    arrayList0.add(((zzd)(((zzix)zzd.zzc().zza(v1).zza(((long)long0)).zzab()))));
                }
            }
        }
        if(arrayList0 != null) {
            zzfi$zzl$zza0.zza(arrayList0);
        }
        if(this.zzg == null) {
            list0 = Collections.emptyList();
        }
        else {
            list0 = new ArrayList(this.zzg.size());
            for(Object object1: this.zzg.keySet()) {
                com.google.android.gms.internal.measurement.zzfi.zzm.zza zzfi$zzm$zza0 = zzm.zzc().zza(((int)(((Integer)object1))));
                List list1 = (List)this.zzg.get(((Integer)object1));
                if(list1 != null) {
                    Collections.sort(list1);
                    zzfi$zzm$zza0.zza(list1);
                }
                ((ArrayList)list0).add(((zzm)(((zzix)zzfi$zzm$zza0.zzab()))));
            }
        }
        zzfi$zzl$zza0.zzc(list0);
        zzfi$zzc$zza0.zza(zzfi$zzl$zza0);
        return (zzc)(((zzix)zzfi$zzc$zza0.zzab()));
    }

    final void zza(zzac zzac0) {
        int v = zzac0.zza();
        Boolean boolean0 = zzac0.zzc;
        if(boolean0 != null) {
            this.zze.set(v, boolean0.booleanValue());
        }
        Boolean boolean1 = zzac0.zzd;
        if(boolean1 != null) {
            this.zzd.set(v, boolean1.booleanValue());
        }
        if(zzac0.zze != null) {
            Long long0 = (Long)this.zzf.get(v);
            long v1 = (long)zzac0.zze;
            if(long0 == null || v1 / 1000L > ((long)long0)) {
                this.zzf.put(v, ((long)(v1 / 1000L)));
            }
        }
        if(zzac0.zzf != null) {
            List list0 = (List)this.zzg.get(v);
            if(list0 == null) {
                list0 = new ArrayList();
                this.zzg.put(v, list0);
            }
            if(zzac0.zzc()) {
                list0.clear();
            }
            if(zzob.zza() && this.zzh.zze().zzf(this.zza, zzbi.zzbg) && zzac0.zzb()) {
                list0.clear();
            }
            if(zzob.zza() && this.zzh.zze().zzf(this.zza, zzbi.zzbg)) {
                long v2 = (long)zzac0.zzf;
                if(!list0.contains(((long)(v2 / 1000L)))) {
                    list0.add(((long)(v2 / 1000L)));
                }
                return;
            }
            list0.add(((long)(((long)zzac0.zzf) / 1000L)));
        }
    }
}

