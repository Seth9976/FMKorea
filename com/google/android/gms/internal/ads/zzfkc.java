package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

public final class zzfkc {
    private static int zza = 2;

    static {
    }

    public static void zza(Context context0) {
        IntentFilter intentFilter0 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        context0.registerReceiver(new zzfkb(), intentFilter0);
    }

    public static int zzb() {
        return zzfjy.zza() == zzfiv.zza ? zzfkc.zza : 2;
    }

    static void zzc(int v) {
        zzfkc.zza = v;
    }
}

