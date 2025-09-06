package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbbe extends zzbbj {
    zzbbe(int v, String s, Integer integer0) {
        super(1, s, integer0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zza(JSONObject jSONObject0) {
        return jSONObject0.optInt(this.zzn(), ((int)(((Integer)this.zzm()))));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzn()) ? bundle0.getInt("com.google.android.gms.ads.flag." + this.zzn()) : ((Integer)this.zzm());
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getInt(this.zzn(), ((int)(((Integer)this.zzm()))));
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putInt(this.zzn(), ((int)(((Integer)object0))));
    }
}

