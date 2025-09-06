package com.google.android.gms.internal.ads;

public final class zzgms {
    private static final zzgrt zza;

    static {
        zzgms.zza = new zzgmr();
    }

    public static int zza(int v) {
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return v - 2;
    }
}

