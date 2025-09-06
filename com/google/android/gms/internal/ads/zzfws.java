package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzfws extends zzfzg implements d {
    private volatile zzfws.zzd listeners;
    private volatile Object value;
    private volatile zzfws.zzk waiters;
    private static final Logger zzaZ;
    private static final zzfws.zza zzba;
    private static final Object zzbd;
    static final boolean zzd;

    static {
        Throwable throwable1;
        Throwable throwable0;
        zzfws.zzj zzfws$zzj0;
        Class class0 = zzfws.zzk.class;
        zzfws.zzd = false;
        Class class1 = zzfws.class;
        zzfws.zzaZ = Logger.getLogger("com.google.android.gms.internal.ads.zzfws");
        try {
            zzfws$zzj0 = new zzfws.zzj(null);
            throwable0 = null;
            throwable1 = null;
        }
        catch(RuntimeException | Error runtimeException0) {
            try {
                throwable1 = null;
                throwable0 = runtimeException0;
                zzfws$zzj0 = new zzfws.zze(AtomicReferenceFieldUpdater.newUpdater(class0, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(class0, class0, "next"), AtomicReferenceFieldUpdater.newUpdater(class1, class0, "waiters"), AtomicReferenceFieldUpdater.newUpdater(class1, zzfws.zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(class1, Object.class, "value"));
            }
            catch(RuntimeException | Error runtimeException1) {
                throwable1 = runtimeException1;
                throwable0 = runtimeException0;
                zzfws$zzj0 = new zzfws.zzg(null);
            }
        }
        zzfws.zzba = zzfws$zzj0;
        if(throwable1 != null) {
            Level level0 = Level.SEVERE;
            zzfws.zzaZ.logp(level0, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", throwable0);
            zzfws.zzaZ.logp(level0, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", throwable1);
        }
        zzfws.zzbd = new Object();
    }

    @Override  // Z1.d
    public void addListener(Runnable runnable0, Executor executor0) {
        zzfri.zzc(runnable0, "Runnable was null.");
        zzfri.zzc(executor0, "Executor was null.");
        if(!this.isDone()) {
            zzfws.zzd zzfws$zzd0 = this.listeners;
            if(zzfws$zzd0 != zzfws.zzd.zza) {
                zzfws.zzd zzfws$zzd1 = new zzfws.zzd(runnable0, executor0);
                while(true) {
                    zzfws$zzd1.next = zzfws$zzd0;
                    if(zzfws.zzba.zze(this, zzfws$zzd0, zzfws$zzd1)) {
                        return;
                    }
                    zzfws$zzd0 = this.listeners;
                    if(zzfws$zzd0 == zzfws.zzd.zza) {
                        break;
                    }
                }
            }
        }
        zzfws.zzy(runnable0, executor0);
    }

    @Override
    public boolean cancel(boolean z) {
        zzfws.zzb zzfws$zzb0;
        Object object0 = this.value;
        if((object0 instanceof zzfws.zzf | object0 == null) != 0) {
            if(zzfws.zzd) {
                zzfws$zzb0 = new zzfws.zzb(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                zzfws$zzb0 = z ? zzfws.zzb.zza : zzfws.zzb.zzb;
                zzfws$zzb0.getClass();
            }
            zzfws zzfws0 = this;
            boolean z1 = false;
            while(true) {
                if(zzfws.zzba.zzf(zzfws0, object0, zzfws$zzb0)) {
                    zzfws.zzx(zzfws0, z);
                    if(object0 instanceof zzfws.zzf) {
                        d d0 = ((zzfws.zzf)object0).zzb;
                        if(!(d0 instanceof zzfws.zzh)) {
                            d0.cancel(z);
                            return true;
                        }
                        zzfws0 = (zzfws)d0;
                        object0 = zzfws0.value;
                        if((object0 == null | object0 instanceof zzfws.zzf) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = zzfws0.value;
                if(!(object0 instanceof zzfws.zzf)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    @Override
    public Object get() {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.value;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof zzfws.zzf)) != 0) {
            return zzfws.zzA(object0);
        }
        zzfws.zzk zzfws$zzk0 = this.waiters;
        if(zzfws$zzk0 != zzfws.zzk.zza) {
            zzfws.zzk zzfws$zzk1 = new zzfws.zzk();
            while(true) {
                zzfws.zzba.zzc(zzfws$zzk1, zzfws$zzk0);
                if(zzfws.zzba.zzg(this, zzfws$zzk0, zzfws$zzk1)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.value;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof zzfws.zzf)) != 0) {
                            return zzfws.zzA(object1);
                        }
                    }
                    this.zzz(zzfws$zzk1);
                    throw new InterruptedException();
                }
                zzfws$zzk0 = this.waiters;
                if(zzfws$zzk0 == zzfws.zzk.zza) {
                    break;
                }
            }
        }
        Object object2 = this.value;
        object2.getClass();
        return zzfws.zzA(object2);
    }

    @Override
    public Object get(long v, TimeUnit timeUnit0) {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.value;
        boolean z = true;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof zzfws.zzf)) != 0) {
            return zzfws.zzA(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            zzfws.zzk zzfws$zzk0 = this.waiters;
            if(zzfws$zzk0 != zzfws.zzk.zza) {
                zzfws.zzk zzfws$zzk1 = new zzfws.zzk();
                while(true) {
                    zzfws.zzba.zzc(zzfws$zzk1, zzfws$zzk0);
                    if(zzfws.zzba.zzg(this, zzfws$zzk0, zzfws$zzk1)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(v1, 0x1DCD64FFFFFFFFFFL));
                            if(Thread.interrupted()) {
                                this.zzz(zzfws$zzk1);
                                throw new InterruptedException();
                            }
                            Object object1 = this.value;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof zzfws.zzf)) != 0) {
                                return zzfws.zzA(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.zzz(zzfws$zzk1);
                        goto label_29;
                    }
                    zzfws$zzk0 = this.waiters;
                    if(zzfws$zzk0 == zzfws.zzk.zza) {
                        break;
                    }
                }
            }
            Object object2 = this.value;
            object2.getClass();
            return zzfws.zzA(object2);
        }
    label_29:
        while(v1 > 0L) {
            Object object3 = this.value;
            if(((object3 == null ? 0 : 1) & !(object3 instanceof zzfws.zzf)) != 0) {
                return zzfws.zzA(object3);
            }
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }
            v1 = v2 - System.nanoTime();
        }
        String s = this.toString();
        Locale locale0 = Locale.ROOT;
        String s1 = timeUnit0.toString().toLowerCase(locale0);
        String s2 = "Waited " + v + " " + timeUnit0.toString().toLowerCase(locale0);
        if(v1 + 1000L < 0L) {
            String s3 = s2 + " (plus ";
            long v3 = timeUnit0.convert(-v1, TimeUnit.NANOSECONDS);
            long v4 = -v1 - timeUnit0.toNanos(v3);
            int v5 = Long.compare(v3, 0L);
            if(v5 != 0 && v4 <= 1000L) {
                z = false;
            }
            if(v5 > 0) {
                s3 = (z ? s3 + v3 + " " + s1 + "," : s3 + v3 + " " + s1) + " ";
            }
            if(z) {
                s3 = s3 + v4 + " nanoseconds ";
            }
            s2 = s3 + "delay)";
        }
        throw this.isDone() ? new TimeoutException(s2 + " but future completed as timeout expired") : new TimeoutException(s2 + " for " + s);
    }

    @Override
    public boolean isCancelled() {
        return this.value instanceof zzfws.zzb;
    }

    @Override
    public boolean isDone() {
        return this.value == null ? 0 : 1 & !(this.value instanceof zzfws.zzf);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            stringBuilder0.append(this.getClass().getSimpleName());
        }
        else {
            stringBuilder0.append(this.getClass().getName());
        }
        stringBuilder0.append('@');
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("[status=");
        if(this.isCancelled()) {
            stringBuilder0.append("CANCELLED");
        }
        else if(this.isDone()) {
            this.zzu(stringBuilder0);
        }
        else {
            this.zzv(stringBuilder0);
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    private static final Object zzA(Object object0) {
        if(!(object0 instanceof zzfws.zzb)) {
            if(object0 instanceof zzfws.zzc) {
                throw new ExecutionException(((zzfws.zzc)object0).zzb);
            }
            return object0 == zzfws.zzbd ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((zzfws.zzb)object0).zzd);
        throw cancellationException0;
    }

    // 去混淆评级： 低(20)
    protected String zza() {
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    protected void zzb() {
    }

    protected boolean zzc(Object object0) {
        if(object0 == null) {
            object0 = zzfws.zzbd;
        }
        if(zzfws.zzba.zzf(this, null, object0)) {
            zzfws.zzx(this, false);
            return true;
        }
        return false;
    }

    protected boolean zzd(Throwable throwable0) {
        throwable0.getClass();
        zzfws.zzc zzfws$zzc0 = new zzfws.zzc(throwable0);
        if(zzfws.zzba.zzf(this, null, zzfws$zzc0)) {
            zzfws.zzx(this, false);
            return true;
        }
        return false;
    }

    private static Object zze(d d0) {
        if(d0 instanceof zzfws.zzh) {
            zzfws.zzb zzfws$zzb0 = ((zzfws)d0).value;
            if(zzfws$zzb0 instanceof zzfws.zzb && zzfws$zzb0.zzc) {
                zzfws$zzb0 = zzfws$zzb0.zzd == null ? zzfws.zzb.zzb : new zzfws.zzb(false, zzfws$zzb0.zzd);
            }
            zzfws$zzb0.getClass();
            return zzfws$zzb0;
        }
        if(d0 instanceof zzfzg) {
            Throwable throwable0 = ((zzfzg)d0).zzl();
            if(throwable0 != null) {
                return new zzfws.zzc(throwable0);
            }
        }
        boolean z = d0.isCancelled();
        if((!zzfws.zzd & z) != 0) {
            zzfws.zzb.zzb.getClass();
            return zzfws.zzb.zzb;
        }
        try {
            Object object0 = zzfws.zzf(d0);
            if(z) {
                return new zzfws.zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + d0));
            }
            return object0 == null ? zzfws.zzbd : object0;
        }
        catch(ExecutionException executionException0) {
            return z ? new zzfws.zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + d0, executionException0)) : new zzfws.zzc(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new zzfws.zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + d0, cancellationException0)) : new zzfws.zzb(false, cancellationException0);
        }
        catch(RuntimeException runtimeException0) {
            return new zzfws.zzc(runtimeException0);
        }
        catch(Error runtimeException0) {
            return new zzfws.zzc(runtimeException0);
        }
        return new zzfws.zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + d0, executionException0));
    }

    private static Object zzf(Future future0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = future0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfzg
    protected final Throwable zzl() {
        if(this instanceof zzfws.zzh) {
            return this.value instanceof zzfws.zzc ? ((zzfws.zzc)this.value).zzb : null;
        }
        return null;
    }

    static void zzp(zzfws zzfws0, boolean z) {
        zzfws.zzx(zzfws0, false);
    }

    protected void zzq() {
    }

    final void zzr(Future future0) {
        if((future0 != null & this.isCancelled()) != 0) {
            future0.cancel(this.zzt());
        }
    }

    protected final boolean zzs(d d0) {
        zzfws.zzc zzfws$zzc0;
        d0.getClass();
        Object object0 = this.value;
        if(object0 == null) {
            if(d0.isDone()) {
                Object object1 = zzfws.zze(d0);
                if(zzfws.zzba.zzf(this, null, object1)) {
                    zzfws.zzx(this, false);
                    return true;
                }
                return false;
            }
            zzfws.zzf zzfws$zzf0 = new zzfws.zzf(this, d0);
            if(zzfws.zzba.zzf(this, null, zzfws$zzf0)) {
                try {
                    d0.addListener(zzfws$zzf0, zzfxs.zza);
                }
                catch(RuntimeException | Error runtimeException0) {
                    try {
                        zzfws$zzc0 = new zzfws.zzc(runtimeException0);
                    }
                    catch(RuntimeException | Error unused_ex) {
                        zzfws$zzc0 = zzfws.zzc.zza;
                    }
                    zzfws.zzba.zzf(this, zzfws$zzf0, zzfws$zzc0);
                }
                return true;
            }
            object0 = this.value;
        }
        if(object0 instanceof zzfws.zzb) {
            d0.cancel(((zzfws.zzb)object0).zzc);
        }
        return false;
    }

    // 去混淆评级： 低(20)
    protected final boolean zzt() {
        return this.value instanceof zzfws.zzb && ((zzfws.zzb)this.value).zzc;
    }

    private final void zzu(StringBuilder stringBuilder0) {
        try {
            Object object0 = zzfws.zzf(this);
            stringBuilder0.append("SUCCESS, result=[");
            if(object0 == null) {
                stringBuilder0.append("null");
            }
            else if(object0 == this) {
                stringBuilder0.append("this future");
            }
            else {
                stringBuilder0.append(object0.getClass().getName());
                stringBuilder0.append("@");
                stringBuilder0.append(Integer.toHexString(System.identityHashCode(object0)));
            }
            stringBuilder0.append("]");
            return;
        }
        catch(ExecutionException executionException0) {
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
            return;
        }
        catch(RuntimeException runtimeException0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(runtimeException0.getClass());
            stringBuilder0.append(" thrown from get()]");
            return;
        }
        stringBuilder0.append("FAILURE, cause=[");
        stringBuilder0.append(executionException0.getCause());
        stringBuilder0.append("]");
    }

    private final void zzv(StringBuilder stringBuilder0) {
        String s;
        int v = stringBuilder0.length();
        stringBuilder0.append("PENDING");
        Object object0 = this.value;
        if(object0 instanceof zzfws.zzf) {
            stringBuilder0.append(", setFuture=[");
            this.zzw(stringBuilder0, ((zzfws.zzf)object0).zzb);
            stringBuilder0.append("]");
        }
        else {
            try {
                s = zzfrx.zza(this.zza());
            }
            catch(RuntimeException | StackOverflowError runtimeException0) {
                s = "Exception thrown from implementation: " + runtimeException0.getClass();
            }
            if(s != null) {
                stringBuilder0.append(", info=[");
                stringBuilder0.append(s);
                stringBuilder0.append("]");
            }
        }
        if(this.isDone()) {
            stringBuilder0.delete(v, stringBuilder0.length());
            this.zzu(stringBuilder0);
        }
    }

    private final void zzw(StringBuilder stringBuilder0, Object object0) {
        try {
            if(object0 == this) {
                stringBuilder0.append("this future");
                return;
            }
            stringBuilder0.append(object0);
            return;
        }
        catch(RuntimeException | StackOverflowError runtimeException0) {
        }
        stringBuilder0.append("Exception thrown from implementation: ");
        stringBuilder0.append(runtimeException0.getClass());
    }

    private static void zzx(zzfws zzfws0, boolean z) {
        Runnable runnable0;
        zzfws.zzd zzfws$zzd2;
        zzfws.zzd zzfws$zzd0 = null;
        while(true) {
            for(zzfws.zzk zzfws$zzk0 = zzfws.zzba.zzb(zzfws0, zzfws.zzk.zza); zzfws$zzk0 != null; zzfws$zzk0 = zzfws$zzk0.next) {
                Thread thread0 = zzfws$zzk0.thread;
                if(thread0 != null) {
                    zzfws$zzk0.thread = null;
                    LockSupport.unpark(thread0);
                }
            }
            if(z) {
                zzfws0.zzq();
            }
            zzfws0.zzb();
            zzfws.zzd zzfws$zzd1 = zzfws.zzba.zza(zzfws0, zzfws.zzd.zza);
            zzfws$zzd2 = zzfws$zzd0;
            while(zzfws$zzd1 != null) {
                zzfws.zzd zzfws$zzd3 = zzfws$zzd1.next;
                zzfws$zzd1.next = zzfws$zzd2;
                zzfws$zzd2 = zzfws$zzd1;
                zzfws$zzd1 = zzfws$zzd3;
            }
        label_20:
            if(zzfws$zzd2 != null) {
                zzfws$zzd0 = zzfws$zzd2.next;
                runnable0 = zzfws$zzd2.zzb;
                runnable0.getClass();
                if(runnable0 instanceof zzfws.zzf) {
                    zzfws0 = ((zzfws.zzf)runnable0).zza;
                    if(zzfws0.value == ((zzfws.zzf)runnable0)) {
                        Object object0 = zzfws.zze(((zzfws.zzf)runnable0).zzb);
                        if(zzfws.zzba.zzf(zzfws0, ((zzfws.zzf)runnable0), object0)) {
                            z = false;
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
                zzfws$zzd2 = zzfws$zzd0;
                goto label_20;
            }
            return;
        }
        zzfws$zzd2.zzc.getClass();
        zzfws.zzy(runnable0, zzfws$zzd2.zzc);
        zzfws$zzd2 = zzfws$zzd0;
        goto label_20;
    }

    private static void zzy(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            zzfws.zzaZ.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    private final void zzz(zzfws.zzk zzfws$zzk0) {
        zzfws$zzk0.thread = null;
    alab1:
        zzfws.zzk zzfws$zzk1;
        while((zzfws$zzk1 = this.waiters) != zzfws.zzk.zza) {
            zzfws.zzk zzfws$zzk2 = null;
            while(true) {
                if(zzfws$zzk1 == null) {
                    break alab1;
                }
                zzfws.zzk zzfws$zzk3 = zzfws$zzk1.next;
                if(zzfws$zzk1.thread != null) {
                    zzfws$zzk2 = zzfws$zzk1;
                }
                else if(zzfws$zzk2 == null) {
                    if(zzfws.zzba.zzg(this, zzfws$zzk1, zzfws$zzk3)) {
                        zzfws$zzk1 = zzfws$zzk3;
                        continue;
                    }
                    break;
                }
                else {
                    zzfws$zzk2.next = zzfws$zzk3;
                    if(zzfws$zzk2.thread == null) {
                        break;
                    }
                }
                zzfws$zzk1 = zzfws$zzk3;
            }
        }
    }
}

