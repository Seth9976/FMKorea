package com.google.android.gms.internal.consent_sdk;

import W1.b.a;
import W1.e;

public final class zzbo implements Runnable {
    public final a zza;

    public zzbo(a b$a0) {
        this.zza = b$a0;
    }

    @Override
    public final void run() {
        e e0 = new zzi(3, "Privacy options form is being loading. Please try again later.").zza();
        this.zza.a(e0);
    }
}

