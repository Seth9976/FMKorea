package com.google.android.gms.ads.nonagon.signalgeneration;

import Z1.d;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfyo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaqx zzc;
    private final int zzd;
    private final zzdrm zze;
    private final boolean zzf;
    private final zzfyo zzg;
    private final zzfik zzh;

    TaggingLibraryJsInterface(WebView webView0, zzaqx zzaqx0, zzdrm zzdrm0, zzfik zzfik0) {
        this.zzg = zzcan.zze;
        this.zzb = webView0;
        Context context0 = webView0.getContext();
        this.zza = context0;
        this.zzc = zzaqx0;
        this.zze = zzdrm0;
        zzbbr.zza(context0);
        this.zzd = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzjc)));
        this.zzf = ((Boolean)zzba.zzc().zzb(zzbbr.zzjd)).booleanValue();
        this.zzh = zzfik0;
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignals(String s) {
        try {
            long v = zzt.zzB().currentTimeMillis();
            String s1 = this.zzc.zzc().zze(this.zza, s, this.zzb);
            if(this.zzf) {
                Pair[] arr_pair = {new Pair("clat", String.valueOf(zzt.zzB().currentTimeMillis() - v))};
                zzf.zzc(this.zze, null, "csg", arr_pair);
                return s1;
            }
            return s1;
        }
        catch(RuntimeException runtimeException0) {
            zzcaa.zzh("Exception getting click signals. ", runtimeException0);
            zzt.zzo().zzu(runtimeException0, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignalsWithTimeout(String s, int v) {
        if(v <= 0) {
            zzcaa.zzg(("Invalid timeout for getting click signals. Timeout=" + v));
            return "";
        }
        zzaq zzaq0 = new zzaq(this, s);
        d d0 = zzcan.zza.zzb(zzaq0);
        try {
            return (String)d0.get(((long)Math.min(v, this.zzd)), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | TimeoutException | ExecutionException interruptedException0) {
            zzcaa.zzh("Exception getting click signals with timeout. ", interruptedException0);
            zzt.zzo().zzu(interruptedException0, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return interruptedException0 instanceof TimeoutException ? "17" : "";
        }
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public String getQueryInfo() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("query_info_type", "requester_type_6");
        zzar zzar0 = new zzar(this, "ef9d4dd5-e00a-4877-9acb-da53e5876707");
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjf)).booleanValue()) {
            zzao zzao0 = new zzao(this, bundle0, zzar0);
            this.zzg.execute(zzao0);
            return "ef9d4dd5-e00a-4877-9acb-da53e5876707";
        }
        Builder adRequest$Builder0 = new Builder();
        adRequest$Builder0.addNetworkExtrasBundle(AdMobAdapter.class, bundle0);
        AdRequest adRequest0 = adRequest$Builder0.build();
        QueryInfo.generate(this.zza, AdFormat.BANNER, adRequest0, zzar0);
        return "ef9d4dd5-e00a-4877-9acb-da53e5876707";
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignals() {
        try {
            long v = zzt.zzB().currentTimeMillis();
            String s = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if(this.zzf) {
                Pair[] arr_pair = {new Pair("vlat", String.valueOf(zzt.zzB().currentTimeMillis() - v))};
                zzf.zzc(this.zze, null, "vsg", arr_pair);
                return s;
            }
            return s;
        }
        catch(RuntimeException runtimeException0) {
            zzcaa.zzh("Exception getting view signals. ", runtimeException0);
            zzt.zzo().zzu(runtimeException0, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignalsWithTimeout(int v) {
        if(v <= 0) {
            zzcaa.zzg(("Invalid timeout for getting view signals. Timeout=" + v));
            return "";
        }
        zzap zzap0 = new zzap(this);
        d d0 = zzcan.zza.zzb(zzap0);
        try {
            return (String)d0.get(((long)Math.min(v, this.zzd)), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | TimeoutException | ExecutionException interruptedException0) {
            zzcaa.zzh("Exception getting view signals with timeout. ", interruptedException0);
            zzt.zzo().zzu(interruptedException0, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return interruptedException0 instanceof TimeoutException ? "17" : "";
        }
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public void recordClick(String s) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjh)).booleanValue() && !TextUtils.isEmpty(s)) {
            zzan zzan0 = new zzan(this, s);
            zzcan.zza.execute(zzan0);
        }
    }

    @TargetApi(21)
    @JavascriptInterface
    @KeepForSdk
    public void reportTouchEvent(String s) {
        int v4;
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            int v = jSONObject0.getInt("x");
            int v1 = jSONObject0.getInt("y");
            int v2 = jSONObject0.getInt("duration_ms");
            float f = (float)jSONObject0.getDouble("force");
            int v3 = jSONObject0.getInt("type");
            switch(v3) {
                case 0: {
                    v4 = 0;
                    break;
                }
                case 1: {
                    v4 = 1;
                    break;
                }
                default: {
                    v4 = v3 == 2 || v3 == 3 ? 1 : -1;
                }
            }
            MotionEvent motionEvent0 = MotionEvent.obtain(0L, v2, v4, ((float)v), ((float)v1), f, 1.0f, 0, 1.0f, 1.0f, 0, 0);
            this.zzc.zzd(motionEvent0);
        }
        catch(RuntimeException | JSONException runtimeException0) {
            zzcaa.zzh("Failed to parse the touch string. ", runtimeException0);
            zzt.zzo().zzu(runtimeException0, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    final void zzb(Bundle bundle0, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        CookieManager cookieManager0 = zzt.zzq().zzb(this.zza);
        bundle0.putBoolean("accept_3p_cookie", (cookieManager0 == null ? false : cookieManager0.acceptThirdPartyCookies(this.zzb)));
        Builder adRequest$Builder0 = new Builder();
        adRequest$Builder0.addNetworkExtrasBundle(AdMobAdapter.class, bundle0);
        AdRequest adRequest0 = adRequest$Builder0.build();
        QueryInfo.generate(this.zza, AdFormat.BANNER, adRequest0, queryInfoGenerationCallback0);
    }

    final void zzc(String s) {
        Uri uri0 = Uri.parse(s);
        try {
            uri0 = this.zzc.zza(uri0, this.zza, this.zzb, null);
        }
        catch(zzaqy zzaqy0) {
            zzcaa.zzf("Failed to append the click signal to URL: ", zzaqy0);
            zzt.zzo().zzu(zzaqy0, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzh.zzc(uri0.toString(), null);
    }
}

