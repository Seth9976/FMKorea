package com.google.android.gms.internal.ads;

public enum zzgmp implements zzgrs {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private static final zzgrt zzg;
    private final int zzi;

    static {
        zzgmp.zzg = new zzgmo();
    }

    private zzgmp(int v1) {
        this.zzi = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        if(this == zzgmp.zzf) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.zzi;
    }
}

