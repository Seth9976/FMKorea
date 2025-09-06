package com.google.android.gms.internal.ads;

final class zzfsa implements zzfry {
    private static final zzfry zza;
    private volatile zzfry zzb;
    private Object zzc;

    static {
        zzfsa.zza = () -> throw new IllegalStateException();
    }

    zzfsa(zzfry zzfry0) {
        this.zzb = zzfry0;
    }

    @Override
    public final String toString() {
        zzfry zzfry0 = this.zzb;
        if(zzfry0 == zzfsa.zza) {
            zzfry0 = "<supplier that returned " + this.zzc + ">";
        }
        return "Suppliers.memoize(" + zzfry0 + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzfry
    public final Object zza() {
        zzfry zzfry0 = zzfsa.zza;
        if(this.zzb != zzfry0) {
            synchronized(this) {
                if(this.zzb != zzfry0) {
                    Object object0 = this.zzb.zza();
                    this.zzc = object0;
                    this.zzb = zzfry0;
                    return object0;
                }
            }
        }
        return this.zzc;
    }
}

