package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzctk implements zzfya {
    final zzctl zza;

    zzctk(zzctl zzctl0) {
        this.zza = zzctl0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzctl.zzb(this.zza).zzl(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(@NullableDecl Object object0) {
        Void void0 = (Void)object0;
        zzctl.zzb(this.zza).zzl(true);
    }
}

