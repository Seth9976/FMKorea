package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;

public final class zzbjy extends zzbjl {
    public static final int zza;
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbjy(Context context0, WebView webView0) {
        context0.getClass();
        webView0.getClass();
        zzfri.zzf(webView0.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView0;
        this.zzc = new H5AdsRequestHandler(context0, new zzbjx(webView0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbjl
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjl
    public final void onLoadResource(WebView webView0, String s) {
        if(!this.zzc(webView0)) {
            return;
        }
        if(!this.zzc.handleH5AdsRequest(s)) {
            super.onLoadResource(webView0, s);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbjl
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        if(!this.zzc(this.zzd)) {
            return false;
        }
        String s = webResourceRequest0.getUrl().toString();
        return this.zzc.handleH5AdsRequest(s) ? true : super.shouldOverrideUrlLoading(webView0, webResourceRequest0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbjl
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(!this.zzc(webView0)) {
            return false;
        }
        return this.zzc.handleH5AdsRequest(s) ? true : super.shouldOverrideUrlLoading(webView0, s);
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(WebViewClient webViewClient0) {
        zzfri.zzf(webViewClient0 != this, "Delegate cannot be itself.");
        this.zzb = webViewClient0;
    }

    private final boolean zzc(WebView webView0) {
        if(this.zzd.equals(webView0)) {
            return true;
        }
        zzcaa.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }
}

