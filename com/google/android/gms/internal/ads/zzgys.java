package com.google.android.gms.internal.ads;

public final class zzgys implements zzgyn, zzgzg {
    private static final Object zza;
    private volatile zzgzg zzb;
    private volatile Object zzc;

    static {
        zzgys.zza = new Object();
    }

    private zzgys(zzgzg zzgzg0) {
        this.zzc = zzgys.zza;
        this.zzb = zzgzg0;
    }

    public static zzgyn zza(zzgzg zzgzg0) {
        if(zzgzg0 instanceof zzgyn) {
            return (zzgyn)zzgzg0;
        }
        zzgzg0.getClass();
        return new zzgys(zzgzg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgyn
    public final Object zzb() {
        Object object0 = this.zzc;
        Object object1 = zzgys.zza;
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

    public static zzgzg zzc(zzgzg zzgzg0) {
        return zzgzg0 instanceof zzgys ? zzgzg0 : new zzgys(zzgzg0);
    }
}

