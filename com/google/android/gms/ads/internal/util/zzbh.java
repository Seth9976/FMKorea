package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzaly;
import com.google.android.gms.internal.ads.zzcaa;

final class zzbh implements zzalt {
    final String zza;
    final zzbl zzb;

    zzbh(zzbo zzbo0, String s, zzbl zzbl0) {
        this.zza = s;
        this.zzb = zzbl0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzalt
    public final void zza(zzaly zzaly0) {
        zzcaa.zzj(("Failed to load URL: " + this.zza + "\n" + zzaly0.toString()));
        this.zzb.zza(null);
    }
}

