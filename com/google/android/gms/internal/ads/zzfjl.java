package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

public final class zzfjl {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfjl zza;
    private Context zzb;

    static {
        zzfjl.zza = new zzfjl();
    }

    public final Context zza() {
        return this.zzb;
    }

    public static zzfjl zzb() {
        return zzfjl.zza;
    }

    public final void zzc(Context context0) {
        this.zzb = context0 == null ? null : context0.getApplicationContext();
    }
}

