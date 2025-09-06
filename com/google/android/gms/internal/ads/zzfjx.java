package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class zzfjx extends zzfju {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfjx(Map map0, String s) {
        this.zzb = null;
        this.zzc = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfju
    public final void zzc() {
        super.zzc();
        long v = this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - ((long)this.zzb), TimeUnit.NANOSECONDS);
        new Handler().postDelayed(new zzfjw(this), Math.max(4000L - v, 2000L));
        this.zza = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfju
    public final void zzg(zzfit zzfit0, zzfir zzfir0) {
        JSONObject jSONObject0 = new JSONObject();
        Map map0 = zzfir0.zzi();
        Iterator iterator0 = map0.keySet().iterator();
        if(!iterator0.hasNext()) {
            this.zzh(zzfit0, zzfir0, jSONObject0);
            return;
        }
        Object object0 = iterator0.next();
        zzfja zzfja0 = (zzfja)map0.get(((String)object0));
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfju
    public final void zzk() {
        WebView webView0 = new WebView(zzfjl.zzb().zza());
        this.zza = webView0;
        webView0.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zzj(this.zza);
        zzfjn.zzi(this.zza, null);
        Iterator iterator0 = this.zzc.keySet().iterator();
        if(!iterator0.hasNext()) {
            this.zzb = System.nanoTime();
            return;
        }
        Object object0 = iterator0.next();
        zzfja zzfja0 = (zzfja)this.zzc.get(((String)object0));
        throw null;
    }

    static WebView zzm(zzfjx zzfjx0) {
        return zzfjx0.zza;
    }
}

