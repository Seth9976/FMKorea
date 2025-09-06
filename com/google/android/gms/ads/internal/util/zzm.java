package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import java.util.concurrent.Callable;

public final class zzm implements Callable {
    public final WebSettings zza;
    public final Context zzb;

    public zzm(WebSettings webSettings0, Context context0) {
        this.zza = webSettings0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        WebSettings webSettings0 = this.zza;
        webSettings0.setDatabasePath(this.zzb.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings0.setDatabaseEnabled(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setBuiltInZoomControls(true);
        webSettings0.setSupportZoom(true);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzaI)).booleanValue()) {
            webSettings0.setTextZoom(100);
        }
        webSettings0.setAllowContentAccess(false);
        return true;
    }
}

