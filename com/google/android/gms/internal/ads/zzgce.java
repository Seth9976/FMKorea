package com.google.android.gms.internal.ads;

public final class zzgce {
    public static final zzgce zza;
    public static final zzgce zzb;
    public static final zzgce zzc;
    private final String zzd;

    static {
        zzgce.zza = new zzgce("TINK");
        zzgce.zzb = new zzgce("CRUNCHY");
        zzgce.zzc = new zzgce("NO_PREFIX");
    }

    private zzgce(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

