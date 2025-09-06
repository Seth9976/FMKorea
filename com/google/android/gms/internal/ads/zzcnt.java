package com.google.android.gms.internal.ads;

public final class zzcnt implements Runnable {
    public final zzcob zza;
    public final Throwable zzb;

    public zzcnt(zzcob zzcob0, Throwable throwable0) {
        this.zza = zzcob0;
        this.zzb = throwable0;
    }

    @Override
    public final void run() {
        this.zza.zzh(this.zzb);
    }
}

