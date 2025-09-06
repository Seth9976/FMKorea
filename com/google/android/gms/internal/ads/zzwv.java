package com.google.android.gms.internal.ads;

import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.media.Spatializer;

final class zzwv implements Spatializer.OnSpatializerStateChangedListener {
    final zzxd zza;

    zzwv(zzww zzww0, zzxd zzxd0) {
        this.zza = zzxd0;
        super();
    }

    @Override  // android.media.Spatializer$OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer0, boolean z) {
        zzxd.zzh(this.zza);
    }

    @Override  // android.media.Spatializer$OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer0, boolean z) {
        zzxd.zzh(this.zza);
    }
}

