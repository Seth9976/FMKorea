package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

final class zzfcj implements zzfya {
    final zzfck zza;
    final int zzb;

    zzfcj(zzfck zzfck0, int v) {
        this.zza = zzfck0;
        this.zzb = v;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzt.zzo().zzu(throwable0, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        this.zza.zzb(((String)object0), this.zzb);
    }
}

