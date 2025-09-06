package com.google.android.gms.internal.consent_sdk;

import W1.c.b;

public final class zzj implements b {
    public final zzl zza;

    public zzj(zzl zzl0) {
        this.zza = zzl0;
    }

    @Override  // W1.c$b
    public final void onConsentInfoUpdateSuccess() {
        this.zza.zzb(false);
    }
}

