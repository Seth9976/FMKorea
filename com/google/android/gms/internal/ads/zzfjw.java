package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class zzfjw implements Runnable {
    final zzfjx zza;
    private final WebView zzb;

    zzfjw(zzfjx zzfjx0) {
        this.zza = zzfjx0;
        super();
        this.zzb = zzfjx.zzm(zzfjx0);
    }

    @Override
    public final void run() {
        this.zzb.destroy();
    }
}

