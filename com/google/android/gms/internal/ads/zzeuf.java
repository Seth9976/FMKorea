package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeuf implements zzesj {
    private final zzbzj zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfyo zzd;
    private final zzawh zze;

    zzeuf(String s, zzawh zzawh0, zzbzj zzbzj0, ScheduledExecutorService scheduledExecutorService0, zzfyo zzfyo0) {
        this.zzb = s;
        this.zze = zzawh0;
        this.zza = zzbzj0;
        this.zzc = scheduledExecutorService0;
        this.zzd = zzfyo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 43;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzcy)).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzcD)).booleanValue()) {
            d d0 = zzfye.zzn(zzfom.zza(Tasks.forResult(null)), zzeud.zza, this.zzd);
            if(((Boolean)zzbcz.zza.zze()).booleanValue()) {
                d0 = zzfye.zzo(d0, ((long)(((Long)zzbcz.zzb.zze()))), TimeUnit.MILLISECONDS, this.zzc);
            }
            zzeue zzeue0 = (Exception exception0) -> {
                this.zza.zzu(exception0, "AppSetIdInfoGmscoreSignal");
                return new zzeug(null, -1);
            };
            return zzfye.zze(d0, Exception.class, zzeue0, this.zzd);
        }
        return zzfye.zzh(new zzeug(null, -1));
    }

    // 检测为 Lambda 实现
    final zzeug zzc(Exception exception0) [...]
}

