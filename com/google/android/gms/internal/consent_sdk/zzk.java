package com.google.android.gms.internal.consent_sdk;

import W1.c.a;
import W1.e;

public final class zzk implements a {
    public final zzl zza;

    public zzk(zzl zzl0) {
        this.zza = zzl0;
    }

    @Override  // W1.c$a
    public final void onConsentInfoUpdateFailure(e e0) {
        this.zza.zzb(false);
    }
}

