package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class zzdwi implements zzdxg {
    private static final Pattern zza;
    private final zzdvi zzb;
    private final zzfyo zzc;
    private final zzfca zzd;
    private final ScheduledExecutorService zze;
    private final zzebe zzf;
    private final zzfhr zzg;
    private final Context zzh;

    static {
        zzdwi.zza = Pattern.compile("Received error HTTP response code: (.*)");
    }

    zzdwi(Context context0, zzfca zzfca0, zzdvi zzdvi0, zzfyo zzfyo0, ScheduledExecutorService scheduledExecutorService0, zzebe zzebe0, zzfhr zzfhr0) {
        this.zzh = context0;
        this.zzd = zzfca0;
        this.zzb = zzdvi0;
        this.zzc = zzfyo0;
        this.zze = scheduledExecutorService0;
        this.zzf = zzebe0;
        this.zzg = zzfhr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdxg
    public final d zzb(zzbun zzbun0) {
        d d0 = this.zzb.zzb(zzbun0);
        zzfhg zzfhg0 = zzfhf.zza(this.zzh, 11);
        zzfhq.zzd(d0, zzfhg0);
        d d1 = zzfye.zzn(d0, (InputStream inputStream0) -> zzfye.zzh(new zzfbr(new zzfbo(this.zzd), zzfbq.zza(new InputStreamReader(inputStream0)))), this.zzc);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzfq)).booleanValue()) {
            d1 = zzfye.zzf(zzfye.zzo(d1, ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfr)))))), TimeUnit.SECONDS, this.zze), TimeoutException.class, zzdwg.zza, zzcan.zzf);
        }
        zzfhq.zza(d1, this.zzg, zzfhg0);
        zzfye.zzr(d1, new zzdwh(this), zzcan.zzf);
        return d1;
    }

    // 检测为 Lambda 实现
    final d zzc(InputStream inputStream0) [...]

    static Pattern zzd() {
        return zzdwi.zza;
    }
}

