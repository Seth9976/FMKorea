package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zzky implements Runnable {
    private final AtomicReference zza;
    private final zzo zzb;
    private final zzkp zzc;

    zzky(zzkp zzkp0, AtomicReference atomicReference0, zzo zzo0) {
        this.zzc = zzkp0;
        this.zza = atomicReference0;
        this.zzb = zzo0;
        super();
    }

    @Override
    public final void run() {
        AtomicReference atomicReference0 = this.zza;
        __monitor_enter(atomicReference0);
        try {
            if(this.zzc.zzk().zzm().zzh()) {
                zzfk zzfk0 = this.zzc.zzb;
                if(zzfk0 != null) {
                    Preconditions.checkNotNull(this.zzb);
                    String s = zzfk0.zzb(this.zzb);
                    this.zza.set(s);
                    String s1 = (String)this.zza.get();
                    if(s1 != null) {
                        this.zzc.zzm().zza(s1);
                        this.zzc.zzk().zze.zza(s1);
                    }
                    this.zzc.zzal();
                    goto label_25;
                }
                this.zzc.zzj().zzg().zza("Failed to get app instance id");
                goto label_15;
            }
            goto label_18;
        }
        catch(RemoteException remoteException0) {
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        try {
        label_15:
            this.zza.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
            try {
            label_18:
                this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzm().zza(null);
                this.zzc.zzk().zze.zza(null);
                this.zza.set(null);
                goto label_31;
            }
            catch(RemoteException remoteException0) {
            label_24:
                this.zzc.zzj().zzg().zza("Failed to get app instance id", remoteException0);
            }
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        try {
        label_25:
            this.zza.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
        label_29:
            this.zza.notify();
            throw throwable0;
        label_31:
            this.zza.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
    }
}

