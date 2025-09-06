package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbbd extends zzbbj {
    zzbbd(int v, String s, Boolean boolean0) {
        super(v, s, boolean0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zza(JSONObject jSONObject0) {
        return Boolean.valueOf(jSONObject0.optBoolean(this.zzn(), ((Boolean)this.zzm()).booleanValue()));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzn()) ? Boolean.valueOf(bundle0.getBoolean("com.google.android.gms.ads.flag." + this.zzn())) : ((Boolean)this.zzm());
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return Boolean.valueOf(sharedPreferences0.getBoolean(this.zzn(), ((Boolean)this.zzm()).booleanValue()));
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putBoolean(this.zzn(), ((Boolean)object0).booleanValue());
    }
}

