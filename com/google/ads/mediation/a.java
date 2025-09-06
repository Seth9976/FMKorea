package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

final class a extends UnifiedNativeAdMapper {
    private final UnifiedNativeAd a;

    public a(UnifiedNativeAd unifiedNativeAd0) {
        this.a = unifiedNativeAd0;
        this.setHeadline(unifiedNativeAd0.getHeadline());
        this.setImages(unifiedNativeAd0.getImages());
        this.setBody(unifiedNativeAd0.getBody());
        this.setIcon(unifiedNativeAd0.getIcon());
        this.setCallToAction(unifiedNativeAd0.getCallToAction());
        this.setAdvertiser(unifiedNativeAd0.getAdvertiser());
        this.setStarRating(unifiedNativeAd0.getStarRating());
        this.setStore(unifiedNativeAd0.getStore());
        this.setPrice(unifiedNativeAd0.getPrice());
        this.zzd(unifiedNativeAd0.zza());
        this.setOverrideImpressionRecording(true);
        this.setOverrideClickHandling(true);
        this.zze(unifiedNativeAd0.getVideoController());
    }

    @Override  // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view0, Map map0, Map map1) {
        if(view0 instanceof zzg || ((zze)zze.zza.get(view0)) != null) {
            throw null;
        }
    }
}

