package com.google.android.gms.internal.consent_sdk;

import java.util.List;

final class zzdd extends zzde {
    final transient int zza;
    final transient int zzb;
    final zzde zzc;

    zzdd(zzde zzde0, int v, int v1) {
        this.zzc = zzde0;
        super();
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final Object get(int v) {
        zzcx.zza(v, this.zzb, "index");
        return this.zzc.get(v + this.zza);
    }

    @Override
    public final int size() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzde
    public final List subList(int v, int v1) {
        return this.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzde
    public final zzde zzf(int v, int v1) {
        zzcx.zzc(v, v1, this.zzb);
        return this.zzc.zzf(v + this.zza, v1 + this.zza);
    }
}

