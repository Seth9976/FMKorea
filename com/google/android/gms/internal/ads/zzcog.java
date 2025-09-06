package com.google.android.gms.internal.ads;

public final class zzcog implements Runnable {
    public final zzcon zza;
    public final int zzb;
    public final int zzc;

    public zzcog(zzcon zzcon0, int v, int v1) {
        this.zza = zzcon0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb, this.zzc);
    }
}

