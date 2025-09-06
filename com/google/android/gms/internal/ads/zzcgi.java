package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

public final class zzcgi {
    private final zzcgj zza;
    private final zzcgh zzb;

    public zzcgi(zzcgj zzcgj0, zzcgh zzcgh0) {
        this.zzb = zzcgh0;
        this.zza = zzcgj0;
    }

    @JavascriptInterface
    public String getClickSignals(String s) {
        if(TextUtils.isEmpty(s)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzcgj zzcgj0 = this.zza;
        zzaqx zzaqx0 = ((zzcgq)zzcgj0).zzI();
        if(zzaqx0 == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaqt zzaqt0 = zzaqx0.zzc();
        if(zzcgj0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context0 = this.zza.getContext();
        Activity activity0 = this.zza.zzi();
        return zzaqt0.zzf(context0, s, ((View)this.zza), activity0);
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcgj zzcgj0 = this.zza;
        zzaqx zzaqx0 = ((zzcgq)zzcgj0).zzI();
        if(zzaqx0 == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaqt zzaqt0 = zzaqx0.zzc();
        if(zzcgj0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context0 = this.zza.getContext();
        Activity activity0 = this.zza.zzi();
        return zzaqt0.zzh(context0, ((View)this.zza), activity0);
    }

    @JavascriptInterface
    public void notify(String s) {
        if(TextUtils.isEmpty(s)) {
            zzcaa.zzj("URL is empty, ignoring message");
            return;
        }
        zzcgg zzcgg0 = () -> {
            Uri uri0 = Uri.parse(s);
            zzcfp zzcfp0 = ((zzcgb)this.zzb.zza).zzaJ();
            if(zzcfp0 == null) {
                zzcaa.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                return;
            }
            zzcfp0.zzj(uri0);
        };
        zzs.zza.post(zzcgg0);
    }

    // 检测为 Lambda 实现
    final void zza(String s) [...]
}

