package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import java.util.Map;

public final class zzfgw {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfgw(Context context0, zzcag zzcag0) {
        this.zza = context0;
        this.zzb = "com.fmkorea.m.fmk";
        this.zzc = zzcag0.zza;
    }

    public final void zza(Map map0) {
        map0.put("s", "gmob_sdk");
        map0.put("v", "3");
        map0.put("os", Build.VERSION.RELEASE);
        map0.put("api_v", Build.VERSION.SDK);
        map0.put("device", zzs.zzp());
        map0.put("app", this.zzb);
        String s = "1";
        map0.put("is_lite_sdk", (zzs.zzB(this.zza) ? "1" : "0"));
        List list0 = zzba.zza().zzb();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgM)).booleanValue()) {
            list0.addAll(zzt.zzo().zzh().zzh().zzd());
        }
        map0.put("e", TextUtils.join(",", list0));
        map0.put("sdkVersion", this.zzc);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkg)).booleanValue()) {
            if(!zzs.zzy(this.zza)) {
                s = "0";
            }
            map0.put("is_bstar", s);
        }
    }
}

