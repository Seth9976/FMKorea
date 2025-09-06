package com.google.android.gms.internal.ads;

public final class zzgiz {
    public static final zzgiz zza;
    public static final zzgiz zzb;
    public static final zzgiz zzc;
    public static final zzgiz zzd;
    public static final zzgiz zze;
    private final String zzf;

    static {
        zzgiz.zza = new zzgiz("SHA1");
        zzgiz.zzb = new zzgiz("SHA224");
        zzgiz.zzc = new zzgiz("SHA256");
        zzgiz.zzd = new zzgiz("SHA384");
        zzgiz.zze = new zzgiz("SHA512");
    }

    private zzgiz(String s) {
        this.zzf = s;
    }

    @Override
    public final String toString() {
        return this.zzf;
    }
}

