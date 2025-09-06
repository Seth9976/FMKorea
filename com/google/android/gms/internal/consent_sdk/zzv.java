package com.google.android.gms.internal.consent_sdk;

import W1.c.a;
import W1.e;

public final class zzv implements Runnable {
    public final a zza;
    public final zzi zzb;

    public zzv(a c$a0, zzi zzi0) {
        this.zza = c$a0;
        this.zzb = zzi0;
    }

    @Override
    public final void run() {
        e e0 = this.zzb.zza();
        this.zza.onConsentInfoUpdateFailure(e0);
    }
}

