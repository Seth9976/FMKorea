package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgy extends zzic {
    private static final AtomicLong zza;
    private zzhc zzb;
    private zzhc zzc;
    private final PriorityBlockingQueue zzd;
    private final BlockingQueue zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    static {
        zzgy.zza = new AtomicLong(0x8000000000000000L);
    }

    zzgy(zzhf zzhf0) {
        super(zzhf0);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzha(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzha(this, "Thread death: Uncaught exception on network thread");
    }

    static void zza(zzgy zzgy0, zzhc zzhc0) {
        zzgy0.zzc = null;
    }

    private final void zza(zzhd zzhd0) {
        synchronized(this.zzh) {
            this.zzd.add(zzhd0);
            zzhc zzhc0 = this.zzb;
            if(zzhc0 == null) {
                zzhc zzhc1 = new zzhc(this, "Measurement Worker", this.zzd);
                this.zzb = zzhc1;
                zzhc1.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            }
            else {
                zzhc0.zza();
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Context zza() {
        return super.zza();
    }

    final Object zza(AtomicReference atomicReference0, long v, String s, Runnable runnable0) {
        synchronized(atomicReference0) {
            this.zzl().zzb(runnable0);
            try {
                atomicReference0.wait(v);
            }
            catch(InterruptedException unused_ex) {
                this.zzj().zzu().zza("Interrupted waiting for " + s);
                return null;
            }
        }
        Object object0 = atomicReference0.get();
        if(object0 == null) {
            this.zzj().zzu().zza("Timed out waiting for " + s);
        }
        return object0;
    }

    public final Future zza(Callable callable0) {
        this.zzab();
        Preconditions.checkNotNull(callable0);
        Future future0 = new zzhd(this, callable0, false, "Task exception on worker thread");
        if(Thread.currentThread() == this.zzb) {
            if(!this.zzd.isEmpty()) {
                this.zzj().zzu().zza("Callable skipped the worker queue.");
            }
            ((FutureTask)future0).run();
            return future0;
        }
        this.zza(((zzhd)future0));
        return future0;
    }

    public final void zza(Runnable runnable0) {
        this.zzab();
        Preconditions.checkNotNull(runnable0);
        zzhd zzhd0 = new zzhd(this, runnable0, false, "Task exception on network thread");
        synchronized(this.zzh) {
            this.zze.add(zzhd0);
            zzhc zzhc0 = this.zzc;
            if(zzhc0 == null) {
                zzhc zzhc1 = new zzhc(this, "Measurement Network", this.zze);
                this.zzc = zzhc1;
                zzhc1.setUncaughtExceptionHandler(this.zzg);
                this.zzc.start();
            }
            else {
                zzhc0.zza();
            }
        }
    }

    static void zzb(zzgy zzgy0, zzhc zzhc0) {
        zzgy0.zzb = null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Clock zzb() {
        return super.zzb();
    }

    public final Future zzb(Callable callable0) {
        this.zzab();
        Preconditions.checkNotNull(callable0);
        Future future0 = new zzhd(this, callable0, true, "Task exception on worker thread");
        if(Thread.currentThread() == this.zzb) {
            ((FutureTask)future0).run();
            return future0;
        }
        this.zza(((zzhd)future0));
        return future0;
    }

    public final void zzb(Runnable runnable0) {
        this.zzab();
        Preconditions.checkNotNull(runnable0);
        this.zza(new zzhd(this, runnable0, false, "Task exception on worker thread"));
    }

    public final void zzc(Runnable runnable0) {
        this.zzab();
        Preconditions.checkNotNull(runnable0);
        this.zza(new zzhd(this, runnable0, true, "Task exception on worker thread"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzae zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    public final boolean zzg() {
        return Thread.currentThread() == this.zzb;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgy zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzic
    protected final boolean zzo() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzr() {
        if(Thread.currentThread() != this.zzc) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzt() {
        if(Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}

