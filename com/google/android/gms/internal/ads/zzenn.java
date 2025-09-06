package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzenn implements zzesj {
    final zzbzj zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfyo zzd;
    private final Context zze;

    zzenn(Context context0, zzbzj zzbzj0, ScheduledExecutorService scheduledExecutorService0, zzfyo zzfyo0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzcC)).booleanValue()) {
            this.zzb = AppSet.getClient(context0);
        }
        this.zze = context0;
        this.zza = zzbzj0;
        this.zzc = scheduledExecutorService0;
        this.zzd = zzfyo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 11;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzcy)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzcD)).booleanValue()) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzcz)).booleanValue()) {
                return zzfye.zzm(zzfom.zza(this.zzb.getAppSetIdInfo()), zzenk.zza, zzcan.zzf);
            }
            Task task0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzcC)).booleanValue() ? zzfde.zza(this.zze) : this.zzb.getAppSetIdInfo();
            if(task0 == null) {
                return zzfye.zzh(new zzeno(null, -1));
            }
            d d0 = zzfye.zzn(zzfom.zza(task0), zzenl.zza, zzcan.zzf);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzcA)).booleanValue()) {
                d0 = zzfye.zzo(d0, ((long)(((Long)zzba.zzc().zzb(zzbbr.zzcB)))), TimeUnit.MILLISECONDS, this.zzc);
            }
            zzenm zzenm0 = new zzenm(this);
            return zzfye.zze(d0, Exception.class, zzenm0, this.zzd);
        }
        return zzfye.zzh(new zzeno(null, -1));
    }
}

