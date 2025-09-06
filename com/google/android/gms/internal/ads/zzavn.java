package com.google.android.gms.internal.ads;

public final class zzavn {
    final long zza;
    final String zzb;
    final int zzc;

    zzavn(long v, String s, int v1) {
        this.zza = v;
        this.zzb = s;
        this.zzc = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof zzavn && ((zzavn)object0).zza == this.zza && ((zzavn)object0).zzc == this.zzc;
    }

    @Override
    public final int hashCode() {
        return (int)this.zza;
    }
}

