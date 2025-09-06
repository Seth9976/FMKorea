package com.google.android.gms.internal.consent_sdk;

import W1.c.b;

public final class zzt implements Runnable {
    public final b zza;

    public zzt(b c$b0) {
        this.zza = c$b0;
    }

    @Override
    public final void run() {
        this.zza.onConsentInfoUpdateSuccess();
    }
}

