package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzctj implements zzfya {
    final zzctl zza;

    zzctj(zzctl zzctl0) {
        this.zza = zzctl0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzctl.zzb(this.zza).zzn(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(@NullableDecl Object object0) {
        zzbun zzbun0 = (zzbun)object0;
        zzctl.zzb(this.zza).zzn(true);
    }
}

