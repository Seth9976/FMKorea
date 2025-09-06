package com.google.android.gms.internal.consent_sdk;

import W1.b.a;
import W1.f.b;
import android.app.Activity;

public final class zzbg implements b {
    public final Activity zza;
    public final a zzb;

    public zzbg(Activity activity0, a b$a0) {
        this.zza = activity0;
        this.zzb = b$a0;
    }

    @Override  // W1.f$b
    public final void onConsentFormLoadSuccess(W1.b b0) {
        b0.show(this.zza, this.zzb);
    }
}

