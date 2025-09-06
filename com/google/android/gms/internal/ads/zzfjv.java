package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

public final class zzfjv extends zzfju {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfjv(WebView webView0) {
        if(!webView0.getSettings().getJavaScriptEnabled()) {
            webView0.getSettings().setJavaScriptEnabled(true);
        }
        this.zzj(webView0);
    }
}

