package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;

final class zzbqt implements Runnable {
    final AdOverlayInfoParcel zza;
    final zzbqu zzb;

    zzbqt(zzbqu zzbqu0, AdOverlayInfoParcel adOverlayInfoParcel0) {
        this.zzb = zzbqu0;
        this.zza = adOverlayInfoParcel0;
        super();
    }

    @Override
    public final void run() {
        zzm.zza(zzbqu.zza(this.zzb), this.zza, true);
    }
}

