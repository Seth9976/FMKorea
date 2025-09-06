package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class zzfjm implements Runnable {
    final WebView zza;
    final String zzb;
    final zzfjn zzc;

    zzfjm(zzfjn zzfjn0, WebView webView0, String s) {
        this.zzc = zzfjn0;
        this.zza = webView0;
        this.zzb = s;
        super();
    }

    @Override
    public final void run() {
        zzfjn.zzi(this.zza, this.zzb);
    }
}

