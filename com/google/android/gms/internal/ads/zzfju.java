package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzfju {
    private zzfkw zza;
    private long zzb;
    private int zzc;

    public zzfju() {
        this.zzb();
        this.zza = new zzfkw(null);
    }

    public final WebView zza() {
        return (WebView)this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String s, long v) {
        if(v >= this.zzb && this.zzc != 3) {
            this.zzc = 3;
            zzfjn.zza().zzg(this.zza(), s);
        }
    }

    public final void zze(Date date0) {
        if(date0 == null) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        zzfjz.zze(jSONObject0, "timestamp", date0.getTime());
        zzfjn.zza().zzf(this.zza(), jSONObject0);
    }

    public final void zzf(String s, long v) {
        if(v >= this.zzb) {
            this.zzc = 2;
            zzfjn.zza().zzg(this.zza(), s);
        }
    }

    public void zzg(zzfit zzfit0, zzfir zzfir0) {
        this.zzh(zzfit0, zzfir0, null);
    }

    protected final void zzh(zzfit zzfit0, zzfir zzfir0, JSONObject jSONObject0) {
        String s = zzfit0.zzh();
        JSONObject jSONObject1 = new JSONObject();
        zzfjz.zze(jSONObject1, "environment", "app");
        zzfjz.zze(jSONObject1, "adSessionType", zzfir0.zzd());
        JSONObject jSONObject2 = new JSONObject();
        zzfjz.zze(jSONObject2, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfjz.zze(jSONObject2, "osVersion", "33");
        zzfjz.zze(jSONObject2, "os", "Android");
        zzfjz.zze(jSONObject1, "deviceInfo", jSONObject2);
        zzfjz.zze(jSONObject1, "deviceCategory", zzfjy.zza().toString());
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put("clid");
        jSONArray0.put("vlid");
        zzfjz.zze(jSONObject1, "supports", jSONArray0);
        JSONObject jSONObject3 = new JSONObject();
        zzfjz.zze(jSONObject3, "partnerName", zzfir0.zze().zzb());
        zzfjz.zze(jSONObject3, "partnerVersion", zzfir0.zze().zzc());
        zzfjz.zze(jSONObject1, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        zzfjz.zze(jSONObject4, "libraryVersion", "1.4.6-google_20230720");
        zzfjz.zze(jSONObject4, "appId", "com.fmkorea.m.fmk");
        zzfjz.zze(jSONObject1, "app", jSONObject4);
        if(zzfir0.zzf() != null) {
            zzfjz.zze(jSONObject1, "contentUrl", zzfir0.zzf());
        }
        zzfjz.zze(jSONObject1, "customReferenceData", zzfir0.zzg());
        JSONObject jSONObject5 = new JSONObject();
        Iterator iterator0 = zzfir0.zzh().iterator();
        if(!iterator0.hasNext()) {
            zzfjn.zza().zzh(this.zza(), s, jSONObject1, jSONObject5, jSONObject0);
            return;
        }
        Object object0 = iterator0.next();
        zzfja zzfja0 = (zzfja)object0;
        throw null;
    }

    public final void zzi(float f) {
        zzfjn.zza().zze(this.zza(), f);
    }

    final void zzj(WebView webView0) {
        this.zza = new zzfkw(webView0);
    }

    public void zzk() {
    }

    public final boolean zzl() {
        return this.zza.get() != null;
    }
}

