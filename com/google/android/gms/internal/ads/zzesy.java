package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzesy implements zzesj {
    private final zzg zza;
    private final Context zzb;
    private final zzfyo zzc;
    private final ScheduledExecutorService zzd;
    private final zzedl zze;

    zzesy(zzg zzg0, Context context0, zzfyo zzfyo0, ScheduledExecutorService scheduledExecutorService0, zzedl zzedl0) {
        this.zza = zzg0;
        this.zzb = context0;
        this.zzc = zzfyo0;
        this.zzd = scheduledExecutorService0;
        this.zze = zzedl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 56;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjw)).booleanValue() && this.zza.zzR()) {
            d d0 = zzfye.zzn(zzfxv.zzu(zzfye.zzo(this.zze.zza(false), ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzjx)))))), TimeUnit.MILLISECONDS, this.zzd)), zzesw.zza, this.zzc);
            zzesx zzesx0 = (Throwable throwable0) -> {
                zzbtf.zza(this.zzb).zzf(throwable0, "TopicsSignal.fetchTopicsSignal");
                if(throwable0 instanceof SecurityException) {
                    return zzfye.zzh(new zzeta("", 2, null));
                }
                if(throwable0 instanceof IllegalStateException) {
                    return zzfye.zzh(new zzeta("", 3, null));
                }
                if(throwable0 instanceof IllegalArgumentException) {
                    return zzfye.zzh(new zzeta("", 4, null));
                }
                return throwable0 instanceof TimeoutException ? zzfye.zzh(new zzeta("", 5, null)) : zzfye.zzh(new zzeta("", 0, null));
            };
            return zzfye.zzf(d0, Throwable.class, zzesx0, this.zzc);
        }
        return zzfye.zzh(new zzeta("", -1, null));
    }

    // 检测为 Lambda 实现
    final d zzc(Throwable throwable0) [...]
}

