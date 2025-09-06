package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public final class zzcc {
    public static final int zza;
    private static final int zzb;

    static {
        zzcc.zzb = 0x4000000;
        zzcc.zza = Build.VERSION.SDK_INT < 0x1F ? 0 : 0x2000000;
    }

    public static PendingIntent zza(Context context0, int v, Intent intent0, int v1) {
        return PendingIntent.getBroadcast(context0, 0, intent0, v1);
    }
}

