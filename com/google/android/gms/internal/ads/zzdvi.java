package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class zzdvi {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final zzdwq zzc;
    private final zzgyn zzd;

    public zzdvi(zzfyo zzfyo0, zzfyo zzfyo1, zzdwq zzdwq0, zzgyn zzgyn0) {
        this.zza = zzfyo0;
        this.zzb = zzfyo1;
        this.zzc = zzdwq0;
        this.zzd = zzgyn0;
    }

    // 检测为 Lambda 实现
    final d zza(zzbun zzbun0, int v, zzdxh zzdxh0) [...]

    public final d zzb(zzbun zzbun0) {
        d d0;
        if(zzs.zzz(zzbun0.zzd)) {
            d0 = zzfye.zzg(new zzdxh(1));
        }
        else {
            zzdvf zzdvf0 = () -> {
                zzdwq zzdwq0 = this.zzc;
                synchronized(zzdwq0.zzb) {
                    if(zzdwq0.zzc) {
                        return (InputStream)zzdwq0.zza.get(((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfr)))))), TimeUnit.SECONDS);
                    }
                    zzdwq0.zzc = true;
                    zzdwq0.zze = zzbun0;
                    zzdwq0.zzf.checkAvailabilityAndConnect();
                    zzdwp zzdwp0 = new zzdwp(zzdwq0);
                    zzdwq0.zza.addListener(zzdwp0, zzcan.zzf);
                }
                return (InputStream)zzdwq0.zza.get(((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfr)))))), TimeUnit.SECONDS);
            };
            d0 = zzfye.zzf(this.zza.zzb(zzdvf0), ExecutionException.class, (/* 缺少Lambda参数 */) -> zzfye.zzg(((ExecutionException)object0).getCause()), this.zzb);
        }
        zzdvh zzdvh0 = (zzdxh zzdxh0) -> ((zzdzo)this.zzd.zzb()).zzc(zzbun0, Binder.getCallingUid());
        return zzfye.zzf(d0, zzdxh.class, zzdvh0, this.zzb);
    }

    // 检测为 Lambda 实现
    final InputStream zzc(zzbun zzbun0) [...]
}

