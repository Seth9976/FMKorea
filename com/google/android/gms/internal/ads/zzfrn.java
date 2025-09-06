package com.google.android.gms.internal.ads;

final class zzfrn extends zzfre {
    private final Object zza;

    zzfrn(Object object0) {
        this.zza = object0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzfrn ? this.zza.equals(((zzfrn)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode() + 0x598DF91C;
    }

    @Override
    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final zzfre zza(zzfqw zzfqw0) {
        Object object0 = zzfqw0.apply(this.zza);
        zzfri.zzc(object0, "the Function passed to Optional.transform() must not return null.");
        return new zzfrn(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfre
    public final Object zzb(Object object0) {
        return this.zza;
    }
}

