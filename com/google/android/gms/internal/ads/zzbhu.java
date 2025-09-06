package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzbhu implements zzbir {
    public static final zzbhu zza;

    static {
        zzbhu.zza = new zzbhu();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzhS)).booleanValue()) {
            zzcaa.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String s = (String)map0.get("package_name");
        if(TextUtils.isEmpty(s)) {
            zzcaa.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap0 = new HashMap();
        Boolean boolean0 = Boolean.valueOf(((zzcgj)object0).getContext().getPackageManager().getLaunchIntentForPackage(s) != null);
        hashMap0.put(s, boolean0);
        zze.zza(("/canOpenApp;" + s + ";" + boolean0));
        ((zzbll)(((zzcgj)object0))).zzd("openableApp", hashMap0);
    }
}

