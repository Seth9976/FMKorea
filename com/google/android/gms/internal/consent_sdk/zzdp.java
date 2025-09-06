package com.google.android.gms.internal.consent_sdk;

public final class zzdp implements zzdo {
    private static final zzdp zza;
    private final Object zzb;

    static {
        zzdp.zza = new zzdp(null);
    }

    private zzdp(Object object0) {
        this.zzb = object0;
    }

    public static zzdo zza(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("instance cannot be null");
        }
        return new zzdp(object0);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return this.zzb;
    }
}

