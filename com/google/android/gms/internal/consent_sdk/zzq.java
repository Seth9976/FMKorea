package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzq implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzq(zzdr zzdr0, zzdr zzdr1, zzdr zzdr2) {
        this.zza = zzdr0;
        this.zzb = zzdr1;
        this.zzc = zzdr2;
    }

    public final zzn zza() {
        return new zzn(((Application)this.zza.zzb()), ((zzb)this.zzb).zza(), ((zzas)this.zzc.zzb()));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return this.zza();
    }
}

