package com.google.android.gms.internal.ads;

final class zzbte implements Thread.UncaughtExceptionHandler {
    final Thread.UncaughtExceptionHandler zza;
    final zzbtf zzb;

    zzbte(zzbtf zzbtf0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        this.zzb = zzbtf0;
        this.zza = thread$UncaughtExceptionHandler0;
        super();
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler1;
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0;
        try {
            this.zzb.zze(thread0, throwable0);
            thread$UncaughtExceptionHandler0 = this.zza;
        }
        catch(Throwable unused_ex) {
            try {
                zzcaa.zzg("AdMob exception reporter failed reporting the exception.");
                thread$UncaughtExceptionHandler1 = this.zza;
            }
            catch(Throwable throwable1) {
                Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler2 = this.zza;
                if(thread$UncaughtExceptionHandler2 != null) {
                    thread$UncaughtExceptionHandler2.uncaughtException(thread0, throwable0);
                }
                throw throwable1;
            }
            if(thread$UncaughtExceptionHandler1 != null) {
                thread$UncaughtExceptionHandler1.uncaughtException(thread0, throwable0);
                return;
            }
            return;
        }
        if(thread$UncaughtExceptionHandler0 != null) {
            thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
        }
    }
}

