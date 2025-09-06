package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class zzox {
    private final Handler zza;
    private final zzoy zzb;

    public zzox(Handler handler0, zzoy zzoy0) {
        if(zzoy0 == null) {
            handler0 = null;
        }
        this.zza = handler0;
        this.zzb = zzoy0;
    }

    public final void zza(Exception exception0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzb(exception0));
        }
    }

    public final void zzb(Exception exception0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzi(exception0));
        }
    }

    public final void zzc(String s, long v, long v1) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzc(s, v, v1));
        }
    }

    public final void zzd(String s) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzd(s));
        }
    }

    public final void zze(zzid zzid0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zze(zzid0));
        }
    }

    public final void zzf(zzid zzid0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzf(zzid0));
        }
    }

    public final void zzg(zzam zzam0, zzie zzie0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzg(zzam0, zzie0));
        }
    }

    // 检测为 Lambda 实现
    final void zzh(Exception exception0) [...]

    // 检测为 Lambda 实现
    final void zzi(Exception exception0) [...]

    // 检测为 Lambda 实现
    final void zzj(String s, long v, long v1) [...]

    // 检测为 Lambda 实现
    final void zzk(String s) [...]

    // 检测为 Lambda 实现
    final void zzl(zzid zzid0) [...]

    // 检测为 Lambda 实现
    final void zzm(zzid zzid0) [...]

    // 检测为 Lambda 实现
    final void zzn(zzam zzam0, zzie zzie0) [...]

    // 检测为 Lambda 实现
    final void zzo(long v) [...]

    // 检测为 Lambda 实现
    final void zzp(boolean z) [...]

    // 检测为 Lambda 实现
    final void zzq(int v, long v1, long v2) [...]

    public final void zzr(long v) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzh(v));
        }
    }

    public final void zzs(boolean z) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzm(z));
        }
    }

    public final void zzt(int v, long v1, long v2) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzj(v, v1, v2));
        }
    }
}

