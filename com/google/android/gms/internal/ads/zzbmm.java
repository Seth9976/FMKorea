package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzbmm implements zzcaw {
    final zzbmo zza;

    zzbmm(zzbmo zzbmo0) {
        this.zza = zzbmo0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zza(Object object0) {
        zzbmv zzbmv0 = (zzbmv)object0;
        zze.zza("Releasing engine reference.");
        zzbmo.zza(this.zza).zzd();
    }
}

