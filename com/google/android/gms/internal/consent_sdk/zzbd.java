package com.google.android.gms.internal.consent_sdk;

import W1.e;
import W1.f.a;
import W1.f.b;

final class zzbd implements a, b {
    private final b zza;
    private final a zzb;

    zzbd(b f$b0, a f$a0, zzbc zzbc0) {
        this.zza = f$b0;
        this.zzb = f$a0;
    }

    @Override  // W1.f$a
    public final void onConsentFormLoadFailure(e e0) {
        this.zzb.onConsentFormLoadFailure(e0);
    }

    @Override  // W1.f$b
    public final void onConsentFormLoadSuccess(W1.b b0) {
        this.zza.onConsentFormLoadSuccess(b0);
    }
}

