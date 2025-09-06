package j1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints.Builder;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase.MediaCacheFlag;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

public class c extends UnifiedNativeAdMapper {
    class b extends Image {
        private Drawable a;
        private Uri b;
        final c c;

        public b() {
        }

        public b(Drawable drawable0) {
            this.a = drawable0;
        }

        public b(Uri uri0) {
            this.b = uri0;
        }

        @Override  // com.google.android.gms.ads.formats.NativeAd$Image
        public Drawable getDrawable() {
            return this.a;
        }

        @Override  // com.google.android.gms.ads.formats.NativeAd$Image
        public double getScale() {
            return 1.0;
        }

        @Override  // com.google.android.gms.ads.formats.NativeAd$Image
        public Uri getUri() {
            return this.b;
        }
    }

    interface j1.c.c {
        void a(AdError arg1);

        void b();
    }

    class d implements AdListener, NativeAdListener {
        private final WeakReference a;
        private final NativeAdBase b;
        final c c;

        d(Context context0, NativeAdBase nativeAdBase0) {
            this.b = nativeAdBase0;
            this.a = new WeakReference(context0);
        }

        @Override  // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad0) {
            c.this.d.reportAdClicked();
            c.this.d.onAdOpened();
            c.this.d.onAdLeftApplication();
        }

        @Override  // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad0) {
            class a implements j1.c.c {
                final d a;

                @Override  // j1.c$c
                public void a(AdError adError0) {
                    Log.w("FacebookMediationAdapter", adError0.getMessage());
                    c.this.b.onFailure(adError0);
                }

                @Override  // j1.c$c
                public void b() {
                    MediationNativeAdCallback mediationNativeAdCallback0 = (MediationNativeAdCallback)c.this.b.onSuccess(c.this);
                    c.this.d = mediationNativeAdCallback0;
                }
            }

            if(ad0 != this.b) {
                AdError adError0 = new AdError(106, "Ad Loaded is not a Native Ad.", "com.google.ads.mediation.facebook");
                Log.e("FacebookMediationAdapter", "Ad Loaded is not a Native Ad.");
                c.this.b.onFailure(adError0);
                return;
            }
            Context context0 = (Context)this.a.get();
            if(context0 == null) {
                AdError adError1 = new AdError(107, "Context is null.", "com.google.ads.mediation.facebook");
                Log.e("FacebookMediationAdapter", "Context is null.");
                c.this.b.onFailure(adError1);
                return;
            }
            a c$d$a0 = new a(this);
            c.this.e(context0, c$d$a0);
        }

        @Override  // com.facebook.ads.AdListener
        public void onError(Ad ad0, com.facebook.ads.AdError adError0) {
            AdError adError1 = FacebookMediationAdapter.getAdError(adError0);
            Log.w("FacebookMediationAdapter", adError1.getMessage());
            c.this.b.onFailure(adError1);
        }

        @Override  // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad0) {
        }

        @Override  // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad0) {
            Log.d("FacebookMediationAdapter", "onMediaDownloaded");
        }
    }

    private final MediationNativeAdConfiguration a;
    private final MediationAdLoadCallback b;
    private NativeAdBase c;
    private MediationNativeAdCallback d;
    private MediaView e;

    public c(MediationNativeAdConfiguration mediationNativeAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        this.b = mediationAdLoadCallback0;
        this.a = mediationNativeAdConfiguration0;
    }

    private boolean d(NativeAdBase nativeAdBase0) {
        boolean z = nativeAdBase0.getAdHeadline() != null && nativeAdBase0.getAdBodyText() != null && nativeAdBase0.getAdIcon() != null && nativeAdBase0.getAdCallToAction() != null;
        return nativeAdBase0 instanceof NativeBannerAd ? z : z && nativeAdBase0.getAdCoverImage() != null && this.e != null;
    }

    public void e(Context context0, j1.c.c c$c0) {
        class j1.c.a implements MediaViewListener {
            final c a;

            @Override  // com.facebook.ads.MediaViewListener
            public void onComplete(MediaView mediaView0) {
                if(c.this.d != null) {
                    c.this.d.onVideoComplete();
                }
            }

            @Override  // com.facebook.ads.MediaViewListener
            public void onEnterFullscreen(MediaView mediaView0) {
            }

            @Override  // com.facebook.ads.MediaViewListener
            public void onExitFullscreen(MediaView mediaView0) {
            }

            @Override  // com.facebook.ads.MediaViewListener
            public void onFullscreenBackground(MediaView mediaView0) {
            }

            @Override  // com.facebook.ads.MediaViewListener
            public void onFullscreenForeground(MediaView mediaView0) {
            }

            @Override  // com.facebook.ads.MediaViewListener
            public void onPause(MediaView mediaView0) {
            }

            @Override  // com.facebook.ads.MediaViewListener
            public void onPlay(MediaView mediaView0) {
            }

            @Override  // com.facebook.ads.MediaViewListener
            public void onVolumeChange(MediaView mediaView0, float f) {
            }
        }

        if(!this.d(this.c)) {
            AdError adError0 = new AdError(108, "Ad from Meta Audience Network doesn\'t have all required assets.", "com.google.ads.mediation.facebook");
            Log.w("FacebookMediationAdapter", "Ad from Meta Audience Network doesn\'t have all required assets.");
            c$c0.a(adError0);
            return;
        }
        this.setHeadline(this.c.getAdHeadline());
        if(this.c.getAdCoverImage() != null) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new b(this, Uri.parse(this.c.getAdCoverImage().getUrl())));
            this.setImages(arrayList0);
        }
        this.setBody(this.c.getAdBodyText());
        if(this.c.getPreloadedIconViewDrawable() != null) {
            this.setIcon(new b(this, this.c.getPreloadedIconViewDrawable()));
        }
        else if(this.c.getAdIcon() == null) {
            this.setIcon(new b(this));
        }
        else {
            this.setIcon(new b(this, Uri.parse(this.c.getAdIcon().getUrl())));
        }
        this.setCallToAction(this.c.getAdCallToAction());
        this.setAdvertiser(this.c.getAdvertiserName());
        this.e.setListener(new j1.c.a(this));
        this.setHasVideoContent(true);
        this.setMediaView(this.e);
        Bundle bundle0 = new Bundle();
        bundle0.putCharSequence("id", this.c.getId());
        bundle0.putCharSequence("social_context", this.c.getAdSocialContext());
        this.setExtras(bundle0);
        this.setAdChoicesContent(new AdOptionsView(context0, this.c, null));
        c$c0.b();
    }

    public void f() {
        String s = FacebookMediationAdapter.getPlacementID(this.a.getServerParameters());
        if(TextUtils.isEmpty(s)) {
            AdError adError0 = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e("FacebookMediationAdapter", "Failed to request ad. PlacementID is null or empty.");
            this.b.onFailure(adError0);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.a);
        this.e = new MediaView(this.a.getContext());
        try {
            this.c = NativeAdBase.fromBidPayload(this.a.getContext(), s, this.a.getBidResponse());
        }
        catch(Exception exception0) {
            AdError adError1 = new AdError(109, "Failed to create native ad from bid payload: " + exception0.getMessage(), "com.google.ads.mediation.facebook");
            Log.w("FacebookMediationAdapter", adError1.getMessage());
            this.b.onFailure(adError1);
            return;
        }
        if(!TextUtils.isEmpty(this.a.getWatermark())) {
            this.c.setExtraHints(new Builder().mediationData(this.a.getWatermark()).build());
        }
        this.c.loadAd(this.c.buildLoadAdConfig().withAdListener(new d(this, this.a.getContext(), this.c)).withBid(this.a.getBidResponse()).withMediaCacheFlag(MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
    }

    @Override  // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view0, Map map0, Map map1) {
        this.setOverrideClickHandling(true);
        ArrayList arrayList0 = new ArrayList(map0.values());
        View view1 = (View)map0.get("3003");
        NativeAdBase nativeAdBase0 = this.c;
        if(nativeAdBase0 instanceof NativeBannerAd) {
            if(view1 == null) {
                Log.w("FacebookMediationAdapter", "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            }
            if(!(view1 instanceof ImageView)) {
                Log.w("FacebookMediationAdapter", String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view1.getClass()));
                return;
            }
            ((NativeBannerAd)nativeAdBase0).registerViewForInteraction(view0, ((ImageView)view1), arrayList0);
            return;
        }
        if(nativeAdBase0 instanceof NativeAd) {
            if(view1 instanceof ImageView) {
                ((NativeAd)nativeAdBase0).registerViewForInteraction(view0, this.e, ((ImageView)view1), arrayList0);
                return;
            }
            Log.w("FacebookMediationAdapter", "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            ((NativeAd)nativeAdBase0).registerViewForInteraction(view0, this.e, arrayList0);
            return;
        }
        Log.w("FacebookMediationAdapter", "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
    }

    @Override  // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view0) {
        NativeAdBase nativeAdBase0 = this.c;
        if(nativeAdBase0 != null) {
            nativeAdBase0.unregisterView();
        }
        super.untrackView(view0);
    }
}

