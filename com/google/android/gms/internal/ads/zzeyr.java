package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;

final class zzeyr {
    private final zzfdn zza;
    private final zzcvp zzb;
    private final Executor zzc;
    private zzeyq zzd;

    public zzeyr(zzfdn zzfdn0, zzcvp zzcvp0, Executor executor0) {
        this.zza = zzfdn0;
        this.zzb = zzcvp0;
        this.zzc = executor0;
    }

    static zzeyq zza(zzeyr zzeyr0) {
        return zzeyr0.zzd;
    }

    static zzfdx zzb(zzeyr zzeyr0) {
        return zzeyr0.zze();
    }

    public final d zzc() {
        zzeyq zzeyq0 = this.zzd;
        if(zzeyq0 == null) {
            if(!((Boolean)zzbdq.zza.zze()).booleanValue()) {
                zzeyq zzeyq1 = new zzeyq(null, this.zze(), null);
                this.zzd = zzeyq1;
                return zzfye.zzm(zzfye.zzh(zzeyq1), (Object object0) -> ((zzeyq)object0), this.zzc);
            }
            d d0 = zzfye.zzm(zzfxv.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzeyo(this), this.zzc);
            zzeyn zzeyn0 = new zzeyn(this);
            return zzfye.zzm(zzfye.zze(d0, zzdxh.class, zzeyn0, this.zzc), (Object object0) -> ((zzeyq)object0), this.zzc);
        }
        return zzfye.zzh(zzeyq0);
    }

    static void zzd(zzeyr zzeyr0, zzeyq zzeyq0) {
        zzeyr0.zzd = zzeyq0;
    }

    @Deprecated
    private final zzfdx zze() {
        zzfca zzfca0 = this.zzb.zzg();
        return this.zza.zzc(zzfca0.zzd, zzfca0.zzf, zzfca0.zzj);
    }
}

