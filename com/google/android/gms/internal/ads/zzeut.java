package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

final class zzeut implements zzesj {
    private final JSONObject zza;

    zzeut(Context context0) {
        this.zza = zzbux.zzc(context0);
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 46;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        return zzfye.zzh((JSONObject jSONObject0) -> try {
            jSONObject0.put("gms_sdk_env", this.zza);
        }
        catch(JSONException unused_ex) {
            zze.zza("Failed putting version constants.");
        });
    }

    // 检测为 Lambda 实现
    final void zzc(JSONObject jSONObject0) [...]
}

