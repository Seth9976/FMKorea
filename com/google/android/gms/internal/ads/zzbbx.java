package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class zzbbx {
    private final String zza;
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbbx(Context context0, String s) {
        this.zzc = context0;
        this.zzd = s;
        this.zza = "https://csi.gstatic.com/csi";
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.zzb = linkedHashMap0;
        linkedHashMap0.put("s", "gmob_sdk");
        linkedHashMap0.put("v", "3");
        linkedHashMap0.put("os", Build.VERSION.RELEASE);
        linkedHashMap0.put("api_v", Build.VERSION.SDK);
        linkedHashMap0.put("device", zzs.zzp());
        boolean z = context0.getApplicationContext() == null;
        linkedHashMap0.put("app", "com.fmkorea.m.fmk");
        String s1 = "1";
        linkedHashMap0.put("is_lite_sdk", (zzs.zzB(context0) ? "1" : "0"));
        Future future0 = zzt.zzm().zzb(context0);
        try {
            linkedHashMap0.put("network_coarse", Integer.toString(((zzbus)future0.get()).zzk));
            linkedHashMap0.put("network_fine", Integer.toString(((zzbus)future0.get()).zzl));
        }
        catch(Exception exception0) {
            zzt.zzo().zzu(exception0, "CsiConfiguration.CsiConfiguration");
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzkg)).booleanValue()) {
            Map map0 = this.zzb;
            if(!zzs.zzy(context0)) {
                s1 = "0";
            }
            map0.put("is_bstar", s1);
        }
    }

    final Context zza() {
        return this.zzc;
    }

    final String zzb() {
        return this.zzd;
    }

    final String zzc() {
        return this.zza;
    }

    final Map zzd() {
        return this.zzb;
    }
}

