package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.Y;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class zzcfp extends WebViewClient implements zzcgv {
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final HashSet zzD;
    private final zzecs zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbxb zza;
    public static final int zzb;
    private final zzcfi zzc;
    private final zzaxe zzd;
    private final HashMap zze;
    private final Object zzf;
    private zza zzg;
    private zzo zzh;
    private zzcgt zzi;
    private zzcgu zzj;
    private zzbhh zzk;
    private zzbhj zzl;
    private zzddw zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private String zzq;
    private String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private zzz zzv;
    private zzbre zzw;
    private zzb zzx;
    private zzbqz zzy;
    private boolean zzz;

    public zzcfp(zzcfi zzcfi0, zzaxe zzaxe0, boolean z, zzbre zzbre0, zzbqz zzbqz0, zzecs zzecs0) {
        this.zze = new HashMap();
        this.zzf = new Object();
        this.zzp = 0;
        this.zzq = "";
        this.zzr = "";
        this.zzd = zzaxe0;
        this.zzc = zzcfi0;
        this.zzs = z;
        this.zzw = zzbre0;
        this.zzy = null;
        this.zzD = new HashSet(Arrays.asList(((String)zzba.zzc().zzb(zzbbr.zzfw)).split(",")));
        this.zzE = zzecs0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zza0 = this.zzg;
        if(zza0 != null) {
            zza0.onAdClicked();
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView0, String s) {
        zze.zza(("Loading resource: " + s));
        Uri uri0 = Uri.parse(s);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.zzj(uri0);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        synchronized(this.zzf) {
            if(this.zzc.zzaz()) {
                zze.zza("Blank page loaded, 1...");
                this.zzc.zzU();
                return;
            }
        }
        this.zzz = true;
        zzcgu zzcgu0 = this.zzj;
        if(zzcgu0 != null) {
            zzcgu0.zza();
            this.zzj = null;
        }
        this.zzg();
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        this.zzo = true;
        this.zzp = v;
        this.zzq = s;
        this.zzr = s1;
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
        boolean z = renderProcessGoneDetail0.didCrash();
        int v = renderProcessGoneDetail0.rendererPriorityAtExit();
        return this.zzc.zzay(z, v);
    }

    @Override  // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        return this.zzc(s, Collections.emptyMap());
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView0, KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        if(v != 0x4F && v != 0xDE) {
            switch(v) {
                case 85: 
                case 86: 
                case 87: 
                case 88: 
                case 89: 
                case 90: 
                case 91: {
                    break;
                }
                default: {
                    return v == 0x7E || v == 0x7F || v == 0x80 || v == 0x81 || v == 130;
                }
            }
        }
        return true;
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        zze.zza(("AdWebView shouldOverrideUrlLoading: " + s));
        Uri uri0 = Uri.parse(s);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.zzj(uri0);
            return true;
        }
        if(this.zzn && webView0 == this.zzc.zzG()) {
            String s1 = uri0.getScheme();
            if("http".equalsIgnoreCase(s1) || "https".equalsIgnoreCase(s1)) {
                zza zza0 = this.zzg;
                if(zza0 != null) {
                    zza0.onAdClicked();
                    zzbxb zzbxb0 = this.zza;
                    if(zzbxb0 != null) {
                        zzbxb0.zzh(s);
                    }
                    this.zzg = null;
                }
                zzddw zzddw0 = this.zzm;
                if(zzddw0 != null) {
                    zzddw0.zzbK();
                    this.zzm = null;
                }
                return super.shouldOverrideUrlLoading(webView0, s);
            }
        }
        if(!this.zzc.zzG().willNotDraw()) {
            try {
                zzaqx zzaqx0 = this.zzc.zzI();
                if(zzaqx0 != null && zzaqx0.zzf(uri0)) {
                    Context context0 = this.zzc.getContext();
                    Activity activity0 = this.zzc.zzi();
                    uri0 = zzaqx0.zza(uri0, context0, ((View)this.zzc), activity0);
                }
            }
            catch(zzaqy unused_ex) {
                zzcaa.zzj(("Unable to append parameter to URL: " + s));
            }
            if(this.zzx != null && !this.zzx.zzc()) {
                this.zzx.zzb(s);
                return true;
            }
            this.zzt(new zzc("android.intent.action.VIEW", uri0.toString(), null, null, null, null, null, null), true);
            return true;
        }
        zzcaa.zzj(("AdWebView unable to handle URL: " + s));
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzA(zzcgt zzcgt0) {
        this.zzi = zzcgt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzB(int v, int v1) {
        zzbqz zzbqz0 = this.zzy;
        if(zzbqz0 != null) {
            zzbqz0.zzd(v, v1);
        }
    }

    public final void zzC(boolean z) {
        this.zzn = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzD(boolean z) {
        synchronized(this.zzf) {
            this.zzu = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzE() {
        synchronized(this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcfk zzcfk0 = () -> {
                this.zzc.zzaa();
                zzl zzl0 = this.zzc.zzL();
                if(zzl0 != null) {
                    zzl0.zzz();
                }
            };
            zzcan.zze.execute(zzcfk0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzF(boolean z) {
        synchronized(this.zzf) {
            this.zzt = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzG(zzcgu zzcgu0) {
        this.zzj = zzcgu0;
    }

    public final void zzH(String s, zzbir zzbir0) {
        synchronized(this.zzf) {
            List list0 = (List)this.zze.get(s);
            if(list0 == null) {
                return;
            }
            list0.remove(zzbir0);
        }
    }

    public final void zzI(String s, Predicate predicate0) {
        synchronized(this.zzf) {
            List list0 = (List)this.zze.get(s);
            if(list0 == null) {
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: list0) {
                zzbir zzbir0 = (zzbir)object1;
                if(predicate0.apply(zzbir0)) {
                    arrayList0.add(zzbir0);
                }
            }
            list0.removeAll(arrayList0);
        }
    }

    public final boolean zzJ() {
        synchronized(this.zzf) {
        }
        return this.zzu;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzK() {
        synchronized(this.zzf) {
        }
        return this.zzs;
    }

    public final boolean zzL() {
        synchronized(this.zzf) {
        }
        return this.zzt;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzM(zza zza0, zzbhh zzbhh0, zzo zzo0, zzbhj zzbhj0, zzz zzz0, boolean z, zzbit zzbit0, zzb zzb0, zzbrg zzbrg0, zzbxb zzbxb0, zzech zzech0, zzfik zzfik0, zzdrh zzdrh0, zzfgo zzfgo0, zzbjk zzbjk0, zzddw zzddw0, zzbjj zzbjj0, zzbjd zzbjd0, zzcob zzcob0) {
        zzb zzb1 = zzb0 == null ? new zzb(this.zzc.getContext(), zzbxb0, null) : zzb0;
        this.zzy = new zzbqz(this.zzc, zzbrg0);
        this.zza = zzbxb0;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzaP)).booleanValue()) {
            this.zzz("/adMetadata", new zzbhg(zzbhh0));
        }
        if(zzbhj0 != null) {
            this.zzz("/appEvent", new zzbhi(zzbhj0));
        }
        this.zzz("/backButton", zzbiq.zzj);
        this.zzz("/refresh", zzbiq.zzk);
        this.zzz("/canOpenApp", zzbiq.zzb);
        this.zzz("/canOpenURLs", zzbiq.zza);
        this.zzz("/canOpenIntents", zzbiq.zzc);
        this.zzz("/close", zzbiq.zzd);
        this.zzz("/customClose", zzbiq.zze);
        this.zzz("/instrument", zzbiq.zzn);
        this.zzz("/delayPageLoaded", zzbiq.zzp);
        this.zzz("/delayPageClosed", zzbiq.zzq);
        this.zzz("/getLocationInfo", zzbiq.zzr);
        this.zzz("/log", zzbiq.zzg);
        this.zzz("/mraid", new zzbix(zzb1, this.zzy, zzbrg0));
        zzbre zzbre0 = this.zzw;
        if(zzbre0 != null) {
            this.zzz("/mraidLoaded", zzbre0);
        }
        this.zzz("/open", new zzbjc(zzb1, this.zzy, zzech0, zzdrh0, zzfgo0, zzcob0));
        this.zzz("/precache", new zzcdv());
        this.zzz("/touch", zzbiq.zzi);
        this.zzz("/video", zzbiq.zzl);
        this.zzz("/videoMeta", zzbiq.zzm);
        if(zzech0 == null || zzfik0 == null) {
            this.zzz("/click", new zzbhr(zzddw0, zzcob0));
            this.zzz("/httpTrack", zzbiq.zzf);
        }
        else {
            this.zzz("/click", new zzfcg(zzddw0, zzcob0, zzfik0, zzech0));
            this.zzz("/httpTrack", new zzfch(zzfik0, zzech0));
        }
        if(zzt.zzn().zzu(this.zzc.getContext())) {
            this.zzz("/logScionEvent", new zzbiw(this.zzc.getContext()));
        }
        if(zzbit0 != null) {
            this.zzz("/setInterstitialProperties", new zzbis(zzbit0));
        }
        if(zzbjk0 != null && ((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
            this.zzz("/inspectorNetworkExtras", zzbjk0);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziS)).booleanValue() && zzbjj0 != null) {
            this.zzz("/shareSheet", zzbjj0);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziX)).booleanValue() && zzbjd0 != null) {
            this.zzz("/inspectorOutOfContextTest", zzbjd0);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkl)).booleanValue()) {
            this.zzz("/bindPlayStoreOverlay", zzbiq.zzu);
            this.zzz("/presentPlayStoreOverlay", zzbiq.zzv);
            this.zzz("/expandPlayStoreOverlay", zzbiq.zzw);
            this.zzz("/collapsePlayStoreOverlay", zzbiq.zzx);
            this.zzz("/closePlayStoreOverlay", zzbiq.zzy);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzcW)).booleanValue()) {
            this.zzz("/setPAIDPersonalizationEnabled", zzbiq.zzA);
            this.zzz("/resetPAID", zzbiq.zzz);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkC)).booleanValue() && (this.zzc.zzD() != null && this.zzc.zzD().zzar)) {
            this.zzz("/writeToLocalStorage", zzbiq.zzB);
            this.zzz("/clearLocalStorageKeys", zzbiq.zzC);
        }
        this.zzg = zza0;
        this.zzh = zzo0;
        this.zzk = zzbhh0;
        this.zzl = zzbhj0;
        this.zzv = zzz0;
        this.zzx = zzb1;
        this.zzm = zzddw0;
        this.zzn = z;
    }

    // 去混淆评级： 低(20)
    private static WebResourceResponse zzN() {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzaH)).booleanValue() ? new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0])) : null;
    }

    private final WebResourceResponse zzO(String s, Map map0) {
        WebResourceResponse webResourceResponse2;
        WebResourceResponse webResourceResponse1;
        WebResourceResponse webResourceResponse0;
        URLConnection uRLConnection0;
        URL uRL0 = new URL(s);
        try {
            TrafficStats.setThreadStatsTag(0x108);
            int v = 0;
            while(true) {
            label_3:
                ++v;
                if(v > 20) {
                    goto label_75;
                }
                uRLConnection0 = uRL0.openConnection();
                uRLConnection0.setConnectTimeout(10000);
                uRLConnection0.setReadTimeout(10000);
                for(Object object0: map0.entrySet()) {
                    uRLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                if(!(uRLConnection0 instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, ((HttpURLConnection)uRLConnection0), false, 60000);
                zzbzz zzbzz0 = new zzbzz(null);
                zzbzz0.zzc(((HttpURLConnection)uRLConnection0), null);
                int v1 = ((HttpURLConnection)uRLConnection0).getResponseCode();
                zzbzz0.zze(((HttpURLConnection)uRLConnection0), v1);
                if(v1 < 300 || v1 >= 400) {
                    String s1 = "";
                    String s2 = ((HttpURLConnection)uRLConnection0).getContentType();
                    String s3 = TextUtils.isEmpty(s2) ? "" : s2.split(";")[0].trim();
                    String s4 = ((HttpURLConnection)uRLConnection0).getContentType();
                    if(!TextUtils.isEmpty(s4)) {
                        String[] arr_s = s4.split(";");
                        if(arr_s.length != 1) {
                            for(int v2 = 1; v2 < arr_s.length; ++v2) {
                                if(arr_s[v2].trim().startsWith("charset")) {
                                    String[] arr_s1 = arr_s[v2].trim().split("=");
                                    if(arr_s1.length > 1) {
                                        s1 = arr_s1[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    Map map1 = ((HttpURLConnection)uRLConnection0).getHeaderFields();
                    HashMap hashMap0 = new HashMap(map1.size());
                    for(Object object1: map1.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object1;
                        if(map$Entry0.getKey() != null && map$Entry0.getValue() != null && !((List)map$Entry0.getValue()).isEmpty()) {
                            hashMap0.put(((String)map$Entry0.getKey()), ((String)((List)map$Entry0.getValue()).get(0)));
                        }
                    }
                    webResourceResponse0 = zzt.zzq().zzc(s3, s1, ((HttpURLConnection)uRLConnection0).getResponseCode(), ((HttpURLConnection)uRLConnection0).getResponseMessage(), hashMap0, ((HttpURLConnection)uRLConnection0).getInputStream());
                    break;
                }
                goto label_49;
            }
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
        TrafficStats.clearThreadStatsTag();
        return webResourceResponse0;
        try {
        label_49:
            String s5 = ((HttpURLConnection)uRLConnection0).getHeaderField("Location");
            if(s5 == null) {
                throw new IOException("Missing Location header in redirect");
            }
            if(!s5.startsWith("tel:")) {
                URL uRL1 = new URL(uRL0, s5);
                String s6 = uRL1.getProtocol();
                if(s6 != null) {
                    if(s6.equals("http") || s6.equals("https")) {
                        zzcaa.zze(("Redirecting to " + s5));
                        ((HttpURLConnection)uRLConnection0).disconnect();
                        uRL0 = uRL1;
                        goto label_3;
                    }
                    zzcaa.zzj(("Unsupported scheme: " + s6));
                    webResourceResponse1 = zzcfp.zzN();
                    goto label_63;
                }
                goto label_65;
            }
            goto label_73;
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
    label_63:
        TrafficStats.clearThreadStatsTag();
        return webResourceResponse1;
        try {
        label_65:
            zzcaa.zzj("Protocol is null");
            webResourceResponse2 = zzcfp.zzN();
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
        TrafficStats.clearThreadStatsTag();
        return webResourceResponse2;
    label_73:
        TrafficStats.clearThreadStatsTag();
        return null;
    label_75:
        TrafficStats.clearThreadStatsTag();
        throw new IOException("Too many redirects (20)");
    }

    private final void zzP(Map map0, List list0, String s) {
        if(zze.zzc()) {
            zze.zza(("Received GMSG: " + s));
            for(Object object0: map0.keySet()) {
                zze.zza(("  " + ((String)object0) + ": " + ((String)map0.get(((String)object0)))));
            }
        }
        for(Object object1: list0) {
            ((zzbir)object1).zza(this.zzc, map0);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener view$OnAttachStateChangeListener0 = this.zzF;
        if(view$OnAttachStateChangeListener0 == null) {
            return;
        }
        ((View)this.zzc).removeOnAttachStateChangeListener(view$OnAttachStateChangeListener0);
    }

    private final void zzR(View view0, zzbxb zzbxb0, int v) {
        if(zzbxb0.zzi() && v > 0) {
            zzbxb0.zzg(view0);
            if(zzbxb0.zzi()) {
                zzcfl zzcfl0 = () -> this.zzR(view0, zzbxb0, v - 1);
                zzs.zza.postDelayed(zzcfl0, 100L);
            }
        }
    }

    private static final boolean zzS(zzcfi zzcfi0) {
        return zzcfi0.zzD() == null ? false : zzcfi0.zzD().zzaj;
    }

    // 去混淆评级： 低(30)
    private static final boolean zzT(boolean z, zzcfi zzcfi0) {
        return z && !zzcfi0.zzO().zzi() && !zzcfi0.zzS().equals("interstitial_mb");
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized(this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized(this.zzf) {
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzddw zzddw0 = this.zzm;
        if(zzddw0 != null) {
            zzddw0.zzbK();
        }
    }

    protected final WebResourceResponse zzc(String s, Map map0) {
        try {
            String s1 = zzbyh.zzc(s, this.zzc.getContext(), this.zzC);
            if(!s1.equals(s)) {
                return this.zzO(s1, map0);
            }
            zzawq zzawq0 = zzawq.zza(Uri.parse(s));
            if(zzawq0 != null) {
                zzawn zzawn0 = zzt.zzc().zzb(zzawq0);
                if(zzawn0 != null && zzawn0.zze()) {
                    return new WebResourceResponse("", "", zzawn0.zzc());
                }
            }
            return !zzbzz.zzk() || !((Boolean)zzbdg.zzb.zze()).booleanValue() ? null : this.zzO(s, map0);
        }
        catch(Exception | NoClassDefFoundError exception0) {
        }
        zzt.zzo().zzu(exception0, "AdWebViewClient.interceptRequest");
        return zzcfp.zzN();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final zzb zzd() {
        return this.zzx;
    }

    static void zze(zzcfp zzcfp0, Map map0, List list0, String s) {
        zzcfp0.zzP(map0, list0, s);
    }

    static void zzf(zzcfp zzcfp0, View view0, zzbxb zzbxb0, int v) {
        zzcfp0.zzR(view0, zzbxb0, 10);
    }

    public final void zzg() {
        if(this.zzi != null && (this.zzz && this.zzB <= 0 || this.zzA || this.zzo)) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && this.zzc.zzm() != null) {
                zzbcb.zza(this.zzc.zzm().zza(), this.zzc.zzk(), new String[]{"awfllc"});
            }
            this.zzi.zza(!this.zzA && !this.zzo, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbxb zzbxb0 = this.zza;
        if(zzbxb0 != null) {
            zzbxb0.zze();
            this.zza = null;
        }
        this.zzQ();
        synchronized(this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbqz zzbqz0 = this.zzy;
            if(zzbqz0 != null) {
                zzbqz0.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z) {
        this.zzC = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzj(Uri uri0) {
        String s = uri0.getPath();
        List list0 = (List)this.zze.get(s);
        if(s != null && list0 != null) {
            String s1 = uri0.getEncodedQuery();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzfv)).booleanValue() && this.zzD.contains(s) && s1 != null && s1.length() >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfx))))) {
                zze.zza(("Parsing gmsg query params on BG thread: " + s));
                zzfye.zzr(zzt.zzp().zzb(uri0), new zzcfn(this, list0, s, uri0), zzcan.zze);
                return;
            }
            this.zzP(zzs.zzM(uri0), list0, s);
            return;
        }
        zze.zza(("No GMSG handler found for GMSG: " + uri0));
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgE)).booleanValue() && zzt.zzo().zzf() != null) {
            zzcfj zzcfj0 = new zzcfj((s == null || s.length() < 2 ? "null" : s.substring(1)));
            zzcan.zza.execute(zzcfj0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzk() {
        zzaxe zzaxe0 = this.zzd;
        if(zzaxe0 != null) {
            zzaxe0.zzc(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        this.zzg();
        this.zzc.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzl() {
        synchronized(this.zzf) {
        }
        ++this.zzB;
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzm() {
        --this.zzB;
        this.zzg();
    }

    // 检测为 Lambda 实现
    final void zzn() [...]

    // 检测为 Lambda 实现
    final void zzo(View view0, zzbxb zzbxb0, int v) [...]

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzp(int v, int v1, boolean z) {
        zzbre zzbre0 = this.zzw;
        if(zzbre0 != null) {
            zzbre0.zzb(v, v1);
        }
        zzbqz zzbqz0 = this.zzy;
        if(zzbqz0 != null) {
            zzbqz0.zzc(v, v1, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgv
    public final void zzq() {
        zzbxb zzbxb0 = this.zza;
        if(zzbxb0 != null) {
            WebView webView0 = this.zzc.zzG();
            if(Y.R(webView0)) {
                this.zzR(webView0, zzbxb0, 10);
                return;
            }
            this.zzQ();
            zzcfm zzcfm0 = new zzcfm(this, zzbxb0);
            this.zzF = zzcfm0;
            ((View)this.zzc).addOnAttachStateChangeListener(zzcfm0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzddw zzddw0 = this.zzm;
        if(zzddw0 != null) {
            zzddw0.zzs();
        }
    }

    // 去混淆评级： 低(20)
    public final void zzt(zzc zzc0, boolean z) {
        boolean z1 = this.zzc.zzaA();
        boolean z2 = zzcfp.zzT(z1, this.zzc);
        this.zzw(new AdOverlayInfoParcel(zzc0, (z2 ? null : this.zzg), (z1 ? null : this.zzh), this.zzv, this.zzc.zzn(), this.zzc, (z2 || !z ? null : this.zzm)));
    }

    public final void zzu(String s, String s1, int v) {
        zzcag zzcag0 = this.zzc.zzn();
        this.zzw(new AdOverlayInfoParcel(this.zzc, zzcag0, s, s1, 14, this.zzE));
    }

    public final void zzv(boolean z, int v, boolean z1) {
        boolean z2 = zzcfp.zzT(this.zzc.zzaA(), this.zzc);
        zza zza0 = z2 ? null : this.zzg;
        zzo zzo0 = this.zzh;
        zzz zzz0 = this.zzv;
        zzcag zzcag0 = this.zzc.zzn();
        this.zzw(new AdOverlayInfoParcel(zza0, zzo0, zzz0, this.zzc, z, v, zzcag0, (z2 || !z1 ? null : this.zzm), (zzcfp.zzS(this.zzc) ? this.zzE : null)));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel0) {
        boolean z = this.zzy == null ? false : this.zzy.zze();
        zzm.zza(this.zzc.getContext(), adOverlayInfoParcel0, !z);
        zzbxb zzbxb0 = this.zza;
        if(zzbxb0 != null) {
            String s = adOverlayInfoParcel0.zzl;
            if(s == null) {
                zzc zzc0 = adOverlayInfoParcel0.zza;
                if(zzc0 != null) {
                    s = zzc0.zzb;
                }
            }
            zzbxb0.zzh(s);
        }
    }

    public final void zzx(boolean z, int v, String s, boolean z1) {
        boolean z2 = this.zzc.zzaA();
        boolean z3 = zzcfp.zzT(z2, this.zzc);
        zza zza0 = z3 ? null : this.zzg;
        zzcfo zzcfo0 = z2 ? null : new zzcfo(this.zzc, this.zzh);
        zzbhh zzbhh0 = this.zzk;
        zzbhj zzbhj0 = this.zzl;
        zzz zzz0 = this.zzv;
        zzcag zzcag0 = this.zzc.zzn();
        this.zzw(new AdOverlayInfoParcel(zza0, zzcfo0, zzbhh0, zzbhj0, zzz0, this.zzc, z, v, s, zzcag0, (z3 || !z1 ? null : this.zzm), (zzcfp.zzS(this.zzc) ? this.zzE : null)));
    }

    public final void zzy(boolean z, int v, String s, String s1, boolean z1) {
        boolean z2 = this.zzc.zzaA();
        boolean z3 = zzcfp.zzT(z2, this.zzc);
        zza zza0 = z3 ? null : this.zzg;
        zzcfo zzcfo0 = z2 ? null : new zzcfo(this.zzc, this.zzh);
        zzbhh zzbhh0 = this.zzk;
        zzbhj zzbhj0 = this.zzl;
        zzz zzz0 = this.zzv;
        zzcag zzcag0 = this.zzc.zzn();
        this.zzw(new AdOverlayInfoParcel(zza0, zzcfo0, zzbhh0, zzbhj0, zzz0, this.zzc, z, v, s, s1, zzcag0, (z3 || !z1 ? null : this.zzm), (zzcfp.zzS(this.zzc) ? this.zzE : null)));
    }

    public final void zzz(String s, zzbir zzbir0) {
        synchronized(this.zzf) {
            List list0 = (List)this.zze.get(s);
            if(list0 == null) {
                list0 = new CopyOnWriteArrayList();
                this.zze.put(s, list0);
            }
            list0.add(zzbir0);
        }
    }
}

