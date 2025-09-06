package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzeyn implements zzfqw {
    final zzeyr zza;

    zzeyn(zzeyr zzeyr0) {
        this.zza = zzeyr0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    @NullableDecl
    public final Object apply(@NullableDecl Object object0) {
        zzcaa.zzh("", ((zzdxh)object0));
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeyq zzeyq0 = new zzeyq(null, zzeyr.zzb(this.zza), null);
        zzeyr.zzd(this.zza, zzeyq0);
        return zzeyr.zza(this.zza);
    }
}

