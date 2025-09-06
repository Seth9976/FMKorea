package com.google.android.gms.internal.ads;

public final class zzgdy {
    public static final zzgdy zza;
    public static final zzgdy zzb;
    public static final zzgdy zzc;
    private final String zzd;

    static {
        zzgdy.zza = new zzgdy("TINK");
        zzgdy.zzb = new zzgdy("CRUNCHY");
        zzgdy.zzc = new zzgdy("NO_PREFIX");
    }

    private zzgdy(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

