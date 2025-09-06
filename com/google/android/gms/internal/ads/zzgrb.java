package com.google.android.gms.internal.ads;

final class zzgrb {
    private final Object zza;
    private final int zzb;

    zzgrb(Object object0, int v) {
        this.zza = object0;
        this.zzb = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgrb ? this.zza == ((zzgrb)object0).zza && this.zzb == ((zzgrb)object0).zzb : false;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.zza) * 0xFFFF + this.zzb;
    }
}

