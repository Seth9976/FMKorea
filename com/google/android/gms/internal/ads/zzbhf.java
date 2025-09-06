package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;

public final class zzbhf extends zzbgp {
    private final UnconfirmedClickListener zza;

    public zzbhf(UnconfirmedClickListener unifiedNativeAd$UnconfirmedClickListener0) {
        this.zza = unifiedNativeAd$UnconfirmedClickListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzf(String s) {
        this.zza.onUnconfirmedClickReceived(s);
    }
}

