package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.zzt;

final class zzbif implements zzfya {
    final zzcfi zza;

    zzbif(zzcfi zzcfi0) {
        this.zza = zzcfi0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzt.zzo().zzu(throwable0, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        new zzby(this.zza.getContext(), this.zza.zzn().zza, ((String)object0)).zzb();
    }
}

