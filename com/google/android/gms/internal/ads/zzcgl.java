package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.File;
import java.util.Collections;
import java.util.Map;

public class zzcgl extends zzcfp {
    public zzcgl(zzcfi zzcfi0, zzaxe zzaxe0, boolean z, zzecs zzecs0) {
        super(zzcfi0, zzaxe0, z, new zzbre(zzcfi0, zzcfi0.zzE(), new zzbbb(zzcfi0.getContext())), null, zzecs0);
    }

    protected final WebResourceResponse zzN(WebView webView0, String s, Map map0) {
        String s1;
        if(!(webView0 instanceof zzcfi)) {
            zzcaa.zzj("Tried to intercept request from a WebView that wasn\'t an AdWebView.");
            return null;
        }
        zzbxb zzbxb0 = this.zza;
        if(zzbxb0 != null) {
            zzbxb0.zzd(s, map0, 1);
        }
        if(!"mraid.js".equalsIgnoreCase(new File(s).getName())) {
            if(map0 == null) {
                map0 = Collections.emptyMap();
            }
            return super.zzc(s, map0);
        }
        if(((zzcfi)webView0).zzN() != null) {
            ((zzcfi)webView0).zzN().zzE();
        }
        if(((zzcfi)webView0).zzO().zzi()) {
            s1 = (String)zzba.zzc().zzb(zzbbr.zzP);
            return zzs.zzu(((zzcfi)webView0).getContext(), ((zzcfi)webView0).zzn().zza, s1);
        }
        if(((zzcfi)webView0).zzaA()) {
            s1 = (String)zzba.zzc().zzb(zzbbr.zzO);
            return zzs.zzu(((zzcfi)webView0).getContext(), ((zzcfi)webView0).zzn().zza, s1);
        }
        s1 = (String)zzba.zzc().zzb(zzbbr.zzN);
        return zzs.zzu(((zzcfi)webView0).getContext(), ((zzcfi)webView0).zzn().zza, s1);
    }
}

