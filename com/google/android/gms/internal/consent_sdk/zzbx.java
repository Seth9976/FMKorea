package com.google.android.gms.internal.consent_sdk;

public final class zzbx implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzbx(zzdr zzdr0, zzdr zzdr1, zzdr zzdr2) {
        this.zza = zzdr0;
        this.zzb = zzdr1;
        this.zzc = zzdr2;
    }

    public final zzbw zza() {
        zzby zzby0 = (zzby)this.zza.zzb();
        zzdq.zza(zzct.zza);
        zzcc zzcc0 = ((zzcd)this.zzc).zza();
        return new zzbw(zzby0, zzct.zza, zzcc0);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return this.zza();
    }
}

