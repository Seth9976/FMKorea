package com.google.android.gms.internal.ads;

import Z1.d;
import android.net.Uri;

public final class zzefa implements zzfxl {
    public final zzefc zza;
    public final Uri zzb;
    public final zzfbr zzc;
    public final zzfbe zzd;

    public zzefa(zzefc zzefc0, Uri uri0, zzfbr zzfbr0, zzfbe zzfbe0) {
        this.zza = zzefc0;
        this.zzb = uri0;
        this.zzc = zzfbr0;
        this.zzd = zzfbe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, object0);
    }
}

