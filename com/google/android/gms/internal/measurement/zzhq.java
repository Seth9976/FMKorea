package com.google.android.gms.internal.measurement;

final class zzhq extends zzhw {
    private final int zzc;
    private final int zzd;

    zzhq(byte[] arr_b, int v, int v1) {
        super(arr_b);
        zzhm.zza(v, v + v1, arr_b.length);
        this.zzc = v;
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhw
    public final byte zza(int v) {
        int v1 = this.zzb();
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
        return this.zzb[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzhw
    final byte zzb(int v) {
        return this.zzb[this.zzc + v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzhw
    public final int zzb() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhw
    protected final int zze() {
        return this.zzc;
    }
}

