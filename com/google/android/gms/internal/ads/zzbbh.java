package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbbh extends zzbbj {
    zzbbh(int v, String s, String s1) {
        super(1, s, s1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zza(JSONObject jSONObject0) {
        return jSONObject0.optString(this.zzn(), ((String)this.zzm()));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzn()) ? bundle0.getString("com.google.android.gms.ads.flag." + this.zzn()) : ((String)this.zzm());
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getString(this.zzn(), ((String)this.zzm()));
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putString(this.zzn(), ((String)object0));
    }
}

