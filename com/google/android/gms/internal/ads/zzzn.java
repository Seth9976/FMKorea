package com.google.android.gms.internal.ads;

public final class zzzn implements Runnable {
    public final zzzv zza;
    public final Exception zzb;

    public zzzn(zzzv zzzv0, Exception exception0) {
        this.zza = zzzv0;
        this.zzb = exception0;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb);
    }
}

