package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class zzbuq {
    private final List zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final String zzh;
    private final String zzi;
    private final int zzj;
    private final JSONObject zzk;
    private final String zzl;
    private final String zzm;

    public zzbuq(JSONObject jSONObject0) {
        this.zzi = jSONObject0.optString("url");
        this.zzb = jSONObject0.optString("base_uri");
        this.zzc = jSONObject0.optString("post_parameters");
        this.zze = zzbuq.zzj(jSONObject0.optString("drt_include"));
        this.zzf = zzbuq.zzj(jSONObject0.optString("cookies_include", "true"));
        this.zzg = jSONObject0.optString("request_id");
        this.zzd = jSONObject0.optString("type");
        String s = jSONObject0.optString("errors");
        this.zza = s == null ? null : Arrays.asList(s.split(","));
        this.zzj = jSONObject0.optInt("valid", 0) == 1 ? -2 : 1;
        this.zzh = jSONObject0.optString("fetched_ad");
        jSONObject0.optBoolean("render_test_ad_label");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("preprocessor_flags");
        if(jSONObject1 == null) {
            jSONObject1 = new JSONObject();
        }
        this.zzk = jSONObject1;
        this.zzl = jSONObject0.optString("analytics_query_ad_event_id");
        jSONObject0.optBoolean("is_analytics_logging_enabled");
        this.zzm = jSONObject0.optString("pool_key");
    }

    public final int zza() {
        return this.zzj;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzm;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzi;
    }

    public final List zzf() {
        return this.zza;
    }

    public final JSONObject zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zze;
    }

    // 去混淆评级： 低(20)
    private static boolean zzj(String s) {
        return s != null && (s.equals("1") || s.equals("true"));
    }
}

