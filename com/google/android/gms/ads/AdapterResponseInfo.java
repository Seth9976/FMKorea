package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;

public final class AdapterResponseInfo {
    private final zzu zza;
    private final AdError zzb;

    private AdapterResponseInfo(zzu zzu0) {
        this.zza = zzu0;
        this.zzb = zzu0.zzc == null ? null : zzu0.zzc.zza();
    }

    public AdError getAdError() {
        return this.zzb;
    }

    public String getAdSourceId() {
        return this.zza.zzf;
    }

    public String getAdSourceInstanceId() {
        return this.zza.zzh;
    }

    public String getAdSourceInstanceName() {
        return this.zza.zzg;
    }

    public String getAdSourceName() {
        return this.zza.zze;
    }

    public String getAdapterClassName() {
        return this.zza.zza;
    }

    public Bundle getCredentials() {
        return this.zza.zzd;
    }

    public long getLatencyMillis() {
        return this.zza.zzb;
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

    public static AdapterResponseInfo zza(zzu zzu0) {
        return zzu0 == null ? null : new AdapterResponseInfo(zzu0);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("Adapter", this.zza.zza);
        jSONObject0.put("Latency", this.zza.zzb);
        String s = this.getAdSourceName();
        if(s == null) {
            jSONObject0.put("Ad Source Name", "null");
        }
        else {
            jSONObject0.put("Ad Source Name", s);
        }
        String s1 = this.getAdSourceId();
        if(s1 == null) {
            jSONObject0.put("Ad Source ID", "null");
        }
        else {
            jSONObject0.put("Ad Source ID", s1);
        }
        String s2 = this.getAdSourceInstanceName();
        if(s2 == null) {
            jSONObject0.put("Ad Source Instance Name", "null");
        }
        else {
            jSONObject0.put("Ad Source Instance Name", s2);
        }
        String s3 = this.getAdSourceInstanceId();
        if(s3 == null) {
            jSONObject0.put("Ad Source Instance ID", "null");
        }
        else {
            jSONObject0.put("Ad Source Instance ID", s3);
        }
        JSONObject jSONObject1 = new JSONObject();
        for(Object object0: this.zza.zzd.keySet()) {
            jSONObject1.put(((String)object0), this.zza.zzd.get(((String)object0)));
        }
        jSONObject0.put("Credentials", jSONObject1);
        AdError adError0 = this.zzb;
        if(adError0 == null) {
            jSONObject0.put("Ad Error", "null");
            return jSONObject0;
        }
        jSONObject0.put("Ad Error", adError0.zzb());
        return jSONObject0;
    }
}

