package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzblq implements zzcgu {
    public final zzbme zza;

    public zzblq(zzbme zzbme0) {
        this.zza = zzbme0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgu
    public final void zza() {
        Long long0 = (long)(zzt.zzB().currentTimeMillis() - this.zza.zzc);
        this.zza.zzb.add(long0);
        zze.zza(("LoadNewJavascriptEngine(onEngLoaded) latency is " + this.zza.zzb.get(0) + " ms."));
        zzbmc zzbmc0 = new zzbmc(this.zza.zza, this.zza.zzd, this.zza.zze, this.zza.zzb, this.zza.zzc);
        long v = (long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzc)))));
        zzs.zza.postDelayed(zzbmc0, v);
    }
}

