package com.google.android.gms.internal.ads;

import Z1.d;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzcf;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zzcm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
final class zzcgb extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzcfi {
    private boolean zzA;
    private boolean zzB;
    private zzbej zzC;
    private zzbeh zzD;
    private zzavs zzE;
    private int zzF;
    private int zzG;
    private zzbcg zzH;
    private final zzbcg zzI;
    private zzbcg zzJ;
    private final zzbch zzK;
    private int zzL;
    private zzl zzM;
    private boolean zzN;
    private final zzcm zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzaxe zzV;
    public static final int zza;
    private final zzcgw zzb;
    private final zzaqx zzc;
    private final zzbct zzd;
    private final zzcag zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfbe zzj;
    private zzfbi zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcfp zzn;
    private zzl zzo;
    private zzfip zzp;
    private zzcgx zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcge zzz;

    protected zzcgb(zzcgw zzcgw0, zzcgx zzcgx0, String s, boolean z, boolean z1, zzaqx zzaqx0, zzbct zzbct0, zzcag zzcag0, zzbcj zzbcj0, com.google.android.gms.ads.internal.zzl zzl0, zza zza0, zzaxe zzaxe0, zzfbe zzfbe0, zzfbi zzfbi0) {
        super(zzcgw0);
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzcgw0;
        this.zzq = zzcgx0;
        this.zzr = s;
        this.zzu = z;
        this.zzc = zzaqx0;
        this.zzd = zzbct0;
        this.zze = zzcag0;
        this.zzf = zzl0;
        this.zzg = zza0;
        WindowManager windowManager0 = (WindowManager)this.getContext().getSystemService("window");
        this.zzU = windowManager0;
        DisplayMetrics displayMetrics0 = zzs.zzq(windowManager0);
        this.zzh = displayMetrics0;
        this.zzi = displayMetrics0.density;
        this.zzV = zzaxe0;
        this.zzj = zzfbe0;
        this.zzk = zzfbi0;
        this.zzO = new zzcm(zzcgw0.zza(), this, this, null);
        this.setBackgroundColor(0);
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setAllowFileAccess(false);
        try {
            webSettings0.setJavaScriptEnabled(true);
        }
        catch(NullPointerException nullPointerException0) {
            zzcaa.zzh("Unable to enable Javascript.", nullPointerException0);
        }
        webSettings0.setSavePassword(false);
        webSettings0.setSupportMultipleWindows(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(true);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkr)).booleanValue()) {
            webSettings0.setMixedContentMode(1);
        }
        else {
            webSettings0.setMixedContentMode(2);
        }
        webSettings0.setUserAgentString(zzt.zzp().zzc(zzcgw0, zzcag0.zza));
        Context context0 = this.getContext();
        zzcf.zza(context0, new zzm(webSettings0, context0));
        webSettings0.setAllowFileAccessFromFileURLs(false);
        webSettings0.setAllowUniversalAccessFromFileURLs(false);
        webSettings0.setMediaPlaybackRequiresUserGesture(false);
        this.setDownloadListener(this);
        this.zzaS();
        this.addJavascriptInterface(new zzcgi(this, new zzcgh(this)), "googleAdsJsInterface");
        this.removeJavascriptInterface("accessibility");
        this.removeJavascriptInterface("accessibilityTraversal");
        this.zzba();
        zzbch zzbch0 = new zzbch(new zzbcj(true, "make_wv", this.zzr));
        this.zzK = zzbch0;
        zzbch0.zza().zzc(null);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && (this.zzk != null && this.zzk.zzb != null)) {
            zzbch0.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbcg zzbcg0 = zzbcj.zzf();
        this.zzI = zzbcg0;
        zzbch0.zzb("native:view_create", zzbcg0);
        this.zzJ = null;
        this.zzH = null;
        zzci.zza().zzb(zzcgw0);
        zzt.zzo().zzr();
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void destroy() {
        synchronized(this) {
            this.zzba();
            this.zzO.zza();
            zzl zzl0 = this.zzo;
            if(zzl0 != null) {
                zzl0.zzb();
                this.zzo.zzm();
                this.zzo = null;
            }
            this.zzp = null;
            this.zzn.zzh();
            this.zzE = null;
            this.zzf = null;
            this.setOnClickListener(null);
            this.setOnTouchListener(null);
            if(this.zzt) {
                return;
            }
            zzt.zzy().zzd(this);
            this.zzaZ();
            this.zzt = true;
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzjM)).booleanValue()) {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                this.zzaX("about:blank");
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            this.zzU();
        }
    }

    @Override  // android.webkit.WebView
    public final void evaluateJavascript(String s, ValueCallback valueCallback0) {
        synchronized(this) {
            if(this.zzaz()) {
                zzcaa.zzl("#004 The webview is destroyed. Ignoring action.", null);
                if(valueCallback0 != null) {
                    valueCallback0.onReceiveValue(null);
                    return;
                }
                return;
            }
            super.evaluateJavascript(s, valueCallback0);
        }
    }

    @Override
    protected final void finalize() {
        try {
            synchronized(this) {
                if(!this.zzt) {
                    this.zzn.zzh();
                    zzt.zzy().zzd(this);
                    this.zzaZ();
                    this.zzaT();
                }
            }
        }
        finally {
            super.finalize();
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void loadData(String s, String s1, String s2) {
        synchronized(this) {
            if(!this.zzaz()) {
                super.loadData(s, s1, s2);
                return;
            }
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        synchronized(this) {
            if(!this.zzaz()) {
                super.loadDataWithBaseURL(s, s1, s2, s3, s4);
                return;
            }
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void loadUrl(String s) {
        synchronized(this) {
            if(!this.zzaz()) {
                try {
                    super.loadUrl(s);
                }
                catch(Throwable throwable0) {
                    zzt.zzo().zzu(throwable0, "AdWebViewImpl.loadUrl");
                    zzcaa.zzk("Could not call loadUrl. ", throwable0);
                    return;
                }
                return;
            }
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfp zzcfp0 = this.zzn;
        if(zzcfp0 != null) {
            zzcfp0.onAdClicked();
        }
    }

    @Override  // android.webkit.WebView
    protected final void onAttachedToWindow() {
        synchronized(this) {
            super.onAttachedToWindow();
            if(!this.zzaz()) {
                this.zzO.zzc();
            }
            boolean z = this.zzA;
            if(this.zzn != null && this.zzn.zzL()) {
                if(!this.zzB) {
                    this.zzB = true;
                }
                this.zzaR();
                z = true;
            }
            this.zzaV(z);
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onDetachedFromWindow() {
        synchronized(this) {
            if(!this.zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if(this.zzB && (this.zzn != null && this.zzn.zzL() && this.getViewTreeObserver() != null && this.getViewTreeObserver().isAlive())) {
                this.zzB = false;
            }
        }
        this.zzaV(false);
    }

    @Override  // android.webkit.DownloadListener
    public final void onDownloadStart(String s, String s1, String s2, String s3, long v) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setDataAndType(Uri.parse(s), s3);
            zzs.zzQ(this.getContext(), intent0);
        }
        catch(ActivityNotFoundException unused_ex) {
            zzcaa.zze(("Couldn\'t find an Activity to view url/mimetype: " + s + " / " + s3));
        }
    }

    @Override  // android.webkit.WebView
    @TargetApi(21)
    protected final void onDraw(Canvas canvas0) {
        if(this.zzaz()) {
            return;
        }
        super.onDraw(canvas0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.webkit.WebView
    public final boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        float f = motionEvent0.getAxisValue(9);
        float f1 = motionEvent0.getAxisValue(10);
        return motionEvent0.getActionMasked() != 8 || (Float.compare(f, 0.0f) <= 0 || this.canScrollVertically(-1)) && (Float.compare(f, 0.0f) >= 0 || this.canScrollVertically(1)) && (f1 <= 0.0f || this.canScrollHorizontally(-1)) && (f1 >= 0.0f || this.canScrollHorizontally(1)) ? super.onGenericMotionEvent(motionEvent0) : false;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z = this.zzaR();
        zzl zzl0 = this.zzL();
        if(zzl0 != null && z) {
            zzl0.zzn();
        }
    }

    @Override  // android.webkit.WebView
    @SuppressLint({"DrawAllocation"})
    protected final void onMeasure(int v, int v1) {
        int v8;
        int v7;
        int v2 = 0;
        synchronized(this) {
            if(this.zzaz()) {
                this.setMeasuredDimension(0, 0);
                return;
            }
            if(!this.isInEditMode() && !this.zzu && !this.zzq.zzf()) {
                if(this.zzq.zzh()) {
                    super.onMeasure(v, v1);
                    return;
                }
                if(this.zzq.zzj()) {
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzdF)).booleanValue()) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    zzcge zzcge0 = this.zzq();
                    float f = zzcge0 == null ? 0.0f : zzcge0.zze();
                    if(f == 0.0f) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    int v4 = View.MeasureSpec.getSize(v);
                    int v5 = View.MeasureSpec.getSize(v1);
                    float f1 = ((float)v5) * f;
                    int v6 = (int)(((float)v4) / f);
                    if(v5 != 0) {
                    label_36:
                        if(v4 != 0) {
                            v2 = v4;
                            v8 = v5;
                            v7 = (int)f1;
                        }
                        else if(((int)f1) != 0) {
                            v6 = (int)(((float)(((int)f1))) / f);
                            v8 = v5;
                            v7 = (int)f1;
                            v2 = v7;
                        }
                        else {
                            v8 = v5;
                            v7 = (int)f1;
                        }
                    }
                    else if(v6 != 0) {
                        v7 = (int)(((float)v6) * f);
                        v2 = v4;
                        v8 = v6;
                    }
                    else {
                        v5 = 0;
                        goto label_36;
                    }
                    this.setMeasuredDimension(Math.min(v7, v2), Math.min(v6, v8));
                    return;
                }
                if(this.zzq.zzg()) {
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzdL)).booleanValue()) {
                        super.onMeasure(v, v1);
                        return;
                    }
                    this.zzad("/contentHeight", new zzcfz(this));
                    this.zzaO("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = \'gmsg://mobileads.google.com/contentHeight?\';  url += \'height=\' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById(\'afma-notify-fluid\');    if (!frame) {      frame = document.createElement(\'IFRAME\');      frame.id = \'afma-notify-fluid\';      frame.style.display = \'none\';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f2 = this.zzh.density;
                    int v9 = View.MeasureSpec.getSize(v);
                    int v10 = this.zzG;
                    this.setMeasuredDimension(v9, (v10 == -1 ? View.MeasureSpec.getSize(v1) : ((int)(((float)v10) * f2))));
                    return;
                }
                if(this.zzq.zzi()) {
                    this.setMeasuredDimension(this.zzh.widthPixels, this.zzh.heightPixels);
                    return;
                }
                int v11 = View.MeasureSpec.getMode(v);
                int v12 = View.MeasureSpec.getSize(v);
                int v13 = View.MeasureSpec.getMode(v1);
                int v14 = View.MeasureSpec.getSize(v1);
                int v15 = 0x7FFFFFFF;
                int v16 = v11 == 0x80000000 || v11 == 0x40000000 ? v12 : 0x7FFFFFFF;
                if(v13 == 0x80000000 || v13 == 0x40000000) {
                    v15 = v14;
                }
                int v17 = this.zzq.zzb <= v16 && this.zzq.zza <= v15 ? 0 : 1;
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzfl)).booleanValue()) {
                    v17 &= (((float)this.zzq.zzb) / this.zzi > ((float)v16) / this.zzi || ((float)this.zzq.zza) / this.zzi > ((float)v15) / this.zzi ? 0 : 1);
                }
                if(v17 != 0) {
                    zzcaa.zzj(("Not enough space to show ad. Needs " + ((int)(((float)this.zzq.zzb) / this.zzi)) + "x" + ((int)(((float)this.zzq.zza) / this.zzi)) + " dp, but only has " + ((int)(((float)v12) / this.zzi)) + "x" + ((int)(((float)v14) / this.zzi)) + " dp."));
                    if(this.getVisibility() != 8) {
                        this.setVisibility(4);
                    }
                    this.setMeasuredDimension(0, 0);
                    if(!this.zzl) {
                        this.zzV.zzc(10001);
                        this.zzl = true;
                        return;
                    }
                    return;
                }
                if(this.getVisibility() != 8) {
                    this.setVisibility(0);
                }
                if(!this.zzm) {
                    this.zzV.zzc(10002);
                    this.zzm = true;
                }
                this.setMeasuredDimension(this.zzq.zzb, this.zzq.zza);
                return;
            }
            super.onMeasure(v, v1);
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void onPause() {
        if(this.zzaz()) {
            return;
        }
        try {
            super.onPause();
        }
        catch(Exception exception0) {
            zzcaa.zzh("Could not pause webview.", exception0);
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void onResume() {
        if(this.zzaz()) {
            return;
        }
        try {
            super.onResume();
        }
        catch(Exception exception0) {
            zzcaa.zzh("Could not resume webview.", exception0);
        }
    }

    @Override  // android.webkit.WebView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.zzn.zzL() && !this.zzn.zzJ()) {
            synchronized(this) {
                zzbej zzbej0 = this.zzC;
                if(zzbej0 != null) {
                    zzbej0.zzd(motionEvent0);
                }
            }
            return this.zzaz() ? false : super.onTouchEvent(motionEvent0);
        }
        zzaqx zzaqx0 = this.zzc;
        if(zzaqx0 != null) {
            zzaqx0.zzd(motionEvent0);
        }
        zzbct zzbct0 = this.zzd;
        if(zzbct0 != null) {
            zzbct0.zzb(motionEvent0);
        }
        return this.zzaz() ? false : super.onTouchEvent(motionEvent0);
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void setWebViewClient(WebViewClient webViewClient0) {
        super.setWebViewClient(webViewClient0);
        if(webViewClient0 instanceof zzcfp) {
            this.zzn = (zzcfp)webViewClient0;
        }
    }

    @Override  // android.webkit.WebView
    public final void stopLoading() {
        if(this.zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        }
        catch(Exception exception0) {
            zzcaa.zzh("Could not stop loading webview.", exception0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzA(int v) {
        synchronized(this) {
            this.zzL = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzC(zzcge zzcge0) {
        synchronized(this) {
            if(this.zzz != null) {
                zzcaa.zzg("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.zzz = zzcge0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzfbe zzD() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final View zzF() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final WebView zzG() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzaqx zzI() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzavs zzJ() {
        synchronized(this) {
        }
        return this.zzE;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzbej zzK() {
        synchronized(this) {
        }
        return this.zzC;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzl zzL() {
        synchronized(this) {
        }
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzl zzM() {
        synchronized(this) {
        }
        return this.zzM;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzcgv zzN() {
        return this.zzn;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzcgx zzO() {
        synchronized(this) {
        }
        return this.zzq;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzfbi zzP() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzfip zzQ() {
        synchronized(this) {
        }
        return this.zzp;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final d zzR() {
        return this.zzd == null ? zzfye.zzh(null) : this.zzd.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final String zzS() {
        synchronized(this) {
        }
        return this.zzr;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzT(zzfbe zzfbe0, zzfbi zzfbi0) {
        this.zzj = zzfbe0;
        this.zzk = zzfbi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzU() {
        synchronized(this) {
            zze.zza("Destroying WebView!");
            this.zzaT();
            zzcga zzcga0 = new zzcga(this);
            zzs.zza.post(zzcga0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzV() {
        this.zzaY();
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put("version", this.zze.zza);
        this.zzd("onhide", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzW(int v) {
        if(v == 0) {
            zzbcb.zza(this.zzK.zza(), this.zzI, new String[]{"aebb2"});
        }
        this.zzaY();
        this.zzK.zza().zzd("close_type", String.valueOf(v));
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put("closetype", String.valueOf(v));
        hashMap0.put("version", this.zze.zza);
        this.zzd("onhide", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzX() {
        if(this.zzH == null) {
            zzbcb.zza(this.zzK.zza(), this.zzI, new String[]{"aes2"});
            zzbcg zzbcg0 = zzbcj.zzf();
            this.zzH = zzbcg0;
            this.zzK.zzb("native:view_show", zzbcg0);
        }
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put("version", this.zze.zza);
        this.zzd("onshow", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzY() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzZ(boolean z) {
        this.zzn.zzi(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzbly
    public final void zza(String s) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaA() {
        synchronized(this) {
        }
        return this.zzu;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaB() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaC() {
        synchronized(this) {
        }
        return this.zzx;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaD(zzc zzc0, boolean z) {
        this.zzn.zzt(zzc0, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaE(String s, String s1, int v) {
        this.zzn.zzu(s, s1, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaF(boolean z, int v, boolean z1) {
        this.zzn.zzv(z, v, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaG(boolean z, int v, String s, boolean z1) {
        this.zzn.zzx(z, v, s, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zzaH(boolean z, int v, String s, String s1, boolean z1) {
        this.zzn.zzy(z, v, s, s1, z1);
    }

    static int zzaI(zzcgb zzcgb0) {
        return zzcgb0.zzG;
    }

    public final zzcfp zzaJ() {
        return this.zzn;
    }

    final Boolean zzaK() {
        synchronized(this) {
        }
        return this.zzw;
    }

    static void zzaL(zzcgb zzcgb0, int v) {
        zzcgb0.zzG = v;
    }

    static void zzaM(zzcgb zzcgb0) {
        zzcgb0.super.destroy();
    }

    protected final void zzaN(String s, ValueCallback valueCallback0) {
        synchronized(this) {
            if(!this.zzaz()) {
                this.evaluateJavascript(s, null);
                return;
            }
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final void zzaO(String s) {
        if(this.zzaK() == null) {
            this.zzbb();
        }
        if(this.zzaK().booleanValue()) {
            this.zzaN(s, null);
            return;
        }
        this.zzaP("javascript:" + s);
    }

    protected final void zzaP(String s) {
        synchronized(this) {
            if(!this.zzaz()) {
                this.loadUrl(s);
                return;
            }
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    final void zzaQ(Boolean boolean0) {
        synchronized(this) {
            this.zzw = boolean0;
        }
        zzt.zzo().zzv(boolean0);
    }

    public final boolean zzaR() {
        int v4;
        int v3;
        boolean z = false;
        if(!this.zzn.zzK() && !this.zzn.zzL()) {
            return false;
        }
        int v = zzbzt.zzv(this.zzh, this.zzh.widthPixels);
        int v1 = zzbzt.zzv(this.zzh, this.zzh.heightPixels);
        Activity activity0 = this.zzb.zza();
        if(activity0 == null || activity0.getWindow() == null) {
            v4 = v;
            v3 = v1;
        }
        else {
            int[] arr_v = zzs.zzN(activity0);
            int v2 = zzbzt.zzv(this.zzh, arr_v[0]);
            v3 = zzbzt.zzv(this.zzh, arr_v[1]);
            v4 = v2;
        }
        int v5 = this.zzQ;
        if(v5 == v && this.zzP == v1 && this.zzR == v4 && this.zzS == v3) {
            return false;
        }
        if(v5 != v || this.zzP != v1) {
            z = true;
        }
        this.zzQ = v;
        this.zzP = v1;
        this.zzR = v4;
        this.zzS = v3;
        new zzbrf(this, "").zzi(v, v1, v4, v3, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
        return z;
    }

    private final void zzaS() {
        synchronized(this) {
            if(this.zzj != null && this.zzj.zzan) {
                zzcaa.zze("Disabling hardware acceleration on an overlay.");
                this.zzaU();
                return;
            }
            if(!this.zzu && !this.zzq.zzi()) {
                zzcaa.zze("Enabling hardware acceleration on an AdView.");
                this.zzaW();
                return;
            }
            zzcaa.zze("Enabling hardware acceleration on an overlay.");
            this.zzaW();
        }
    }

    private final void zzaT() {
        synchronized(this) {
            if(!this.zzN) {
                this.zzN = true;
                zzt.zzo().zzq();
            }
        }
    }

    private final void zzaU() {
        synchronized(this) {
            if(!this.zzv) {
                this.setLayerType(1, null);
            }
            this.zzv = true;
        }
    }

    private final void zzaV(boolean z) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("isVisible", (z ? "1" : "0"));
        this.zzd("onAdVisibilityChanged", hashMap0);
    }

    private final void zzaW() {
        synchronized(this) {
            if(this.zzv) {
                this.setLayerType(0, null);
            }
            this.zzv = false;
        }
    }

    private final void zzaX(String s) {
        synchronized(this) {
            try {
                super.loadUrl("about:blank");
            }
            catch(Throwable throwable0) {
                zzt.zzo().zzu(throwable0, "AdWebViewImpl.loadUrlUnsafe");
                zzcaa.zzk("Could not call loadUrl in destroy(). ", throwable0);
            }
        }
    }

    private final void zzaY() {
        zzbcb.zza(this.zzK.zza(), this.zzI, new String[]{"aeh2"});
    }

    private final void zzaZ() {
        synchronized(this) {
            Map map0 = this.zzT;
            if(map0 != null) {
                for(Object object0: map0.values()) {
                    ((zzcdu)object0).release();
                }
            }
            this.zzT = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzab(String s, String s1, String s2) {
        String s4;
        synchronized(this) {
            if(!this.zzaz()) {
                String s3 = (String)zzba.zzc().zzb(zzbbr.zzQ);
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("version", s3);
                    jSONObject0.put("sdk", "Google Mobile Ads");
                    jSONObject0.put("sdkVersion", "12.4.51-000");
                    s4 = "<script>Object.defineProperty(window,\'MRAID_ENV\',{get:function(){return " + jSONObject0.toString() + "}});</script>";
                }
                catch(JSONException jSONException0) {
                    zzcaa.zzk("Unable to build MRAID_ENV", jSONException0);
                    s4 = null;
                }
                super.loadDataWithBaseURL(s, zzcgo.zza(s1, new String[]{s4}), "text/html", "UTF-8", null);
                return;
            }
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzac() {
        if(this.zzJ == null) {
            zzbcg zzbcg0 = zzbcj.zzf();
            this.zzJ = zzbcg0;
            this.zzK.zzb("native:view_load", zzbcg0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzad(String s, zzbir zzbir0) {
        zzcfp zzcfp0 = this.zzn;
        if(zzcfp0 != null) {
            zzcfp0.zzz(s, zzbir0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzae() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzaf(zzl zzl0) {
        synchronized(this) {
            this.zzo = zzl0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzag(zzcgx zzcgx0) {
        synchronized(this) {
            this.zzq = zzcgx0;
            this.requestLayout();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzah(zzavs zzavs0) {
        synchronized(this) {
            this.zzE = zzavs0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzai(boolean z) {
        synchronized(this) {
            this.zzx = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzaj() {
        this.setBackgroundColor(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzak(Context context0) {
        this.zzb.setBaseContext(context0);
        this.zzO.zze(this.zzb.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzal(boolean z) {
        synchronized(this) {
            zzl zzl0 = this.zzo;
            if(zzl0 != null) {
                zzl0.zzy(this.zzn.zzK(), z);
                return;
            }
            this.zzs = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzam(zzbeh zzbeh0) {
        synchronized(this) {
            this.zzD = zzbeh0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzan(boolean z) {
        synchronized(this) {
            boolean z1 = this.zzu;
            this.zzu = z;
            this.zzaS();
            if(z != z1 && (!((Boolean)zzba.zzc().zzb(zzbbr.zzR)).booleanValue() || !this.zzq.zzi())) {
                new zzbrf(this, "").zzk((z ? "expanded" : "default"));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzao(zzbej zzbej0) {
        synchronized(this) {
            this.zzC = zzbej0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzap(zzfip zzfip0) {
        synchronized(this) {
            this.zzp = zzfip0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzaq(int v) {
        synchronized(this) {
            zzl zzl0 = this.zzo;
            if(zzl0 != null) {
                zzl0.zzA(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzar(zzl zzl0) {
        synchronized(this) {
            this.zzM = zzl0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzas(boolean z) {
        synchronized(this) {
            int v1 = this.zzF + (z ? 1 : -1);
            this.zzF = v1;
            if(v1 <= 0) {
                zzl zzl0 = this.zzo;
                if(zzl0 != null) {
                    zzl0.zzE();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzat(boolean z) {
        synchronized(this) {
            if(z) {
                this.setBackgroundColor(0);
            }
            zzl zzl0 = this.zzo;
            if(zzl0 != null) {
                zzl0.zzB(z);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzau(String s, zzbir zzbir0) {
        zzcfp zzcfp0 = this.zzn;
        if(zzcfp0 != null) {
            zzcfp0.zzH(s, zzbir0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzav(String s, Predicate predicate0) {
        zzcfp zzcfp0 = this.zzn;
        if(zzcfp0 != null) {
            zzcfp0.zzI(s, predicate0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaw() {
        synchronized(this) {
        }
        return this.zzs;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzax() {
        synchronized(this) {
        }
        return this.zzF > 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzay(boolean z, int v) {
        this.destroy();
        zzcfy zzcfy0 = new zzcfy(z, v);
        this.zzV.zzb(zzcfy0);
        this.zzV.zzc(10003);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaz() {
        synchronized(this) {
        }
        return this.zzt;
    }

    @Override  // com.google.android.gms.internal.ads.zzbly
    public final void zzb(String s, String s1) {
        this.zzaO(s + "(" + s1 + ");");
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzcfp zzcfp0 = this.zzn;
        if(zzcfp0 != null) {
            zzcfp0.zzbK();
        }
    }

    private final void zzba() {
        zzbch zzbch0 = this.zzK;
        if(zzbch0 == null) {
            return;
        }
        zzbcj zzbcj0 = zzbch0.zza();
        zzbbz zzbbz0 = zzt.zzo().zzf();
        if(zzbbz0 != null) {
            zzbbz0.zzf(zzbcj0);
        }
    }

    private final void zzbb() {
        synchronized(this) {
            Boolean boolean0 = zzt.zzo().zzk();
            this.zzw = boolean0;
            if(boolean0 == null) {
                try {
                    this.evaluateJavascript("(function(){})()", null);
                    this.zzaQ(Boolean.TRUE);
                }
                catch(IllegalStateException unused_ex) {
                    this.zzaQ(Boolean.FALSE);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzl
    public final void zzbj() {
        synchronized(this) {
            com.google.android.gms.ads.internal.zzl zzl0 = this.zzf;
            if(zzl0 != null) {
                zzl0.zzbj();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzl
    public final void zzbk() {
        synchronized(this) {
            com.google.android.gms.ads.internal.zzl zzl0 = this.zzf;
            if(zzl0 != null) {
                zzl0.zzbk();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final String zzbl() {
        synchronized(this) {
            zzfbi zzfbi0 = this.zzk;
            if(zzfbi0 != null) {
                return zzfbi0.zzb;
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final String zzbm() {
        synchronized(this) {
        }
        return this.zzy;
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        synchronized(this) {
            this.zzA = zzaue0.zzj;
        }
        this.zzaV(zzaue0.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzd(String s, Map map0) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = zzay.zzb().zzi(map0);
        }
        catch(JSONException unused_ex) {
            zzcaa.zzj("Could not convert parameters to JSON.");
            return;
        }
        this.zze(s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zze(String s, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("(window.AFMA_ReceiveMessage || function() {})(\'");
        stringBuilder0.append(s);
        stringBuilder0.append("\',");
        stringBuilder0.append(jSONObject0.toString());
        stringBuilder0.append(");");
        zzcaa.zze(("Dispatching AFMA event: " + stringBuilder0.toString()));
        this.zzaO(stringBuilder0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final int zzf() {
        synchronized(this) {
        }
        return this.zzL;
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
        return this.getMeasuredHeight();
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
        return this.getMeasuredWidth();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zza zzj() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final zzbcg zzk() {
        return this.zzI;
    }

    @Override  // com.google.android.gms.internal.ads.zzbly
    public final void zzl(String s, JSONObject jSONObject0) {
        this.zzb(s, jSONObject0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzbch zzm() {
        return this.zzK;
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzcag zzn() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final zzcby zzo() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final zzcdu zzp(String s) {
        synchronized(this) {
            Map map0 = this.zzT;
            return map0 == null ? null : ((zzcdu)map0.get(s));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final zzcge zzq() {
        synchronized(this) {
        }
        return this.zzz;
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzcfp zzcfp0 = this.zzn;
        if(zzcfp0 != null) {
            zzcfp0.zzs();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcfi
    public final void zzt(String s, zzcdu zzcdu0) {
        synchronized(this) {
            if(this.zzT == null) {
                this.zzT = new HashMap();
            }
            this.zzT.put(s, zzcdu0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
        zzl zzl0 = this.zzL();
        if(zzl0 != null) {
            zzl0.zzd();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean z, long v) {
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put("success", (z ? "1" : "0"));
        hashMap0.put("duration", Long.toString(v));
        this.zzd("onCacheAccessComplete", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzw() {
        synchronized(this) {
            zzbeh zzbeh0 = this.zzD;
            if(zzbeh0 != null) {
                zzdma zzdma0 = new zzdma(((zzdmc)zzbeh0));
                zzs.zza.post(zzdma0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzx(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzy(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzz(boolean z) {
        this.zzn.zzC(false);
    }
}

