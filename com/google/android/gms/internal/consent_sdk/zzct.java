package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class zzct {
    public static final Handler zza;
    public static final Executor zzb;

    static {
        zzct.zza = new Handler(Looper.getMainLooper());
        zzct.zzb = new zzcs("Google consent worker");
    }

    public static void zza() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}

