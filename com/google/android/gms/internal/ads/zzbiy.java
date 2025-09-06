package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

final class zzbiy implements zzfya {
    final zza zza;
    final Map zzb;
    final String zzc;
    final zzbjc zzd;

    zzbiy(zzbjc zzbjc0, zza zza0, Map map0, String s) {
        this.zzd = zzbjc0;
        this.zza = zza0;
        this.zzb = map0;
        this.zzc = s;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzt.zzo().zzu(throwable0, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzbjc.zze(this.zzd, ((String)object0), this.zza, this.zzb, this.zzc);
    }
}

