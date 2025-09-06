package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import c0.a;

public final class zzedj {
    private a zza;
    private final Context zzb;

    zzedj(Context context0) {
        this.zzb = context0;
    }

    public final d zza() {
        a a0 = a.a(this.zzb);
        this.zza = a0;
        return a0 == null ? zzfye.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : a0.b();
    }

    public final d zzb(Uri uri0, InputEvent inputEvent0) {
        a a0 = this.zza;
        a0.getClass();
        return a0.c(uri0, inputEvent0);
    }
}

