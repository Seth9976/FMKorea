package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzam;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzerq implements zzesj {
    private final String zza;
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfca zze;
    private final zzchd zzf;

    zzerq(zzfyo zzfyo0, ScheduledExecutorService scheduledExecutorService0, String s, Context context0, zzfca zzfca0, zzchd zzchd0) {
        this.zzb = zzfyo0;
        this.zzc = scheduledExecutorService0;
        this.zza = s;
        this.zzd = context0;
        this.zze = zzfca0;
        this.zzf = zzchd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 33;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzgX)).booleanValue() || this.zze.zzq ? zzfye.zzh(new zzerr(null)) : zzfye.zzk(() -> {
            String s = ((Boolean)zzba.zzc().zzb(zzbbr.zzgY)).booleanValue() ? "UNKNOWN" : this.zza;
            zzg zzg0 = this.zzf.zzo();
            zzcvq zzcvq0 = new zzcvq();
            zzcvq0.zze(this.zzd);
            zzfby zzfby0 = new zzfby();
            zzfby0.zzs("adUnitId");
            zzfby0.zzE(this.zze.zzd);
            zzfby0.zzr(new zzq());
            zzfby0.zzx(true);
            zzcvq0.zzi(zzfby0.zzG());
            zzg0.zza(zzcvq0.zzj());
            zzac zzac0 = new zzac();
            zzac0.zza(s);
            zzg0.zzb(zzac0.zzb());
            new zzdbt();
            return zzfye.zze(zzfye.zzm(((zzfxv)zzfye.zzo(zzfxv.zzu(zzg0.zzc().zzc()), ((long)(((Long)zzba.zzc().zzb(zzbbr.zzgZ)))), TimeUnit.MILLISECONDS, this.zzc)), (Object object0) -> (((zzam)object0) == null ? new zzerr(null) : new zzerr(((zzam)object0).zza)), this.zzb), Exception.class, zzerp.zza, this.zzb);
        }, this.zzb);
    }

    // 检测为 Lambda 实现
    public static d zzc(zzerq zzerq0) [...]
}

