package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

public final class zzfd extends zzdc {
    private final OnAdMetadataChangedListener zza;

    public zzfd(OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        this.zza = onAdMetadataChangedListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener0 = this.zza;
        if(onAdMetadataChangedListener0 != null) {
            onAdMetadataChangedListener0.onAdMetadataChanged();
        }
    }
}

