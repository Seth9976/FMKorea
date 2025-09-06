package D0;

import I0.c;
import I0.h;
import I0.i;
import W1.d;
import android.app.Activity;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.util.Map;
import org.json.JSONObject;

public class e extends c {
    private static final String a = "e";
    public static InterstitialAd b = null;
    public static boolean c = false;
    public static AdView d = null;
    private static boolean e = false;

    static {
    }

    // 去混淆评级： 低(20)
    static String D() [...] // 潜在的解密器

    private AdRequest E() {
        return new Builder().build();
    }

    private void F(Activity activity0) {
        AdView adView0 = e.d;
        if(adView0 == null) {
            return;
        }
        adView0.pause();
        e.d.destroy();
        RelativeLayout relativeLayout0 = f.b(activity0);
        if(relativeLayout0 == null) {
            return;
        }
        relativeLayout0.removeView(e.d);
        relativeLayout0.setVisibility(8);
        e.d = null;
    }

    private void G(Activity activity0) {
        class a extends AdListener {
            final e f;

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError0) {
                Log.e("e", "Failed to load banner: " + loadAdError0.toString());
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Log.d("e", "Successfully loaded the banner");
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }
        }


        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            final ViewGroup f;
            final Activity g;
            final e h;

            b(ViewGroup viewGroup0, Activity activity0) {
                this.f = viewGroup0;
                this.g = activity0;
                super();
            }

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                float f = ((float)(this.f.getRootView().getHeight() - this.f.getHeight())) * 160.0f / ((float)this.g.getResources().getDisplayMetrics().densityDpi);
                Activity activity0 = this.g;
                if(activity0 instanceof h) {
                    RelativeLayout relativeLayout0 = f.b(activity0);
                    if(relativeLayout0 == null) {
                        return;
                    }
                    if(f > 200.0f) {
                        relativeLayout0.setVisibility(8);
                        return;
                    }
                    if(e.d != null) {
                        relativeLayout0.setVisibility(0);
                    }
                }
            }
        }

        I0.a a0 = I0.a.V(activity0);
        RelativeLayout relativeLayout0 = f.b(activity0);
        if(relativeLayout0 != null) {
            AdView adView0 = new AdView(activity0);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout$LayoutParams0.addRule(13, -1);
            adView0.setLayoutParams(relativeLayout$LayoutParams0);
            adView0.setAdListener(new a(this));
            relativeLayout0.addView(adView0);
            adView0.setAdUnitId(a0.f2);
            adView0.setAdSize(this.H(activity0));
            adView0.loadAd(this.E());
            relativeLayout0.setVisibility(0);
            e.d = adView0;
        }
        ViewGroup viewGroup0 = f.c(activity0);
        if(viewGroup0 != null) {
            viewGroup0.getViewTreeObserver().addOnGlobalLayoutListener(new b(this, viewGroup0, activity0));
        }
    }

    private AdSize H(Activity activity0) {
        Display display0 = activity0.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        display0.getMetrics(displayMetrics0);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity0, ((int)(((float)displayMetrics0.widthPixels) / displayMetrics0.density)));
    }

    // 检测为 Lambda 实现
    private static void I(InitializationStatus initializationStatus0) [...]

    // 检测为 Lambda 实现
    private static void J(Activity activity0, String s, W1.e e0) [...]

    // 检测为 Lambda 实现
    private static void K(Activity activity0, String s) [...]

    // 检测为 Lambda 实现
    private static void L(Activity activity0, String s, W1.e e0) [...]

    private void M(Activity activity0) {
        class D0.e.c extends InterstitialAdLoadCallback {
            final Activity a;
            final e b;

            D0.e.c(Activity activity0) {
                this.a = activity0;
                super();
            }

            public void a(InterstitialAd interstitialAd0) {
                e.b = interstitialAd0;
                if(e.c) {
                    e.c = false;
                    e.b.show(this.a);
                }
            }

            @Override  // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError0) {
                Log.e("e", "Interstitial ad failed to load: " + loadAdError0.toString());
                e.b = null;
            }

            @Override  // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(Object object0) {
                this.a(((InterstitialAd)object0));
            }
        }

        I0.a a0 = I0.a.V(activity0);
        if(a0.e2) {
            String s = a0.g2;
            if(s != null && e.b == null) {
                InterstitialAd.load(activity0, s, this.E(), new D0.e.c(this, activity0));
            }
        }
    }

    private void N(Activity activity0, String s) {
        d d0 = new W1.d.a().b(false).a();
        W1.f.a(activity0).requestConsentInfoUpdate(activity0, d0, () -> W1.f.b(activity0, (W1.e e0) -> {
            if(e0 != null) {
                f.f(activity0, s, false, e0.b());
                Log.w("e", String.format("%s: %s", e0.a(), e0.b()));
                return;
            }
            f.f(activity0, s, true, "Consent has been gathered");
        }), (W1.e e0) -> {
            f.f(activity0, s, false, e0.b());
            Log.w("e", String.format("%s: %s", e0.a(), e0.b()));
        });
    }

    private void O() {
        e.b = null;
    }

    private void P(boolean z) {
        e.e = z;
    }

    private void Q(Activity activity0) {
        InterstitialAd interstitialAd0 = e.b;
        if(interstitialAd0 == null) {
            e.c = true;
            this.M(activity0);
            return;
        }
        interstitialAd0.show(activity0);
    }

    private void R(Activity activity0) {
        InterstitialAd interstitialAd0 = e.b;
        if(interstitialAd0 == null) {
            this.Q(activity0);
            return;
        }
        interstitialAd0.show(activity0);
    }

    private void S(Activity activity0) {
        if(e.e) {
            e.e = false;
            this.R(activity0);
        }
    }

    @Override  // I0.c
    public void a(Activity activity0, boolean z) {
        I0.a a0 = I0.a.V(activity0);
        if(a0.e2 && a0.i2) {
            this.N(activity0, "median_admob_request_consent");
        }
    }

    @Override  // I0.c
    public void h(Activity activity0) {
        I0.a a0 = I0.a.V(activity0);
        if(a0.e2 && a0.h2 && a0.f2 != null) {
            this.G(activity0);
        }
        if(a0.e2 && a0.g2 != null) {
            this.M(activity0);
        }
    }

    @Override  // I0.c
    public void l(Activity activity0) {
        this.S(activity0);
    }

    @Override  // I0.c
    public void o(i i0) {
        super.o(i0);
        if(I0.a.V(i0).e2) {
            MobileAds.initialize(i0, (InitializationStatus initializationStatus0) -> {
                Map map0 = initializationStatus0.getAdapterStatusMap();
                for(Object object0: map0.keySet()) {
                    Log.d("e", "Key =" + ((String)object0) + ", Val = " + ((AdapterStatus)map0.get(((String)object0))).getInitializationState().name() + ", desc = " + ((AdapterStatus)map0.get(((String)object0))).getDescription());
                }
            });
        }
    }

    @Override  // I0.c
    public boolean q(Activity activity0, Uri uri0, JSONObject jSONObject0) {
        String s = "median_admob_request_consent";
        super.q(activity0, uri0, jSONObject0);
        if("admob".equals(uri0.getHost())) {
            if("/showInterstitialIfReady".equals(uri0.getPath())) {
                this.R(activity0);
                return true;
            }
            if("/showInterstitialOnNextPageLoadIfReady".equals(uri0.getPath())) {
                this.P(true);
                return true;
            }
            if("/showInterstitialWhenReady".equals(uri0.getPath())) {
                this.Q(activity0);
                return true;
            }
            if("/banner/enable".equals(uri0.getPath())) {
                this.G(activity0);
                return true;
            }
            if("/banner/disable".equals(uri0.getPath())) {
                this.F(activity0);
                return true;
            }
            if("/request/consent".equals(uri0.getPath())) {
                if(jSONObject0 != null) {
                    s = jSONObject0.optString("callback", "median_admob_request_consent");
                }
                this.N(activity0, s);
            }
            return true;
        }
        return false;
    }

    @Override  // I0.c
    public void s(Activity activity0, WebView webView0) {
        MobileAds.registerWebView(webView0);
    }

    @Override  // I0.c
    public void u(Activity activity0) {
        this.O();
        this.M(activity0);
    }
}

