package com.google.android.gms.internal.consent_sdk;

import W1.a;
import W1.d;
import android.app.Activity;
import android.app.Application;

final class zzn {
    private final Application zza;
    private final zza zzb;
    private final zzas zzc;

    zzn(Application application0, zza zza0, zzas zzas0) {
        this.zza = application0;
        this.zzb = zza0;
        this.zzc = zzas0;
    }

    final zzck zzd(Activity activity0, d d0) {
        a a0 = d0.a();
        if(a0 == null) {
            a0 = new W1.a.a(this.zza).a();
        }
        return zzp.zza(new zzp(this, activity0, a0, d0, null));
    }
}

