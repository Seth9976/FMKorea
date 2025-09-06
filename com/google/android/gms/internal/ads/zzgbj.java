package com.google.android.gms.internal.ads;

public final class zzgbj {
    public static final zzgbj zza;
    public static final zzgbj zzb;
    public static final zzgbj zzc;
    public static final zzgbj zzd;
    public static final zzgbj zze;
    private final String zzf;

    static {
        zzgbj.zza = new zzgbj("SHA1");
        zzgbj.zzb = new zzgbj("SHA224");
        zzgbj.zzc = new zzgbj("SHA256");
        zzgbj.zzd = new zzgbj("SHA384");
        zzgbj.zze = new zzgbj("SHA512");
    }

    private zzgbj(String s) {
        this.zzf = s;
    }

    @Override
    public final String toString() {
        return this.zzf;
    }
}

