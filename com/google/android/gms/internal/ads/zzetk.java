package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

public final class zzetk implements zzesj {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzbza zzd;

    public zzetk(zzbza zzbza0, Executor executor0, String s, PackageInfo packageInfo0, int v) {
        this.zzd = zzbza0;
        this.zza = executor0;
        this.zzb = s;
        this.zzc = packageInfo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 41;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        d d0 = zzfye.zzm(zzfye.zzh(this.zzb), (Object object0) -> new zzetl(((String)object0)), this.zza);
        zzetj zzetj0 = (Throwable throwable0) -> zzfye.zzh(new zzetl(this.zzb));
        return zzfye.zzf(d0, Throwable.class, zzetj0, this.zza);
    }

    // 检测为 Lambda 实现
    final d zzc(Throwable throwable0) [...]
}

