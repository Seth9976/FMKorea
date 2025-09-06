package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzefh implements zzedn {
    private final zzcqz zza;
    private final zzeeo zzb;
    private final zzfyo zzc;
    private final zzcwk zzd;
    private final ScheduledExecutorService zze;

    public zzefh(zzcqz zzcqz0, zzeeo zzeeo0, zzcwk zzcwk0, ScheduledExecutorService scheduledExecutorService0, zzfyo zzfyo0) {
        this.zza = zzcqz0;
        this.zzb = zzeeo0;
        this.zzd = zzcwk0;
        this.zze = scheduledExecutorService0;
        this.zzc = zzfyo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        zzefe zzefe0 = () -> {
            zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, null);
            zzcrm zzcrm0 = new zzcrm(zzfbr0.zza.zza.zza(), () -> zzfye.zzr(zzfye.zzo(this.zzb.zza(zzfbr0, zzfbe0), ((long)zzfbe0.zzS), TimeUnit.SECONDS, this.zze), new zzefg(this), this.zzc));
            return this.zza.zzb(zzcst0, zzcrm0).zza();
        };
        return this.zzc.zzb(zzefe0);
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return zzfbr0.zza.zza.zza() != null && this.zzb.zzb(zzfbr0, zzfbe0);
    }

    // 检测为 Lambda 实现
    final zzcqc zzc(zzfbr zzfbr0, zzfbe zzfbe0) [...]

    static zzcqz zzd(zzefh zzefh0) {
        return zzefh0.zza;
    }

    static zzcwk zze(zzefh zzefh0) {
        return zzefh0.zzd;
    }

    // 检测为 Lambda 实现
    final void zzf(zzfbr zzfbr0, zzfbe zzfbe0) [...]
}

