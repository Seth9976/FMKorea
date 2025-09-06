package com.google.android.gms.ads.internal;

import Z1.d;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfye;
import org.json.JSONObject;

public final class zzd implements zzfxl {
    public final zzfhu zza;
    public final zzfhg zzb;

    public zzd(zzfhu zzfhu0, zzfhg zzfhg0) {
        this.zza = zzfhu0;
        this.zzb = zzfhg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        zzfhu zzfhu0 = this.zza;
        zzfhg zzfhg0 = this.zzb;
        boolean z = ((JSONObject)object0).optBoolean("isSuccessful", false);
        if(z) {
            String s = ((JSONObject)object0).getString("appSettingsJson");
            zzt.zzo().zzh().zzu(s);
        }
        zzfhg0.zzf(z);
        zzfhu0.zzb(zzfhg0.zzl());
        return zzfye.zzh(null);
    }
}

