package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzbzp {
    public static final ThreadPoolExecutor zza;
    public static final ExecutorService zzb;

    static {
        zzbzp.zza = new ThreadPoolExecutor(2, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzo("ClientDefault"));
        zzbzp.zzb = Executors.newSingleThreadExecutor(new zzbzo("ClientSingle"));
    }
}

