package com.google.android.gms.internal.ads;

public final class zzgbk {
    public static final zzgbk zza;
    public static final zzgbk zzb;
    public static final zzgbk zzc;
    private final String zzd;

    static {
        zzgbk.zza = new zzgbk("TINK");
        zzgbk.zzb = new zzgbk("CRUNCHY");
        zzgbk.zzc = new zzgbk("NO_PREFIX");
    }

    private zzgbk(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

