package com.google.android.gms.internal.consent_sdk;

import W1.e;
import android.util.Log;

public final class zzi extends Exception {
    private final int zza;

    public zzi(int v, String s) {
        super(s);
        this.zza = v;
    }

    public zzi(int v, String s, Throwable throwable0) {
        super(s, throwable0);
        this.zza = v;
    }

    public final e zza() {
        if(this.getCause() == null) {
            Log.w("UserMessagingPlatform", this.getMessage());
            return new e(this.zza, this.getMessage());
        }
        Log.w("UserMessagingPlatform", this.getMessage(), this.getCause());
        return new e(this.zza, this.getMessage());
    }
}

