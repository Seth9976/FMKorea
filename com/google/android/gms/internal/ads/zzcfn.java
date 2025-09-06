package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

final class zzcfn implements zzfya {
    final List zza;
    final String zzb;
    final Uri zzc;
    final zzcfp zzd;

    zzcfn(zzcfp zzcfp0, List list0, String s, Uri uri0) {
        this.zzd = zzcfp0;
        this.zza = list0;
        this.zzb = s;
        this.zzc = uri0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzcaa.zzj(("Failed to parse gmsg params for: " + this.zzc));
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzcfp.zze(this.zzd, ((Map)object0), this.zza, this.zzb);
    }
}

