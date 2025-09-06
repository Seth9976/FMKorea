package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

final class zzcm implements Executor {
    static final zzcm zza;

    static {
        zzcm.zza = new zzcm();
    }

    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }
}

