package com.google.android.gms.internal.consent_sdk;

final class zzdh extends zzde {
    static final zzde zza;
    final transient Object[] zzb;
    private final transient int zzc;

    static {
        zzdh.zza = new zzdh(new Object[0], 0);
    }

    zzdh(Object[] arr_object, int v) {
        this.zzb = arr_object;
        this.zzc = v;
    }

    @Override
    public final Object get(int v) {
        zzcx.zza(v, this.zzc, "index");
        Object object0 = this.zzb[v];
        object0.getClass();
        return object0;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzde
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzb, 0, arr_object, 0, this.zzc);
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    final int zzb() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    final int zzc() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdb
    final Object[] zze() {
        return this.zzb;
    }
}

