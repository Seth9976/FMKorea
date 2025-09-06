package com.google.android.gms.internal.ads;

public final class zzblt implements Runnable {
    public final zzblx zza;
    public final String zzb;

    public zzblt(zzblx zzblx0, String s) {
        this.zza = zzblx0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzn(this.zzb);
    }
}

