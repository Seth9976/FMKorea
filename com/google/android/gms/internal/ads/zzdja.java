package com.google.android.gms.internal.ads;

public final class zzdja implements Runnable {
    public final zzdjc zza;
    public final zzdjy zzb;

    public zzdja(zzdjc zzdjc0, zzdjy zzdjy0) {
        this.zza = zzdjc0;
        this.zzb = zzdjy0;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb);
    }
}

