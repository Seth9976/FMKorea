package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class zzbv extends WebViewClient {
    final zzbw zza;

    zzbv(zzbw zzbw0, zzbu zzbu0) {
        this.zza = zzbw0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView0, String s) {
        if(zzbw.zze(this.zza, s)) {
            zzbw.zza(this.zza).zzd(s);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        if(!zzbw.zzd(this.zza)) {
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            zzbw.zzb(this.zza, true);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        zzbw.zza(this.zza).zze(v, s, s1);
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        String s = webResourceRequest0.getUrl().toString();
        if(zzbw.zze(this.zza, s)) {
            zzbw.zza(this.zza).zzd(s);
            return true;
        }
        return false;
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        if(zzbw.zze(this.zza, s)) {
            zzbw.zza(this.zza).zzd(s);
            return true;
        }
        return false;
    }
}

