package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbhg implements zzbir {
    private final zzbhh zza;

    public zzbhg(zzbhh zzbhh0) {
        this.zza = zzbhh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(this.zza == null) {
            return;
        }
        String s = (String)map0.get("name");
        if(s == null) {
            zzcaa.zzi("Ad metadata with no name parameter.");
            s = "";
        }
        Bundle bundle0 = null;
        if(map0.containsKey("info")) {
            try {
                bundle0 = zzbu.zza(new JSONObject(((String)map0.get("info"))));
            }
            catch(JSONException jSONException0) {
                zzcaa.zzh("Failed to convert ad metadata to JSON.", jSONException0);
            }
        }
        if(bundle0 == null) {
            zzcaa.zzg("Failed to convert ad metadata to Bundle.");
            return;
        }
        this.zza.zza(s, bundle0);
    }
}

