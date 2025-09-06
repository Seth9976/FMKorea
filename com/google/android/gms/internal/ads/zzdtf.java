package com.google.android.gms.internal.ads;

public final class zzdtf implements Runnable {
    public final zzdtj zza;
    public final zzcas zzb;

    public zzdtf(zzdtj zzdtj0, zzcas zzcas0) {
        this.zza = zzdtj0;
        this.zzb = zzcas0;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb);
    }
}

