package com.google.android.gms.internal.ads;

public final class zzffp implements Runnable {
    public final zzffv zza;
    public final zzffj zzb;

    public zzffp(zzffv zzffv0, zzffj zzffj0) {
        this.zza = zzffv0;
        this.zzb = zzffj0;
    }

    @Override
    public final void run() {
        zzffw.zzc(this.zza.zza).zzc(this.zzb);
    }
}

