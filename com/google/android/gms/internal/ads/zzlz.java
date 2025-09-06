package com.google.android.gms.internal.ads;

import android.util.SparseArray;

public final class zzlz {
    private final zzah zza;
    private final SparseArray zzb;

    public zzlz(zzah zzah0, SparseArray sparseArray0) {
        this.zza = zzah0;
        SparseArray sparseArray1 = new SparseArray(zzah0.zzb());
        for(int v = 0; v < zzah0.zzb(); ++v) {
            int v1 = zzah0.zza(v);
            zzly zzly0 = (zzly)sparseArray0.get(v1);
            zzly0.getClass();
            sparseArray1.append(v1, zzly0);
        }
        this.zzb = sparseArray1;
    }

    public final int zza(int v) {
        return this.zza.zza(v);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzly zzc(int v) {
        zzly zzly0 = (zzly)this.zzb.get(v);
        zzly0.getClass();
        return zzly0;
    }

    public final boolean zzd(int v) {
        return this.zza.zzc(v);
    }
}

