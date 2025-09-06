package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;

public final class zzfep {
    private final zzfei zza;
    private final d zzb;
    private boolean zzc;
    private boolean zzd;

    public zzfep(zzfdn zzfdn0, zzfeh zzfeh0, zzfei zzfei0) {
        this.zzc = false;
        this.zzd = false;
        this.zza = zzfei0;
        d d0 = zzfye.zzn(zzfeh0.zza(zzfei0), (zzfdw zzfdw0) -> {
            synchronized(this) {
                this.zzd = true;
                zzfeh0.zzb(zzfdw0);
                if(!this.zzc) {
                    zzfdn0.zzd(zzfei0.zza(), zzfdw0);
                    return zzfye.zzh(null);
                }
            }
            return zzfye.zzh(new zzfeg(zzfdw0, zzfei0));
        }, zzfei0.zzb());
        zzfeo zzfeo0 = (Exception exception0) -> synchronized(this) {
            this.zzd = true;
            throw exception0;
        };
        Executor executor0 = zzfei0.zzb();
        this.zzb = zzfye.zzf(d0, Exception.class, zzfeo0, executor0);
    }

    public final d zza(zzfei zzfei0) {
        synchronized(this) {
            if(!this.zzd && !this.zzc) {
                if(this.zza.zza() != null && zzfei0.zza() != null && this.zza.zza().equals(zzfei0.zza())) {
                    this.zzc = true;
                    return this.zzb;
                }
                return null;
            }
            return null;
        }
    }

    // 检测为 Lambda 实现
    final d zzb(zzfeh zzfeh0, zzfdn zzfdn0, zzfei zzfei0, zzfdw zzfdw0) [...]

    // 检测为 Lambda 实现
    final d zzc(zzfeh zzfeh0, Exception exception0) [...]

    public final void zzd(zzfya zzfya0) {
        synchronized(this) {
            Executor executor0 = this.zza.zzb();
            zzfye.zzr(zzfye.zzn(this.zzb, zzfem.zza, executor0), zzfya0, this.zza.zzb());
        }
    }
}

