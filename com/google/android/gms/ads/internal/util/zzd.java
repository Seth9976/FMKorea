package com.google.android.gms.ads.internal.util;

import Z1.d;
import android.content.Context;
import android.provider.Settings.Global;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcaq;

public final class zzd {
    public static void zza(Context context0) {
        if(((Boolean)zzbdg.zza.zze()).booleanValue()) {
            try {
                int v = Settings.Global.getInt(context0.getContentResolver(), "development_settings_enabled", 0);
            }
            catch(Exception exception0) {
                zzcaa.zzk("Fail to determine debug setting.", exception0);
                return;
            }
            if(v != 0 && !zzbzz.zzl()) {
                d d0 = new zzc(context0).zzb();
                zzcaa.zzi("Updating ad debug logging enablement.");
                zzcaq.zza(d0, "AdDebugLogUpdater.updateEnablement");
            }
        }
    }
}

