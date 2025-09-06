package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class zzavc implements Runnable {
    final ValueCallback zza;
    final zzauu zzb;
    final WebView zzc;
    final boolean zzd;
    final zzave zze;

    zzavc(zzave zzave0, zzauu zzauu0, WebView webView0, boolean z) {
        this.zze = zzave0;
        this.zzb = zzauu0;
        this.zzc = webView0;
        this.zzd = z;
        super();
        this.zza = new zzavb(this, zzauu0, webView0, z);
    }

    @Override
    public final void run() {
        if(this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            }
            catch(Throwable unused_ex) {
                this.zza.onReceiveValue("");
            }
        }
    }
}

