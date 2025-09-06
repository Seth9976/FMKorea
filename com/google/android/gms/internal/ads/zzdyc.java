package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdyc implements zzfxl {
    public static final zzdyc zza;

    static {
        zzdyc.zza = new zzdyc();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        InputStream inputStream0 = (InputStream)object0;
        JSONObject jSONObject0 = new JSONObject();
        if(inputStream0 == null) {
            return zzfye.zzh(jSONObject0);
        }
        try {
            return zzfye.zzh(new JSONObject(zzs.zzK(new InputStreamReader(inputStream0))));
        }
        catch(IOException | JSONException iOException0) {
            zzt.zzo().zzu(iOException0, "AdsServiceSignalTask.startAdsServiceSignalTask");
            return zzfye.zzh(jSONObject0);
        }
    }
}

