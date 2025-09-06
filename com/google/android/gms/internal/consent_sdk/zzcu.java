package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebView;

public final class zzcu {
    private static Boolean zza;

    @TargetApi(19)
    public static void zza(WebView webView0, String s) {
        synchronized(zzcu.class) {
            if(zzcu.zza == null) {
                try {
                    webView0.evaluateJavascript("(function(){})()", null);
                    zzcu.zza = Boolean.TRUE;
                }
                catch(IllegalStateException unused_ex) {
                    zzcu.zza = Boolean.FALSE;
                }
            }
            boolean z = zzcu.zza.booleanValue();
        }
        if(z) {
            webView0.evaluateJavascript(s, null);
            return;
        }
        webView0.loadUrl("javascript:" + s);
    }
}

