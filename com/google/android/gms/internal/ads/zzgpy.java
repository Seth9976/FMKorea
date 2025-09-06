package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzgpy extends zzgqa {
    final zzgqi zza;
    private int zzb;
    private final int zzc;

    zzgpy(zzgqi zzgqi0) {
        this.zza = zzgqi0;
        super();
        this.zzb = 0;
        this.zzc = zzgqi0.zzd();
    }

    @Override
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqc
    public final byte zza() {
        int v = this.zzb;
        if(v >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = v + 1;
        return this.zza.zzb(v);
    }
}

