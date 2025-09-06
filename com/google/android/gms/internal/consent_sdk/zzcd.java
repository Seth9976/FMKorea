package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzcd implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;
    private final zzdr zzh;

    public zzcd(zzdr zzdr0, zzdr zzdr1, zzdr zzdr2, zzdr zzdr3, zzdr zzdr4, zzdr zzdr5, zzdr zzdr6, zzdr zzdr7) {
        this.zza = zzdr0;
        this.zzb = zzdr1;
        this.zzc = zzdr2;
        this.zzd = zzdr3;
        this.zze = zzdr4;
        this.zzf = zzdr5;
        this.zzg = zzdr6;
        this.zzh = zzdr7;
    }

    public final zzcc zza() {
        Object object0 = this.zza.zzb();
        Object object1 = this.zzb.zzb();
        zzdq.zza(zzct.zza);
        zzdq.zza(zzct.zzb);
        Object object2 = this.zze.zzb();
        zzaq zzaq0 = ((zzar)this.zzf).zza();
        Object object3 = this.zzg.zzb();
        Object object4 = this.zzh.zzb();
        return new zzcc(((Application)object0), ((zzby)object1), zzct.zza, zzct.zzb, ((zzg)object2), zzaq0, ((zzbe)object3), ((zzas)object4));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return this.zza();
    }
}

