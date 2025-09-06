package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

final class zzdti extends zzbkr {
    final Object zza;
    final String zzb;
    final long zzc;
    final zzfhg zzd;
    final zzcas zze;
    final zzdtj zzf;

    zzdti(zzdtj zzdtj0, Object object0, String s, long v, zzfhg zzfhg0, zzcas zzcas0) {
        this.zzf = zzdtj0;
        this.zza = object0;
        this.zzb = s;
        this.zzc = v;
        this.zzd = zzfhg0;
        this.zze = zzcas0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbks
    public final void zze(String s) {
        synchronized(this.zza) {
            long v1 = zzt.zzB().elapsedRealtime();
            zzdtj.zzk(this.zzf, this.zzb, false, s, ((int)(v1 - this.zzc)));
            zzdtj.zzd(this.zzf).zzb(this.zzb, "error");
            zzdtj.zzc(this.zzf).zzb(this.zzb, "error");
            this.zzd.zzc(s);
            this.zzd.zzf(false);
            zzdtj.zze(this.zzf).zzb(this.zzd.zzl());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbks
    public final void zzf() {
        synchronized(this.zza) {
            long v1 = zzt.zzB().elapsedRealtime();
            zzdtj.zzk(this.zzf, this.zzb, true, "", ((int)(v1 - this.zzc)));
            zzdtj.zzd(this.zzf).zzd(this.zzb);
            zzdtj.zzc(this.zzf).zzd(this.zzb);
            this.zzd.zzf(true);
            zzdtj.zze(this.zzf).zzb(this.zzd.zzl());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}

