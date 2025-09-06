package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
public final class zzcgm extends zzcgl {
    public zzcgm(zzcfi zzcfi0, zzaxe zzaxe0, boolean z, zzecs zzecs0) {
        super(zzcfi0, zzaxe0, z, zzecs0);
    }

    @Override  // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
        return webResourceRequest0 == null || webResourceRequest0.getUrl() == null ? null : this.zzN(webView0, webResourceRequest0.getUrl().toString(), webResourceRequest0.getRequestHeaders());
    }
}

