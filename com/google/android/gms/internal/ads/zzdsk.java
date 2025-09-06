package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

final class zzdsk {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    zzdsk(String s, zzdsj zzdsj0) {
        this.zzb = s;
    }

    static String zza(zzdsk zzdsk0) {
        String s = (String)zzba.zzc().zzb(zzbbr.zzjl);
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.putOpt("objectId", zzdsk0.zza);
            jSONObject0.put("eventCategory", zzdsk0.zzb);
            jSONObject0.putOpt("event", zzdsk0.zzc);
            jSONObject0.putOpt("errorCode", zzdsk0.zzd);
            jSONObject0.putOpt("rewardType", zzdsk0.zze);
            jSONObject0.putOpt("rewardAmount", zzdsk0.zzf);
            return s + "(\"h5adsEvent\"," + jSONObject0.toString() + ");";
        }
        catch(JSONException unused_ex) {
            zzcaa.zzj("Could not convert parameters to JSON.");
            return s + "(\"h5adsEvent\"," + jSONObject0.toString() + ");";
        }
    }
}

