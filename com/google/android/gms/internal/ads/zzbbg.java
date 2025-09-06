package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbbg extends zzbbj {
    zzbbg(int v, String s, Float float0) {
        super(1, s, float0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zza(JSONObject jSONObject0) {
        return (float)jSONObject0.optDouble(this.zzn(), ((double)(((float)(((Float)this.zzm()))))));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzn()) ? bundle0.getFloat("com.google.android.gms.ads.flag." + this.zzn()) : ((Float)this.zzm());
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getFloat(this.zzn(), ((float)(((Float)this.zzm()))));
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putFloat(this.zzn(), ((float)(((Float)object0))));
    }
}

