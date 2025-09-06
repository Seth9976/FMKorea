package com.google.android.gms.internal.ads;

public final class zzgja {
    public static final zzgja zza;
    public static final zzgja zzb;
    public static final zzgja zzc;
    public static final zzgja zzd;
    private final String zze;

    static {
        zzgja.zza = new zzgja("TINK");
        zzgja.zzb = new zzgja("CRUNCHY");
        zzgja.zzc = new zzgja("LEGACY");
        zzgja.zzd = new zzgja("NO_PREFIX");
    }

    private zzgja(String s) {
        this.zze = s;
    }

    @Override
    public final String toString() {
        return this.zze;
    }
}

