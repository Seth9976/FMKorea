package com.google.android.gms.internal.ads;

public final class zzgzf implements zzgzg {
    private static final Object zza;
    private volatile zzgzg zzb;
    private volatile Object zzc;

    static {
        zzgzf.zza = new Object();
    }

    private zzgzf(zzgzg zzgzg0) {
        this.zzc = zzgzf.zza;
        this.zzb = zzgzg0;
    }

    public static zzgzg zza(zzgzg zzgzg0) {
        return !(zzgzg0 instanceof zzgzf) && !(zzgzg0 instanceof zzgys) ? new zzgzf(zzgzg0) : zzgzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object object0 = this.zzc;
        if(object0 == zzgzf.zza) {
            zzgzg zzgzg0 = this.zzb;
            if(zzgzg0 == null) {
                return this.zzc;
            }
            object0 = zzgzg0.zzb();
            this.zzc = object0;
            this.zzb = null;
        }
        return object0;
    }
}

