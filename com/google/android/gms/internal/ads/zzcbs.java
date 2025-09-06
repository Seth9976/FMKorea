package com.google.android.gms.internal.ads;

public final class zzcbs implements Runnable {
    public final zzcbx zza;
    public final boolean zzb;

    public zzcbs(zzcbx zzcbx0, boolean z) {
        this.zza = zzcbx0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzq(this.zzb);
    }
}

