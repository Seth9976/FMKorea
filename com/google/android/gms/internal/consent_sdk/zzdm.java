package com.google.android.gms.internal.consent_sdk;

public final class zzdm implements zzdo {
    private zzdr zza;

    public static void zza(zzdr zzdr0, zzdr zzdr1) {
        if(((zzdm)zzdr0).zza != null) {
            throw new IllegalStateException();
        }
        ((zzdm)zzdr0).zza = zzdr1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        zzdr zzdr0 = this.zza;
        if(zzdr0 == null) {
            throw new IllegalStateException();
        }
        return zzdr0.zzb();
    }
}

