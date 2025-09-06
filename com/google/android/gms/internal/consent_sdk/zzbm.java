package com.google.android.gms.internal.consent_sdk;

import W1.b.a;
import W1.e;

public final class zzbm implements Runnable {
    public final a zza;

    public zzbm(a b$a0) {
        this.zza = b$a0;
    }

    @Override
    public final void run() {
        e e0 = new zzi(3, "No valid response received yet.").zza();
        this.zza.a(e0);
    }
}

