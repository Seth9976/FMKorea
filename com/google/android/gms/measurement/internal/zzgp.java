package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.a;
import androidx.collection.e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzfc.zza.zze;
import com.google.android.gms.internal.measurement.zzfc.zzd.zza;
import com.google.android.gms.internal.measurement.zzfc.zzd;
import com.google.android.gms.internal.measurement.zzfp.zzc;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzji;
import com.google.android.gms.internal.measurement.zzv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public final class zzgp extends zzmo implements zzah {
    final e zza;
    final zzv zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    zzgp(zzmp zzmp0) {
        super(zzmp0);
        this.zzc = new a();
        this.zzd = new a();
        this.zze = new a();
        this.zzg = new a();
        this.zzh = new a();
        this.zzj = new a();
        this.zzk = new a();
        this.zzl = new a();
        this.zzi = new a();
        this.zza = new zzgv(this, 20);
        this.zzb = new zzgu(this);
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmz g_() {
        return super.g_();
    }

    static zzb zza(zzgp zzgp0, String s) {
        zzgp0.zzak();
        Preconditions.checkNotEmpty(s);
        if(!zzgp0.zzl(s)) {
            return null;
        }
        if(zzgp0.zzh.containsKey(s) && zzgp0.zzh.get(s) != null) {
            zzgp0.zza(s, ((zzd)zzgp0.zzh.get(s)));
            return (zzb)zzgp0.zza.snapshot().get(s);
        }
        zzgp0.zzv(s);
        return (zzb)zzgp0.zza.snapshot().get(s);
    }

    private final zzd zza(String s, byte[] arr_b) {
        if(arr_b == null) {
            return zzd.zzg();
        }
        try {
            zzd zzfc$zzd0 = (zzd)(((zzix)((zza)zzmz.zza(zzd.zze(), arr_b)).zzab()));
            zzft zzft0 = this.zzj().zzp();
            String s1 = null;
            Long long0 = zzfc$zzd0.zzs() ? zzfc$zzd0.zzc() : null;
            if(zzfc$zzd0.zzr()) {
                s1 = "";
            }
            zzft0.zza("Parsed config. version, gmp_app_id", long0, s1);
            return zzfc$zzd0;
        }
        catch(zzji zzji0) {
        }
        catch(RuntimeException runtimeException0) {
            this.zzj().zzu().zza("Unable to merge remote config. appId", zzfr.zza(s), runtimeException0);
            return zzd.zzg();
        }
        this.zzj().zzu().zza("Unable to merge remote config. appId", zzfr.zza(s), zzji0);
        return zzd.zzg();
    }

    private static com.google.android.gms.measurement.internal.zzih.zza zza(zze zzfc$zza$zze0) {
        switch(zzgw.zzb[zzfc$zza$zze0.ordinal()]) {
            case 1: {
                return com.google.android.gms.measurement.internal.zzih.zza.zza;
            }
            case 2: {
                return com.google.android.gms.measurement.internal.zzih.zza.zzb;
            }
            case 3: {
                return com.google.android.gms.measurement.internal.zzih.zza.zzc;
            }
            case 4: {
                return com.google.android.gms.measurement.internal.zzih.zza.zzd;
            }
            default: {
                return null;
            }
        }
    }

    private static Map zza(zzd zzfc$zzd0) {
        Map map0 = new a();
        if(zzfc$zzd0 != null) {
            Iterator iterator0 = zzfc$zzd0.zzo().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                map0.put("", "");
            }
        }
        return map0;
    }

    private final void zza(String s, zza zzfc$zzd$zza0) {
        HashSet hashSet0 = new HashSet();
        a a0 = new a();
        a a1 = new a();
        a a2 = new a();
        if(zzfc$zzd$zza0 != null) {
            Iterator iterator0 = zzfc$zzd$zza0.zze().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                hashSet0.add("");
            }
            for(int v = 0; v < zzfc$zzd$zza0.zza(); ++v) {
                com.google.android.gms.internal.measurement.zzfc.zzc.zza zzfc$zzc$zza0 = (com.google.android.gms.internal.measurement.zzfc.zzc.zza)zzfc$zzd$zza0.zza(v).zzby();
                this.zzj().zzu().zza("EventConfig contained null event name");
            }
        }
        this.zzd.put(s, hashSet0);
        this.zze.put(s, a0);
        this.zzg.put(s, a1);
        this.zzi.put(s, a2);
    }

    private final void zza(String s, zzd zzfc$zzd0) {
        if(zzfc$zzd0.zza() == 0) {
            this.zza.remove(s);
            return;
        }
        this.zzj().zzp().zza("EES programs found", zzfc$zzd0.zza());
        zzc zzfp$zzc0 = (zzc)zzfc$zzd0.zzn().get(0);
        try {
            zzb zzb0 = new zzb();
            zzb0.zza("internal.remoteConfig", new zzgq(this, s));
            zzb0.zza("internal.appMetadata", new zzgt(this, s));
            zzb0.zza("internal.logger", new zzgs(this));
            zzb0.zza(zzfp$zzc0);
            this.zza.put(s, zzb0);
            this.zzj().zzp().zza("EES program loaded for appId, activities", s, zzfp$zzc0.zza().zza());
            Iterator iterator0 = zzfp$zzc0.zza().zzd().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                this.zzj().zzp().zza("EES program activity", "");
            }
        }
        catch(com.google.android.gms.internal.measurement.zzc unused_ex) {
            this.zzj().zzg().zza("Failed to load EES program. appId", s);
        }
    }

    final long zza(String s) {
        String s1 = this.zza(s, "measurement.account.time_zone_offset_minutes");
        if(!TextUtils.isEmpty(s1)) {
            try {
                return Long.parseLong(s1);
            }
            catch(NumberFormatException numberFormatException0) {
                this.zzj().zzu().zza("Unable to parse timezone offset. appId", zzfr.zza(s), numberFormatException0);
            }
        }
        return 0L;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    final com.google.android.gms.measurement.internal.zzih.zza zza(String s, com.google.android.gms.measurement.internal.zzih.zza zzih$zza0) {
        this.zzt();
        this.zzv(s);
        com.google.android.gms.internal.measurement.zzfc.zza zzfc$zza0 = this.zzb(s);
        if(zzfc$zza0 == null) {
            return null;
        }
        for(Object object0: zzfc$zza0.zze()) {
            com.google.android.gms.internal.measurement.zzfc.zza.zzc zzfc$zza$zzc0 = (com.google.android.gms.internal.measurement.zzfc.zza.zzc)object0;
            if(zzih$zza0 == zzgp.zza(zzfc$zza$zzc0.zzc())) {
                return zzgp.zza(zzfc$zza$zzc0.zzb());
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzah
    public final String zza(String s, String s1) {
        this.zzt();
        this.zzv(s);
        Map map0 = (Map)this.zzc.get(s);
        return map0 == null ? null : ((String)map0.get(s1));
    }

    protected final boolean zza(String s, byte[] arr_b, String s1, String s2) {
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        zza zzfc$zzd$zza0 = (zza)this.zza(s, arr_b).zzby();
        if(zzfc$zzd$zza0 == null) {
            return false;
        }
        this.zza(s, zzfc$zzd$zza0);
        this.zza(s, ((zzd)(((zzix)zzfc$zzd$zza0.zzab()))));
        zzd zzfc$zzd0 = (zzd)(((zzix)zzfc$zzd$zza0.zzab()));
        this.zzh.put(s, zzfc$zzd0);
        this.zzj.put(s, "");
        this.zzk.put(s, s1);
        this.zzl.put(s, s2);
        Map map0 = zzgp.zza(((zzd)(((zzix)zzfc$zzd$zza0.zzab()))));
        this.zzc.put(s, map0);
        this.zzh().zza(s, new ArrayList(zzfc$zzd$zza0.zzd()));
        try {
            zzfc$zzd$zza0.zzb();
            arr_b = ((zzd)(((zzix)zzfc$zzd$zza0.zzab()))).zzbv();
        }
        catch(RuntimeException runtimeException0) {
            this.zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzfr.zza(s), runtimeException0);
        }
        zzao zzao0 = this.zzh();
        Preconditions.checkNotEmpty(s);
        zzao0.zzt();
        zzao0.zzak();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("remote_config", arr_b);
        contentValues0.put("config_last_modified_time", s1);
        contentValues0.put("e_tag", s2);
        try {
            if(((long)zzao0.e_().update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L) {
                zzao0.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzfr.zza(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzao0.zzj().zzg().zza("Error storing remote config. appId", zzfr.zza(s), sQLiteException0);
        }
        zzd zzfc$zzd1 = (zzd)(((zzix)zzfc$zzd$zza0.zzab()));
        this.zzh.put(s, zzfc$zzd1);
        return true;
    }

    final int zzb(String s, String s1) {
        this.zzt();
        this.zzv(s);
        Map map0 = (Map)this.zzi.get(s);
        if(map0 != null) {
            Integer integer0 = (Integer)map0.get(s1);
            return integer0 == null ? 1 : ((int)integer0);
        }
        return 1;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    final com.google.android.gms.internal.measurement.zzfc.zza zzb(String s) {
        this.zzt();
        this.zzv(s);
        zzd zzfc$zzd0 = this.zzc(s);
        return zzfc$zzd0 == null || !zzfc$zzd0.zzq() ? null : zzfc$zzd0.zzd();
    }

    final boolean zzb(String s, com.google.android.gms.measurement.internal.zzih.zza zzih$zza0) {
        this.zzt();
        this.zzv(s);
        com.google.android.gms.internal.measurement.zzfc.zza zzfc$zza0 = this.zzb(s);
        if(zzfc$zza0 == null) {
            return false;
        }
        for(Object object0: zzfc$zza0.zzd()) {
            com.google.android.gms.internal.measurement.zzfc.zza.zzb zzfc$zza$zzb0 = (com.google.android.gms.internal.measurement.zzfc.zza.zzb)object0;
            if(zzih$zza0 == zzgp.zza(zzfc$zza$zzb0.zzc())) {
                return zzfc$zza$zzb0.zzb() == com.google.android.gms.internal.measurement.zzfc.zza.zzd.zzb;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    protected final zzd zzc(String s) {
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        this.zzv(s);
        return (zzd)this.zzh.get(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzmo
    protected final boolean zzc() {
        return false;
    }

    final boolean zzc(String s, String s1) {
        this.zzt();
        this.zzv(s);
        if("ecommerce_purchase".equals(s1)) {
            return true;
        }
        if(!"purchase".equals(s1) && !"refund".equals(s1)) {
            Map map0 = (Map)this.zzg.get(s);
            if(map0 != null) {
                Boolean boolean0 = (Boolean)map0.get(s1);
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            return false;
        }
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return super.zzd();
    }

    protected final String zzd(String s) {
        this.zzt();
        return (String)this.zzl.get(s);
    }

    final boolean zzd(String s, String s1) {
        this.zzt();
        this.zzv(s);
        if(this.zzm(s) && zznd.zzg(s1)) {
            return true;
        }
        if(this.zzo(s) && zznd.zzh(s1)) {
            return true;
        }
        Map map0 = (Map)this.zze.get(s);
        if(map0 != null) {
            Boolean boolean0 = (Boolean)map0.get(s1);
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    protected final String zze(String s) {
        this.zzt();
        return (String)this.zzk.get(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    final String zzf(String s) {
        this.zzt();
        this.zzv(s);
        return (String)this.zzj.get(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzt zzg() {
        return super.zzg();
    }

    final Set zzg(String s) {
        this.zzt();
        this.zzv(s);
        return (Set)this.zzd.get(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzao zzh() {
        return super.zzh();
    }

    final SortedSet zzh(String s) {
        this.zzt();
        this.zzv(s);
        SortedSet sortedSet0 = new TreeSet();
        com.google.android.gms.internal.measurement.zzfc.zza zzfc$zza0 = this.zzb(s);
        if(zzfc$zza0 == null) {
            return sortedSet0;
        }
        Iterator iterator0 = zzfc$zza0.zzc().iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            sortedSet0.add("");
        }
        return sortedSet0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    protected final void zzi(String s) {
        this.zzt();
        this.zzk.put(s, null);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        return super.zzj();
    }

    final void zzj(String s) {
        this.zzt();
        this.zzh.remove(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    final boolean zzk(String s) {
        this.zzt();
        zzd zzfc$zzd0 = this.zzc(s);
        return zzfc$zzd0 == null ? false : zzfc$zzd0.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        return super.zzl();
    }

    public final boolean zzl(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        zzd zzfc$zzd0 = (zzd)this.zzh.get(s);
        return zzfc$zzd0 == null ? false : zzfc$zzd0.zza() != 0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzgp zzm() {
        return super.zzm();
    }

    final boolean zzm(String s) {
        return "1".equals(this.zza(s, "measurement.upload.blacklist_internal"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzls zzn() {
        return super.zzn();
    }

    final boolean zzn(String s) {
        this.zzt();
        this.zzv(s);
        com.google.android.gms.internal.measurement.zzfc.zza zzfc$zza0 = this.zzb(s);
        return zzfc$zza0 == null ? true : !zzfc$zza0.zzg() || zzfc$zza0.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmn zzo() {
        return super.zzo();
    }

    final boolean zzo(String s) {
        return "1".equals(this.zza(s, "measurement.upload.blacklist_public"));
    }

    final boolean zzp(String s) {
        this.zzt();
        this.zzv(s);
        return this.zzd.get(s) != null && ((Set)this.zzd.get(s)).contains("app_instance_id");
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    final boolean zzq(String s) {
        this.zzt();
        this.zzv(s);
        return this.zzd.get(s) != null && (((Set)this.zzd.get(s)).contains("device_model") || ((Set)this.zzd.get(s)).contains("device_info"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzr() {
        super.zzr();
    }

    final boolean zzr(String s) {
        this.zzt();
        this.zzv(s);
        return this.zzd.get(s) != null && ((Set)this.zzd.get(s)).contains("enhanced_user_id");
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzs() {
        super.zzs();
    }

    final boolean zzs(String s) {
        this.zzt();
        this.zzv(s);
        return this.zzd.get(s) != null && ((Set)this.zzd.get(s)).contains("google_signals");
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzt() {
        super.zzt();
    }

    final boolean zzt(String s) {
        this.zzt();
        this.zzv(s);
        return this.zzd.get(s) != null && (((Set)this.zzd.get(s)).contains("os_version") || ((Set)this.zzd.get(s)).contains("device_info"));
    }

    final boolean zzu(String s) {
        this.zzt();
        this.zzv(s);
        return this.zzd.get(s) != null && ((Set)this.zzd.get(s)).contains("user_id");
    }

    private final void zzv(String s) {
        this.zzak();
        this.zzt();
        Preconditions.checkNotEmpty(s);
        if(this.zzh.get(s) == null) {
            zzaq zzaq0 = this.zzh().zze(s);
            if(zzaq0 == null) {
                this.zzc.put(s, null);
                this.zze.put(s, null);
                this.zzd.put(s, null);
                this.zzg.put(s, null);
                this.zzh.put(s, null);
                this.zzj.put(s, null);
                this.zzk.put(s, null);
                this.zzl.put(s, null);
                this.zzi.put(s, null);
                return;
            }
            zza zzfc$zzd$zza0 = (zza)this.zza(s, zzaq0.zza).zzby();
            this.zza(s, zzfc$zzd$zza0);
            Map map0 = zzgp.zza(((zzd)(((zzix)zzfc$zzd$zza0.zzab()))));
            this.zzc.put(s, map0);
            zzd zzfc$zzd0 = (zzd)(((zzix)zzfc$zzd$zza0.zzab()));
            this.zzh.put(s, zzfc$zzd0);
            this.zza(s, ((zzd)(((zzix)zzfc$zzd$zza0.zzab()))));
            this.zzj.put(s, "");
            this.zzk.put(s, zzaq0.zzb);
            this.zzl.put(s, zzaq0.zzc);
        }
    }
}

