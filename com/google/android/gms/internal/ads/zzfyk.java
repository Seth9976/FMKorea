package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

final class zzfyk extends AbstractOwnableSynchronizer implements Runnable {
    private final zzfyn zza;

    zzfyk(zzfyn zzfyn0, zzfyj zzfyj0) {
        this.zza = zzfyn0;
    }

    @Override
    public final void run() {
    }

    @Override
    public final String toString() {
        return this.zza.toString();
    }

    static void zza(zzfyk zzfyk0, Thread thread0) {
        zzfyk0.super.setExclusiveOwnerThread(thread0);
    }
}

