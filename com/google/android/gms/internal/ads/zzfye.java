package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzfye extends zzfyg {
    public static zzfyd zza(Iterable iterable0) {
        return new zzfyd(false, zzfud.zzj(((Collection)iterable0)), null);
    }

    public static zzfyd zzb(Iterable iterable0) {
        iterable0.getClass();
        return new zzfyd(true, zzfud.zzj(((Collection)iterable0)), null);
    }

    @SafeVarargs
    public static zzfyd zzc(d[] arr_d) {
        return new zzfyd(true, zzfud.zzk(arr_d), null);
    }

    public static d zzd(Iterable iterable0) {
        return new zzfxm(zzfud.zzj(((Collection)iterable0)), true);
    }

    public static d zze(d d0, Class class0, zzfqw zzfqw0, Executor executor0) {
        d d1 = new zzfwp(d0, class0, zzfqw0);
        d0.addListener(((Runnable)d1), zzfyu.zzc(executor0, ((zzfws)d1)));
        return d1;
    }

    public static d zzf(d d0, Class class0, zzfxl zzfxl0, Executor executor0) {
        d d1 = new zzfwo(d0, class0, zzfxl0);
        d0.addListener(((Runnable)d1), zzfyu.zzc(executor0, ((zzfws)d1)));
        return d1;
    }

    public static d zzg(Throwable throwable0) {
        throwable0.getClass();
        return new zzfyh(throwable0);
    }

    public static d zzh(Object object0) {
        return object0 == null ? zzfyi.zza : new zzfyi(object0);
    }

    public static d zzi() {
        return zzfyi.zza;
    }

    public static d zzj(Callable callable0, Executor executor0) {
        d d0 = new zzfzd(callable0);
        executor0.execute(((Runnable)d0));
        return d0;
    }

    public static d zzk(zzfxk zzfxk0, Executor executor0) {
        d d0 = new zzfzd(zzfxk0);
        executor0.execute(((Runnable)d0));
        return d0;
    }

    @SafeVarargs
    public static d zzl(d[] arr_d) {
        return new zzfxm(zzfud.zzk(arr_d), false);
    }

    public static d zzm(d d0, zzfqw zzfqw0, Executor executor0) {
        d d1 = new zzfwz(d0, zzfqw0);
        d0.addListener(((Runnable)d1), zzfyu.zzc(executor0, ((zzfws)d1)));
        return d1;
    }

    public static d zzn(d d0, zzfxl zzfxl0, Executor executor0) {
        executor0.getClass();
        d d1 = new zzfwy(d0, zzfxl0);
        d0.addListener(((Runnable)d1), zzfyu.zzc(executor0, ((zzfws)d1)));
        return d1;
    }

    // 去混淆评级： 低(20)
    public static d zzo(d d0, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        return d0.isDone() ? d0 : zzfza.zzf(d0, v, timeUnit0, scheduledExecutorService0);
    }

    public static Object zzp(Future future0) {
        if(!future0.isDone()) {
            throw new IllegalStateException(zzfrx.zzb("Future was expected to be done: %s", new Object[]{future0}));
        }
        return zzfzf.zza(future0);
    }

    public static Object zzq(Future future0) {
        try {
            return zzfzf.zza(future0);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 instanceof Error) {
                throw new zzfxt(((Error)throwable0));
            }
            throw new zzfze(throwable0);
        }
    }

    public static void zzr(d d0, zzfya zzfya0, Executor executor0) {
        zzfya0.getClass();
        d0.addListener(new zzfyb(d0, zzfya0), executor0);
    }
}

