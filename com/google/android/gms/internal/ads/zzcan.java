package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzcan {
    public static final zzfyo zza;
    public static final zzfyo zzb;
    public static final zzfyo zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfyo zze;
    public static final zzfyo zzf;

    static {
        zzcan.zza = new zzcam(new ThreadPoolExecutor(2, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcaj("Default")), null);
        ExecutorService executorService0 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaj("Loader"));
        ((ThreadPoolExecutor)executorService0).allowCoreThreadTimeOut(true);
        zzcan.zzb = new zzcam(executorService0, null);
        ExecutorService executorService1 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaj("Activeview"));
        ((ThreadPoolExecutor)executorService1).allowCoreThreadTimeOut(true);
        zzcan.zzc = new zzcam(executorService1, null);
        zzcan.zzd = new zzcai(3, new zzcaj("Schedule"));
        zzcan.zze = new zzcam(new zzcak(), null);
        zzcan.zzf = new zzcam(zzfyu.zzb(), null);
    }
}

