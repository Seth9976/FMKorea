package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

public final class zzae {
    private final boolean zza;

    zzae(Context context0) {
        this.zza = false;
    }

    public static boolean zza() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}

