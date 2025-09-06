package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class zzfyn extends AtomicReference implements Runnable {
    private static final Runnable zza;
    private static final Runnable zzb;

    static {
        zzfyn.zza = new zzfym(null);
        zzfyn.zzb = new zzfym(null);
    }

    @Override
    public final void run() {
        Thread thread0 = Thread.currentThread();
        Object object0 = null;
        if(!this.compareAndSet(null, thread0)) {
            return;
        }
        boolean z = this.zzg();
        if(!z) {
            try {
                object0 = this.zza();
            }
            catch(Throwable throwable0) {
                try {
                    zzfyv.zza(throwable0);
                }
                catch(Throwable throwable1) {
                    if(!this.compareAndSet(thread0, zzfyn.zza)) {
                        this.zzc(thread0);
                    }
                    this.zze(null);
                    throw throwable1;
                }
                if(!this.compareAndSet(thread0, zzfyn.zza)) {
                    this.zzc(thread0);
                }
                this.zzd(throwable0);
                return;
            }
        }
        if(!this.compareAndSet(thread0, zzfyn.zza)) {
            this.zzc(thread0);
        }
        if(!z) {
            this.zze(object0);
        }
    }

    @Override
    public final String toString() {
        Runnable runnable0 = (Runnable)this.get();
        if(runnable0 == zzfyn.zza) {
            return "running=[DONE], " + this.zzb();
        }
        if(runnable0 instanceof zzfyk) {
            return "running=[INTERRUPTED], " + this.zzb();
        }
        return runnable0 instanceof Thread ? "running=[RUNNING ON " + ((Thread)runnable0).getName() + "]" + ", " + this.zzb() : "running=[NOT STARTED YET], " + this.zzb();
    }

    abstract Object zza();

    abstract String zzb();

    private final void zzc(Thread thread0) {
        Runnable runnable0 = (Runnable)this.get();
        zzfyk zzfyk0 = null;
        boolean z = false;
        int v = 0;
        while(true) {
            if(runnable0 instanceof zzfyk) {
                zzfyk0 = (zzfyk)runnable0;
            }
            else if(runnable0 != zzfyn.zzb) {
                break;
            }
            ++v;
            if(v <= 1000) {
                Thread.yield();
            }
            else if(runnable0 == zzfyn.zzb || this.compareAndSet(runnable0, zzfyn.zzb)) {
                z = Thread.interrupted() || z;
                LockSupport.park(zzfyk0);
            }
            runnable0 = (Runnable)this.get();
        }
        if(z) {
            thread0.interrupt();
        }
    }

    abstract void zzd(Throwable arg1);

    abstract void zze(Object arg1);

    abstract boolean zzg();

    final void zzh() {
        Thread thread0;
        Runnable runnable0 = (Runnable)this.get();
        if(runnable0 instanceof Thread) {
            zzfyk zzfyk0 = new zzfyk(this, null);
            zzfyk.zza(zzfyk0, Thread.currentThread());
            if(this.compareAndSet(runnable0, zzfyk0)) {
                try {
                    thread0 = (Thread)runnable0;
                    thread0.interrupt();
                }
                catch(Throwable throwable0) {
                    if(((Runnable)this.getAndSet(zzfyn.zza)) == zzfyn.zzb) {
                        LockSupport.unpark(((Thread)runnable0));
                    }
                    throw throwable0;
                }
                if(((Runnable)this.getAndSet(zzfyn.zza)) == zzfyn.zzb) {
                    LockSupport.unpark(thread0);
                }
            }
        }
    }
}

