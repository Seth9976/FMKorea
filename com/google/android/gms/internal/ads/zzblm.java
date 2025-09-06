package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzblm {
    public static void zza(zzbln zzbln0, String s, Map map0) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = zzay.zzb().zzi(map0);
        }
        catch(JSONException unused_ex) {
            zzcaa.zzj("Could not convert parameters to JSON.");
            return;
        }
        zzbln0.zze(s, jSONObject0);
    }

    public static void zzb(zzbln zzbln0, String s, JSONObject jSONObject0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("(window.AFMA_ReceiveMessage || function() {})(\'");
        stringBuilder0.append(s);
        stringBuilder0.append("\',");
        stringBuilder0.append(jSONObject0.toString());
        stringBuilder0.append(");");
        zzcaa.zze(("Dispatching AFMA event: " + stringBuilder0.toString()));
        zzbln0.zza(stringBuilder0.toString());
    }

    public static void zzc(zzbln zzbln0, String s, String s1) {
        zzbln0.zza(s + "(" + s1 + ");");
    }

    public static void zzd(zzbln zzbln0, String s, JSONObject jSONObject0) {
        zzbln0.zzb(s, jSONObject0.toString());
    }
}

