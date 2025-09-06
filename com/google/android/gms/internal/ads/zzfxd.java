package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzfxd extends zzfxj {
    private static final Logger zza;
    private zzfty zzb;
    private final boolean zzc;
    private final boolean zze;

    static {
        zzfxd.zza = Logger.getLogger("com.google.android.gms.internal.ads.zzfxd");
    }

    zzfxd(zzfty zzfty0, boolean z, boolean z1) {
        super(zzfty0.size());
        this.zzb = zzfty0;
        this.zzc = z;
        this.zze = z1;
    }

    private final void zzG(int v, Future future0) {
        try {
            this.zzf(v, zzfye.zzp(future0));
        }
        catch(ExecutionException executionException0) {
            this.zzI(executionException0.getCause());
        }
        catch(RuntimeException | Error runtimeException0) {
            this.zzI(runtimeException0);
        }
    }

    private final void zzH(zzfty zzfty0) {
        int v = this.zzA();
        zzfri.zzj(v >= 0, "Less than 0 remaining futures");
        if(v == 0) {
            if(zzfty0 != null) {
                zzfwd zzfwd0 = zzfty0.zze();
                for(int v1 = 0; zzfwd0.hasNext(); ++v1) {
                    Object object0 = zzfwd0.next();
                    Future future0 = (Future)object0;
                    if(!future0.isCancelled()) {
                        this.zzG(v1, future0);
                    }
                }
            }
            this.zzF();
            this.zzu();
            this.zzy(2);
        }
    }

    private final void zzI(Throwable throwable0) {
        throwable0.getClass();
        if(this.zzc && !this.zzd(throwable0) && zzfxd.zzK(this.zzC(), throwable0)) {
            zzfxd.zzJ(throwable0);
            return;
        }
        if(throwable0 instanceof Error) {
            zzfxd.zzJ(throwable0);
        }
    }

    private static void zzJ(Throwable throwable0) {
        zzfxd.zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", (throwable0 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first"), throwable0);
    }

    private static boolean zzK(Set set0, Throwable throwable0) {
        while(throwable0 != null) {
            if(!set0.add(throwable0)) {
                return false;
            }
            throwable0 = throwable0.getCause();
        }
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final String zza() {
        zzfty zzfty0 = this.zzb;
        return zzfty0 == null ? super.zza() : "futures=" + zzfty0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        zzfty zzfty0 = this.zzb;
        boolean z = true;
        this.zzy(1);
        boolean z1 = this.isCancelled();
        if(zzfty0 == null) {
            z = false;
        }
        if(z && z1) {
            boolean z2 = this.zzt();
            zzfwd zzfwd0 = zzfty0.zze();
            while(zzfwd0.hasNext()) {
                Object object0 = zzfwd0.next();
                ((Future)object0).cancel(z2);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfxj
    final void zze(Set set0) {
        set0.getClass();
        if(!this.isCancelled()) {
            Throwable throwable0 = this.zzl();
            throwable0.getClass();
            zzfxd.zzK(set0, throwable0);
        }
    }

    abstract void zzf(int arg1, Object arg2);

    abstract void zzu();

    final void zzv() {
        zzfty zzfty0 = this.zzb;
        zzfty0.getClass();
        if(zzfty0.isEmpty()) {
            this.zzu();
            return;
        }
        if(this.zzc) {
            zzfwd zzfwd0 = this.zzb.zze();
            for(int v = 0; zzfwd0.hasNext(); ++v) {
                Object object0 = zzfwd0.next();
                ((d)object0).addListener(() -> try {
                    if(((d)object0).isCancelled()) {
                        this.zzb = null;
                        this.cancel(false);
                    }
                    else {
                        this.zzG(v, ((d)object0));
                    }
                }
                finally {
                    this.zzH(null);
                }, zzfxs.zza);
            }
            return;
        }
        zzfxc zzfxc0 = () -> this.zzH((this.zze ? this.zzb : null));
        zzfwd zzfwd1 = this.zzb.zze();
        while(zzfwd1.hasNext()) {
            Object object1 = zzfwd1.next();
            ((d)object1).addListener(zzfxc0, zzfxs.zza);
        }
    }

    // 检测为 Lambda 实现
    final void zzw(d d0, int v) [...]

    // 检测为 Lambda 实现
    final void zzx(zzfty zzfty0) [...]

    void zzy(int v) {
        this.zzb = null;
    }
}

