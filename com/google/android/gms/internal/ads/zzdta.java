package com.google.android.gms.internal.ads;

public final class zzdta implements Runnable {
    public final zzdtj zza;
    public final Object zzb;
    public final zzcas zzc;
    public final String zzd;
    public final long zze;
    public final zzfhg zzf;

    public zzdta(zzdtj zzdtj0, Object object0, zzcas zzcas0, String s, long v, zzfhg zzfhg0) {
        this.zza = zzdtj0;
        this.zzb = object0;
        this.zzc = zzcas0;
        this.zzd = s;
        this.zze = v;
        this.zzf = zzfhg0;
    }

    @Override
    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

