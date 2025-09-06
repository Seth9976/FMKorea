package com.google.android.gms.internal.ads;

final class zzcbw implements Runnable {
    final boolean zza;
    final zzcbx zzb;

    zzcbw(zzcbx zzcbx0, boolean z) {
        this.zzb = zzcbx0;
        this.zza = z;
        super();
    }

    @Override
    public final void run() {
        zzcbx.zzm(this.zzb, "windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}

