package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

public final class zzavb implements ValueCallback {
    public final zzavc zza;
    public final zzauu zzb;
    public final WebView zzc;
    public final boolean zzd;

    public zzavb(zzavc zzavc0, zzauu zzauu0, WebView webView0, boolean z) {
        this.zza = zzavc0;
        this.zzb = zzauu0;
        this.zzc = webView0;
        this.zzd = z;
    }

    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        this.zza.zze.zzd(this.zzb, this.zzc, ((String)object0), this.zzd);
    }
}

