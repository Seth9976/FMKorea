package com.google.android.gms.internal.ads;

public final class zzbxs implements Runnable {
    public final zzbyf zza;
    public final zzbye zzb;
    public final String zzc;

    public zzbxs(zzbyf zzbyf0, zzbye zzbye0, String s) {
        this.zza = zzbyf0;
        this.zzb = zzbye0;
        this.zzc = s;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}

