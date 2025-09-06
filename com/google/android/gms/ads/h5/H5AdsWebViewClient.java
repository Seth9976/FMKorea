package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjy;

public final class H5AdsWebViewClient extends zzbjl {
    private final zzbjy zza;

    public H5AdsWebViewClient(Context context0, WebView webView0) {
        this.zza = new zzbjy(context0, webView0);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjl
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient0) {
        this.zza.zzb(webViewClient0);
    }
}

