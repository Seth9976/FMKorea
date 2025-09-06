package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzfyd {
    private final boolean zza;
    private final zzfud zzb;

    zzfyd(boolean z, zzfud zzfud0, zzfyc zzfyc0) {
        this.zza = z;
        this.zzb = zzfud0;
    }

    public final d zza(Callable callable0, Executor executor0) {
        return new zzfxr(this.zzb, this.zza, executor0, callable0);
    }
}

