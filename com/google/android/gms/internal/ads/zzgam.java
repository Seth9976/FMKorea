package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzgam implements Comparable {
    private final byte[] zza;

    zzgam(byte[] arr_b, zzgal zzgal0) {
        this.zza = Arrays.copyOf(arr_b, arr_b.length);
    }

    @Override
    public final int compareTo(Object object0) {
        if(this.zza.length != ((zzgam)object0).zza.length) {
            return this.zza.length - ((zzgam)object0).zza.length;
        }
        for(int v = 0; true; ++v) {
            byte[] arr_b = this.zza;
            if(v >= arr_b.length) {
                break;
            }
            int v1 = arr_b[v];
            int v2 = ((zzgam)object0).zza[v];
            if(v1 != v2) {
                return v1 - v2;
            }
        }
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgam ? Arrays.equals(this.zza, ((zzgam)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override
    public final String toString() {
        return zzgpf.zza(this.zza);
    }
}

