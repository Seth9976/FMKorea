package com.google.android.gms.internal.consent_sdk;

public final class zzdn implements zzdr {
    private static final Object zza;
    private volatile zzdr zzb;
    private volatile Object zzc;

    static {
        zzdn.zza = new Object();
    }

    private zzdn(zzdr zzdr0) {
        this.zzc = zzdn.zza;
        this.zzb = zzdr0;
    }

    public static zzdr zza(zzdr zzdr0) {
        return zzdr0 instanceof zzdn ? zzdr0 : new zzdn(zzdr0);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        Object object0 = this.zzc;
        Object object1 = zzdn.zza;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.zzc;
                if(object0 == object1) {
                    object0 = this.zzb.zzb();
                    Object object2 = this.zzc;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = object0;
                    this.zzb = null;
                }
            }
        }
        return object0;
    }
}

