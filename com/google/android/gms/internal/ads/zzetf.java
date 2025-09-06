package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzetf implements zzesi {
    private final Info zza;
    private final String zzb;
    private final zzfof zzc;

    public zzetf(Info advertisingIdClient$Info0, String s, zzfof zzfof0) {
        this.zza = advertisingIdClient$Info0;
        this.zzb = s;
        this.zzc = zzfof0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            JSONObject jSONObject1 = zzbu.zzf(jSONObject0, "pii");
            if(this.zza == null || TextUtils.isEmpty(this.zza.getId())) {
                String s = this.zzb;
                if(s != null) {
                    jSONObject1.put("pdid", s);
                    jSONObject1.put("pdidtype", "ssaid");
                }
            }
            else {
                jSONObject1.put("rdid", this.zza.getId());
                jSONObject1.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                jSONObject1.put("idtype", "adid");
                zzfof zzfof0 = this.zzc;
                if(zzfof0.zzc()) {
                    jSONObject1.put("paidv1_id_android_3p", zzfof0.zzb());
                    jSONObject1.put("paidv1_creation_time_android_3p", this.zzc.zza());
                    return;
                }
            }
            return;
        }
        catch(JSONException jSONException0) {
        }
        zze.zzb("Failed putting Ad ID.", jSONException0);
    }
}

