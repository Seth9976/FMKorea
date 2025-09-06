package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener;

public final class zzbrs extends zzbgp {
    private final UnconfirmedClickListener zza;

    public zzbrs(UnconfirmedClickListener nativeAd$UnconfirmedClickListener0) {
        this.zza = nativeAd$UnconfirmedClickListener0;
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

