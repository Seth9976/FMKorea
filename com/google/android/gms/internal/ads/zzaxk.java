package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class zzaxk {
    zzaua zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzaxk() {
        this.zzc = zzbzp.zzb;
    }

    public zzaxk(Context context0) {
        this.zzc = zzbzp.zzb;
        zzaxf zzaxf0 = new zzaxf(this, context0);
        zzbzp.zzb.execute(zzaxf0);
    }

    static ExecutorService zza(zzaxk zzaxk0) {
        return zzaxk0.zzc;
    }
}

