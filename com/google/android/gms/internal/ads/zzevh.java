package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevh implements zzesi {
    private final Bundle zza;

    public zzevh(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        if(this.zza != null) {
            try {
                zzbu.zzf(zzbu.zzf(jSONObject0, "device"), "play_store").put("parental_controls", zzay.zzb().zzh(this.zza));
            }
            catch(JSONException unused_ex) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}

