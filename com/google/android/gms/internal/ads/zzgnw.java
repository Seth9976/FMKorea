package com.google.android.gms.internal.ads;

public enum zzgnw implements zzgrs {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private static final zzgrt zzg;
    private final int zzi;

    static {
        zzgnw.zzg = new zzgnv();
    }

    private zzgnw(int v1) {
        this.zzi = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    public final int zza() {
        if(this == zzgnw.zzf) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.zzi;
    }

    public static zzgnw zzb(int v) {
        switch(v) {
            case 0: {
                return zzgnw.zza;
            }
            case 1: {
                return zzgnw.zzb;
            }
            case 2: {
                return zzgnw.zzc;
            }
            case 3: {
                return zzgnw.zzd;
            }
            case 4: {
                return zzgnw.zze;
            }
            default: {
                return null;
            }
        }
    }
}

