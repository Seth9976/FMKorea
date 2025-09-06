package com.google.android.gms.internal.ads;

public final class zzgic {
    public static final zzgic zza;
    public static final zzgic zzb;
    public static final zzgic zzc;
    public static final zzgic zzd;
    private final String zze;

    static {
        zzgic.zza = new zzgic("TINK");
        zzgic.zzb = new zzgic("CRUNCHY");
        zzgic.zzc = new zzgic("LEGACY");
        zzgic.zzd = new zzgic("NO_PREFIX");
    }

    private zzgic(String s) {
        this.zze = s;
    }

    @Override
    public final String toString() {
        return this.zze;
    }
}

