package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

public final class zzzv {
    private final Handler zza;
    private final zzzw zzb;

    public zzzv(Handler handler0, zzzw zzzw0) {
        if(zzzw0 == null) {
            handler0 = null;
        }
        this.zza = handler0;
        this.zzb = zzzw0;
    }

    public final void zza(String s, long v, long v1) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzo(s, v, v1));
        }
    }

    public final void zzb(String s) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzp(s));
        }
    }

    public final void zzc(zzid zzid0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzq(zzid0));
        }
    }

    public final void zzd(int v, long v1) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzk(v, v1));
        }
    }

    public final void zze(zzid zzid0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzr(zzid0));
        }
    }

    public final void zzf(zzam zzam0, zzie zzie0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzt(zzam0, zzie0));
        }
    }

    // 检测为 Lambda 实现
    final void zzg(String s, long v, long v1) [...]

    // 检测为 Lambda 实现
    final void zzh(String s) [...]

    // 检测为 Lambda 实现
    final void zzi(zzid zzid0) [...]

    // 检测为 Lambda 实现
    final void zzj(int v, long v1) [...]

    // 检测为 Lambda 实现
    final void zzk(zzid zzid0) [...]

    // 检测为 Lambda 实现
    final void zzl(zzam zzam0, zzie zzie0) [...]

    // 检测为 Lambda 实现
    final void zzm(Object object0, long v) [...]

    // 检测为 Lambda 实现
    final void zzn(long v, int v1) [...]

    // 检测为 Lambda 实现
    final void zzo(Exception exception0) [...]

    // 检测为 Lambda 实现
    final void zzp(zzdn zzdn0) [...]

    public final void zzq(Object object0) {
        if(this.zza != null) {
            zzzm zzzm0 = () -> this.zzb.zzl(object0, SystemClock.elapsedRealtime());
            this.zza.post(zzzm0);
        }
    }

    public final void zzr(long v, int v1) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzs(v, v1));
        }
    }

    public final void zzs(Exception exception0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzn(exception0));
        }
    }

    public final void zzt(zzdn zzdn0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzu(zzdn0));
        }
    }
}

