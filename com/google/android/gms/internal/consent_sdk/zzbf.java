package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzbf implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;

    public zzbf(zzdr zzdr0, zzdr zzdr1, zzdr zzdr2, zzdr zzdr3, zzdr zzdr4, zzdr zzdr5) {
        this.zza = zzdr0;
        this.zzb = zzdr1;
        this.zzc = zzdr2;
        this.zzd = zzdr3;
        this.zze = zzdr4;
        this.zzf = zzdr5;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return new zzbe(((Application)this.zza.zzb()), ((zzae)this.zzb.zzb()), ((zzby)this.zzc.zzb()), ((zzas)this.zzd.zzb()), ((zzbs)this.zze.zzb()), this.zzf);
    }
}

