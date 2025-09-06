package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbux extends zzbuy {
    private final Object zza;
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbmy zzd;

    public zzbux(Context context0, zzbmy zzbmy0) {
        this.zza = new Object();
        this.zzb = context0.getApplicationContext();
        this.zzd = zzbmy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final d zza() {
        synchronized(this.zza) {
            if(this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        long v1 = this.zzc.getLong("js_last_update", 0L);
        if(zzt.zzB().currentTimeMillis() - v1 < ((long)(((Long)zzbdk.zzb.zze())))) {
            return zzfye.zzh(null);
        }
        JSONObject jSONObject0 = zzbux.zzc(this.zzb);
        return zzfye.zzm(this.zzd.zzb(jSONObject0), new zzbuw(this), zzcan.zzf);
    }

    final Void zzb(JSONObject jSONObject0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = zzbbl.zza(this.zzb).edit();
        zzba.zza().zze(sharedPreferences$Editor0, 1, jSONObject0);
        sharedPreferences$Editor0.commit();
        this.zzc.edit().putLong("js_last_update", zzt.zzB().currentTimeMillis()).apply();
        return null;
    }

    public static JSONObject zzc(Context context0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("js", "afma-sdk-a-v12451000.12451000.0");
            jSONObject0.put("mf", zzbdk.zza.zze());
            jSONObject0.put("cl", "559203513");
            jSONObject0.put("rapid_rc", "dev");
            jSONObject0.put("rapid_rollup", "HEAD");
            jSONObject0.put("admob_module_version", 12451000);
            jSONObject0.put("dynamite_local_version", 233012802);
            jSONObject0.put("dynamite_version", DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.ads.dynamite"));
            jSONObject0.put("container_version", 12451000);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }
}

