package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

final class zzdty {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdty(String s, String s1, String s2, int v, String s3, int v1, boolean z) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = v;
        this.zze = s3;
        this.zzf = v1;
        this.zzg = z;
    }

    public final JSONObject zza() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("adapterClassName", this.zza);
        jSONObject0.put("version", this.zzc);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziV)).booleanValue()) {
            jSONObject0.put("sdkVersion", this.zzb);
        }
        jSONObject0.put("status", this.zzd);
        jSONObject0.put("description", this.zze);
        jSONObject0.put("initializationLatencyMillis", this.zzf);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziW)).booleanValue()) {
            jSONObject0.put("supportsInitialization", this.zzg);
        }
        return jSONObject0;
    }
}

