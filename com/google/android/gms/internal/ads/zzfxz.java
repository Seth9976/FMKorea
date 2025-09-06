package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class zzfxz extends zzfxx implements d {
    @Override  // Z1.d
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.zzc().addListener(runnable0, executor0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxx
    protected Future zzb() {
        throw null;
    }

    protected abstract d zzc();
}

