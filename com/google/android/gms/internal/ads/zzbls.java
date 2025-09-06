package com.google.android.gms.internal.ads;

public final class zzbls implements Runnable {
    public final zzblx zza;
    public final String zzb;

    public zzbls(zzblx zzblx0, String s) {
        this.zza = zzblx0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb);
    }
}

