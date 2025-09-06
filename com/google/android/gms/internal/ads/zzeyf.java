package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzeyf implements zzfya {
    zzeyf(zzeyh zzeyh0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zze.zza("Notification of cache hit failed.");
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(@NullableDecl Object object0) {
        Void void0 = (Void)object0;
        zze.zza("Notification of cache hit successful.");
    }
}

