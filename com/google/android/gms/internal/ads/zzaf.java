package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class zzaf {
    private final SparseBooleanArray zza;
    private boolean zzb;

    public zzaf() {
        this.zza = new SparseBooleanArray();
    }

    public final zzaf zza(int v) {
        zzdy.zzf(!this.zzb);
        this.zza.append(v, true);
        return this;
    }

    public final zzah zzb() {
        zzdy.zzf(!this.zzb);
        this.zzb = true;
        return new zzah(this.zza, null);
    }
}

