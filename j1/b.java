package j1;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints.Builder;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import i1.d;
import java.util.concurrent.atomic.AtomicBoolean;

public class b implements InterstitialAdExtendedListener, MediationInterstitialAd {
    private final MediationInterstitialAdConfiguration a;
    private final MediationAdLoadCallback b;
    private InterstitialAd c;
    private MediationInterstitialAdCallback d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final d g;

    public b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0, d d0) {
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        this.a = mediationInterstitialAdConfiguration0;
        this.b = mediationAdLoadCallback0;
        this.g = d0;
    }

    public void a() {
        String s = FacebookMediationAdapter.getPlacementID(this.a.getServerParameters());
        if(TextUtils.isEmpty(s)) {
            AdError adError0 = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", "com.google.ads.mediation.facebook");
            Log.e("FacebookMediationAdapter", "Failed to request ad. PlacementID is null or empty. ");
            this.b.onFailure(adError0);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.a);
        this.c = this.g.a(this.a.getContext(), s);
        if(!TextUtils.isEmpty(this.a.getWatermark())) {
            this.c.setExtraHints(new Builder().mediationData(this.a.getWatermark()).build());
        }
        this.c.loadAd(this.c.buildLoadAdConfig().withBid(this.a.getBidResponse()).withAdListener(this).build());
    }

    @Override  // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad0) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback0 = this.d;
        if(mediationInterstitialAdCallback0 != null) {
            mediationInterstitialAdCallback0.reportAdClicked();
            this.d.onAdLeftApplication();
        }
    }

    @Override  // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad0) {
        this.d = (MediationInterstitialAdCallback)this.b.onSuccess(this);
    }

    @Override  // com.facebook.ads.AdListener
    public void onError(Ad ad0, com.facebook.ads.AdError adError0) {
        AdError adError1 = FacebookMediationAdapter.getAdError(adError0);
        Log.w("FacebookMediationAdapter", adError1.getMessage());
        if(this.e.get()) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback0 = this.d;
            if(mediationInterstitialAdCallback0 != null) {
                mediationInterstitialAdCallback0.onAdFailedToShow(adError1);
            }
            return;
        }
        this.b.onFailure(adError1);
    }

    @Override  // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        if(!this.f.getAndSet(true)) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback0 = this.d;
            if(mediationInterstitialAdCallback0 != null) {
                mediationInterstitialAdCallback0.onAdClosed();
            }
        }
    }

    @Override  // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad0) {
        if(!this.f.getAndSet(true)) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback0 = this.d;
            if(mediationInterstitialAdCallback0 != null) {
                mediationInterstitialAdCallback0.onAdClosed();
            }
        }
    }

    @Override  // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad0) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback0 = this.d;
        if(mediationInterstitialAdCallback0 != null) {
            mediationInterstitialAdCallback0.onAdOpened();
        }
    }

    @Override  // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad0) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback0 = this.d;
        if(mediationInterstitialAdCallback0 != null) {
            mediationInterstitialAdCallback0.reportAdImpression();
        }
    }

    @Override  // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override  // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override  // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context0) {
        this.e.set(true);
        if(!this.c.show()) {
            AdError adError0 = new AdError(110, "Failed to present interstitial ad.", "com.google.ads.mediation.facebook");
            Log.w("FacebookMediationAdapter", "{\n  \"Code\": 110,\n  \"Message\": \"Failed to present interstitial ad.\",\n  \"Domain\": \"com.google.ads.mediation.facebook\",\n  \"Cause\": \"null\"\n}");
            MediationInterstitialAdCallback mediationInterstitialAdCallback0 = this.d;
            if(mediationInterstitialAdCallback0 != null) {
                mediationInterstitialAdCallback0.onAdFailedToShow(adError0);
            }
        }
    }
}

