package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

public final class zzfjy {
    private static UiModeManager zza;

    static {
    }

    public static zzfiv zza() {
        switch(zzfjy.zza.getCurrentModeType()) {
            case 1: {
                return zzfiv.zzb;
            }
            case 4: {
                return zzfiv.zza;
            }
            default: {
                return zzfiv.zzc;
            }
        }
    }

    public static void zzb(Context context0) {
        if(context0 != null) {
            zzfjy.zza = (UiModeManager)context0.getSystemService("uimode");
        }
    }
}

