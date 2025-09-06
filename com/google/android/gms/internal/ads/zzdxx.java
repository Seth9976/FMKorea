package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.ExecutionException;

public final class zzdxx {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final zzdys zzc;
    private final zzgyn zzd;

    zzdxx(zzfyo zzfyo0, zzfyo zzfyo1, zzdys zzdys0, zzgyn zzgyn0) {
        this.zza = zzfyo0;
        this.zzb = zzfyo1;
        this.zzc = zzdys0;
        this.zzd = zzgyn0;
    }

    // 检测为 Lambda 实现
    final d zza(zzbtv zzbtv0) [...]

    // 检测为 Lambda 实现
    final d zzb(zzbtv zzbtv0, int v, zzdxh zzdxh0) [...]

    public final d zzc(zzbtv zzbtv0) {
        d d0 = zzs.zzz(zzbtv0.zzf) ? zzfye.zzg(new zzdxh(1, "Ads service proxy force local")) : zzfye.zzf(zzfye.zzk(() -> {
            long v = (long)(((Long)zzba.zzc().zzb(zzbbr.zzkp)));
            return this.zzc.zza(zzbtv0, v);
        }, this.zza), ExecutionException.class, zzdxv.zza, this.zzb);
        zzdxw zzdxw0 = (zzdxh zzdxh0) -> ((zzdzy)this.zzd.zzb()).zzb(zzbtv0, Binder.getCallingUid());
        return zzfye.zzf(d0, zzdxh.class, zzdxw0, this.zzb);
    }
}

