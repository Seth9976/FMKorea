package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zzggg {
    private static final zzggg zza;
    private final AtomicReference zzb;

    static {
        zzggg.zza = new zzggg();
    }

    zzggg() {
        this.zzb = new AtomicReference(new zzghb(new zzggx(null), null));
    }

    public static zzggg zza() {
        return zzggg.zza;
    }

    public final Class zzb(Class class0) {
        return ((zzghb)this.zzb.get()).zza(class0);
    }

    public final Object zzc(zzfzp zzfzp0, Class class0) {
        return ((zzghb)this.zzb.get()).zzb(zzfzp0, class0);
    }

    public final Object zzd(zzgao zzgao0, Class class0) {
        return ((zzghb)this.zzb.get()).zzc(zzgao0, class0);
    }

    public final void zze(zzggu zzggu0) {
        synchronized(this) {
            zzggx zzggx0 = new zzggx(((zzghb)this.zzb.get()), null);
            zzggx0.zza(zzggu0);
            zzghb zzghb0 = new zzghb(zzggx0, null);
            this.zzb.set(zzghb0);
        }
    }

    public final void zzf(zzgap zzgap0) {
        synchronized(this) {
            zzggx zzggx0 = new zzggx(((zzghb)this.zzb.get()), null);
            zzggx0.zzb(zzgap0);
            zzghb zzghb0 = new zzghb(zzggx0, null);
            this.zzb.set(zzghb0);
        }
    }
}

