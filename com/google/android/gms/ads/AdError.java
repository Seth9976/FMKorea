package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final AdError zzd;

    public AdError(int v, String s, String s1) {
        this(v, s, s1, null);
    }

    public AdError(int v, String s, String s1, AdError adError0) {
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = adError0;
    }

    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    public String getDomain() {
        return this.zzc;
    }

    public String getMessage() {
        return this.zzb;
    }

    @Override
    public String toString() {
        try {
            return this.zzb().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }

    public final zze zza() {
        if(this.zzd == null) {
            return new zze(this.zza, this.zzb, this.zzc, null, null);
        }
        zze zze0 = new zze(this.zzd.zza, this.zzd.zzb, this.zzd.zzc, null, null);
        return new zze(this.zza, this.zzb, this.zzc, zze0, null);
    }

    public JSONObject zzb() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("Code", this.zza);
        jSONObject0.put("Message", this.zzb);
        jSONObject0.put("Domain", this.zzc);
        AdError adError0 = this.zzd;
        if(adError0 == null) {
            jSONObject0.put("Cause", "null");
            return jSONObject0;
        }
        jSONObject0.put("Cause", adError0.zzb());
        return jSONObject0;
    }
}

