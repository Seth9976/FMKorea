package com.google.android.gms.internal.consent_sdk;

public final class zzad implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzad(zzdr zzdr0, zzdr zzdr1, zzdr zzdr2) {
        this.zza = zzdr0;
        this.zzb = zzdr1;
        this.zzc = zzdr2;
    }

    public final zzaa zza() {
        return new zzaa(((zzg)this.zza.zzb()), ((zzar)this.zzb).zza(), ((zzas)this.zzc.zzb()));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return this.zza();
    }
}

