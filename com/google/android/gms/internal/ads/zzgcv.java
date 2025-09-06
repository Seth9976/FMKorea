package com.google.android.gms.internal.ads;

public final class zzgcv {
    public static final zzgcv zza;
    public static final zzgcv zzb;
    public static final zzgcv zzc;
    private final String zzd;

    static {
        zzgcv.zza = new zzgcv("TINK");
        zzgcv.zzb = new zzgcv("CRUNCHY");
        zzgcv.zzc = new zzgcv("NO_PREFIX");
    }

    private zzgcv(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

