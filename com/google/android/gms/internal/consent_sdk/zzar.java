package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzar implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzar(zzdr zzdr0, zzdr zzdr1, zzdr zzdr2) {
        this.zza = zzdr0;
        this.zzb = zzdr1;
        this.zzc = zzdr2;
    }

    public final zzaq zza() {
        Application application0 = (Application)this.zza.zzb();
        zzas zzas0 = (zzas)this.zzb.zzb();
        zzdq.zza(zzct.zzb);
        return new zzaq(application0, zzas0, zzct.zzb);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return this.zza();
    }
}

