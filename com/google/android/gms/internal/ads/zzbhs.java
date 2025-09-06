package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzbhs implements zzbir {
    public static final zzbhs zza;

    static {
        zzbhs.zza = new zzbhs();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("urls");
        if(TextUtils.isEmpty(s)) {
            zzcaa.zzj("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] arr_s = s.split(",");
        HashMap hashMap0 = new HashMap();
        PackageManager packageManager0 = ((zzcgj)object0).getContext().getPackageManager();
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            String[] arr_s1 = s1.split(";", 2);
            Boolean boolean0 = Boolean.valueOf(packageManager0.resolveActivity(new Intent((arr_s1.length <= 1 ? "android.intent.action.VIEW" : arr_s1[1].trim()), Uri.parse(arr_s1[0].trim())), 0x10000) != null);
            hashMap0.put(s1, boolean0);
            zze.zza(("/canOpenURLs;" + s1 + ";" + boolean0));
        }
        ((zzbll)(((zzcgj)object0))).zzd("openableURLs", hashMap0);
    }
}

