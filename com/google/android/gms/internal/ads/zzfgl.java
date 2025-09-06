package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzfgl {
    private final Executor zza;
    private final zzcaf zzb;

    public zzfgl(Executor executor0, zzcaf zzcaf0) {
        this.zza = executor0;
        this.zzb = zzcaf0;
    }

    // 检测为 Lambda 实现
    final void zza(String s) [...]

    public final void zzb(String s) {
        zzfgk zzfgk0 = () -> this.zzb.zza(s);
        this.zza.execute(zzfgk0);
    }
}

