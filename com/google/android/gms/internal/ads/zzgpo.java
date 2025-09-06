package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgpo {
    private final byte[] zza;

    private zzgpo(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1];
        this.zza = arr_b1;
        System.arraycopy(arr_b, 0, arr_b1, 0, v1);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgpo ? Arrays.equals(((zzgpo)object0).zza, this.zza) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override
    public final String toString() {
        return "Bytes(" + zzgpf.zza(this.zza) + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public static zzgpo zzb(byte[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("data must be non-null");
        }
        return new zzgpo(arr_b, 0, arr_b.length);
    }

    public final byte[] zzc() {
        byte[] arr_b = new byte[this.zza.length];
        System.arraycopy(this.zza, 0, arr_b, 0, this.zza.length);
        return arr_b;
    }
}

