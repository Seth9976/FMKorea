package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzet {
    private int zza;
    private long[] zzb;

    public zzet() {
        this(0x20);
    }

    public zzet(int v) {
        this.zzb = new long[0x20];
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int v) {
        if(v < 0 || v >= this.zza) {
            throw new IndexOutOfBoundsException("Invalid index " + v + ", size is " + this.zza);
        }
        return this.zzb[v];
    }

    public final void zzc(long v) {
        int v1 = this.zza;
        long[] arr_v = this.zzb;
        if(v1 == arr_v.length) {
            this.zzb = Arrays.copyOf(arr_v, v1 + v1);
        }
        int v2 = this.zza;
        this.zza = v2 + 1;
        this.zzb[v2] = v;
    }
}

