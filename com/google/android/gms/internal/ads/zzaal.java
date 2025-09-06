package com.google.android.gms.internal.ads;

public final class zzaal {
    public static final zzaal zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;

    static {
        zzaal.zza = new zzaal(-3, 0x8000000000000001L, -1L);
    }

    private zzaal(int v, long v1, long v2) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
    }

    public static zzaal zzd(long v, long v1) {
        return new zzaal(-1, v, v1);
    }

    public static zzaal zze(long v) {
        return new zzaal(0, 0x8000000000000001L, v);
    }

    public static zzaal zzf(long v, long v1) {
        return new zzaal(-2, v, v1);
    }
}

