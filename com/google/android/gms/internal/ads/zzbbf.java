package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbbf extends zzbbj {
    zzbbf(int v, String s, Long long0) {
        super(1, s, long0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zza(JSONObject jSONObject0) {
        return jSONObject0.optLong(this.zzn(), ((long)(((Long)this.zzm()))));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzn()) ? bundle0.getLong("com.google.android.gms.ads.flag." + this.zzn()) : ((Long)this.zzm());
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getLong(this.zzn(), ((long)(((Long)this.zzm()))));
    }

    @Override  // com.google.android.gms.internal.ads.zzbbj
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putLong(this.zzn(), ((long)(((Long)object0))));
    }
}

