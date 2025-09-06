package com.google.android.gms.internal.ads;

public final class zzblv implements Runnable {
    public final zzblx zza;
    public final String zzb;

    public zzblv(zzblx zzblx0, String s) {
        this.zza = zzblx0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb);
    }
}

