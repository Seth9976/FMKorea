package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgm;

public final class zzfj extends zzbgm {
    private final ShouldDelayBannerRenderingListener zza;

    public zzfj(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener0) {
        this.zza = shouldDelayBannerRenderingListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzb(IObjectWrapper iObjectWrapper0) {
        Runnable runnable0 = (Runnable)ObjectWrapper.unwrap(iObjectWrapper0);
        return this.zza.shouldDelayBannerRendering(runnable0);
    }
}

