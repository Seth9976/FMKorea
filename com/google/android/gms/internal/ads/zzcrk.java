package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzcrk extends zzcqc {
    private final zzbgn zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcrk(zzcsd zzcsd0, zzbgn zzbgn0, Runnable runnable0, Executor executor0) {
        super(zzcsd0);
        this.zzc = zzbgn0;
        this.zzd = runnable0;
        this.zze = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final int zza() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final View zzc() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final zzdq zzd() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final zzfbf zze() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final zzfbf zzf() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final void zzg() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final void zzh(ViewGroup viewGroup0, zzq zzq0) {
    }

    // 检测为 Lambda 实现
    static void zzi(AtomicReference atomicReference0) [...]

    @Override  // com.google.android.gms.internal.ads.zzcse
    public final void zzj() {
        zzcrj zzcrj0 = () -> try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(() -> {
                Runnable runnable0 = (Runnable)atomicReference0.getAndSet(null);
                if(runnable0 != null) {
                    runnable0.run();
                }
            });
            if(!this.zzc.zzb(iObjectWrapper0)) {
                zzcrk.zzi(((zzcri)() -> {
                    Runnable runnable0 = (Runnable)atomicReference0.getAndSet(null);
                    if(runnable0 != null) {
                        runnable0.run();
                    }
                }).zza);
            }
        }
        catch(RemoteException unused_ex) {
            zzcrk.zzi(((zzcri)() -> {
                Runnable runnable0 = (Runnable)atomicReference0.getAndSet(null);
                if(runnable0 != null) {
                    runnable0.run();
                }
            }).zza);
        };
        this.zze.execute(zzcrj0);
    }

    // 检测为 Lambda 实现
    final void zzk(Runnable runnable0) [...]
}

