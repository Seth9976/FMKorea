package com.google.android.gms.ads.internal.util;

import Z1.d;
import com.google.android.gms.internal.ads.zzcan;

public abstract class zzb {
    private final Runnable zza;
    private volatile Thread zzb;

    public zzb() {
        this.zza = new zza(this);
    }

    public abstract void zza();

    public d zzb() {
        return zzcan.zza.zza(this.zza);
    }
}

