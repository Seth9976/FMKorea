package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

public final class zzfj implements ThreadFactory {
    public final String zza;

    public zzfj(String s) {
        this.zza = s;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, this.zza);
    }
}

