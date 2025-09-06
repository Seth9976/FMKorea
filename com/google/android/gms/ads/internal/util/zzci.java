package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

public final class zzci {
    String zza;
    private static zzci zzb;

    static {
    }

    public static zzci zza() {
        if(zzci.zzb == null) {
            zzci.zzb = new zzci();
        }
        return zzci.zzb;
    }

    public final void zzb(Context context0) {
        zze.zza("Updating user agent.");
        String s = WebSettings.getDefaultUserAgent(context0);
        if(!s.equals(this.zza)) {
            if(GooglePlayServicesUtilLight.getRemoteContext(context0) == null) {
                String s1 = WebSettings.getDefaultUserAgent(context0);
                context0.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", s1).apply();
            }
            this.zza = s;
        }
        zze.zza("User agent is updated.");
    }
}

