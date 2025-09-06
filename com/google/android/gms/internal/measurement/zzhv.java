package com.google.android.gms.internal.measurement;

final class zzhv {
    private final zzig zza;
    private final byte[] zzb;

    private zzhv(int v) {
        byte[] arr_b = new byte[v];
        this.zzb = arr_b;
        this.zza = zzig.zzb(arr_b);
    }

    zzhv(int v, zzhu zzhu0) {
        this(v);
    }

    public final zzhm zza() {
        this.zza.zzb();
        return new zzhw(this.zzb);
    }

    public final zzig zzb() {
        return this.zza;
    }
}

