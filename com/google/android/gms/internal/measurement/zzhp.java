package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzhp extends zzhr {
    private int zza;
    private final int zzb;
    private final zzhm zzc;

    zzhp(zzhm zzhm0) {
        this.zzc = zzhm0;
        super();
        this.zza = 0;
        this.zzb = zzhm0.zzb();
    }

    @Override
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhs
    public final byte zza() {
        int v = this.zza;
        if(v >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = v + 1;
        return this.zzc.zzb(v);
    }
}

