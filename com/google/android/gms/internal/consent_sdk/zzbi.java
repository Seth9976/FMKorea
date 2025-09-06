package com.google.android.gms.internal.consent_sdk;

import W1.f.b;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbi implements b {
    public final AtomicReference zza;

    public zzbi(AtomicReference atomicReference0) {
        this.zza = atomicReference0;
    }

    @Override  // W1.f$b
    public final void onConsentFormLoadSuccess(W1.b b0) {
        this.zza.set(b0);
    }
}

