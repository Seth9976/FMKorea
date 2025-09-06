package com.google.android.gms.internal.ads;

public final class zzcny implements Runnable {
    public final zzcoa zza;
    public final Throwable zzb;
    public final zzfik zzc;
    public final String zzd;

    public zzcny(zzcoa zzcoa0, Throwable throwable0, zzfik zzfik0, String s) {
        this.zza = zzcoa0;
        this.zzb = throwable0;
        this.zzc = zzfik0;
        this.zzd = s;
    }

    @Override
    public final void run() {
        zzbth zzbth0 = zzbtf.zza(zzcob.zza(this.zza.zzc));
        zzcob.zzg(this.zza.zzc, zzbth0);
        zzcob.zzb(this.zza.zzc).zzf(this.zzb, "AttributionReporting.registerSourceAndPingClickUrl");
        this.zzc.zzc(this.zzd, null);
    }
}

