package com.google.android.gms.internal.ads;

public final class zzgdm {
    public static final zzgdm zza;
    public static final zzgdm zzb;
    public static final zzgdm zzc;
    private final String zzd;

    static {
        zzgdm.zza = new zzgdm("TINK");
        zzgdm.zzb = new zzgdm("CRUNCHY");
        zzgdm.zzc = new zzgdm("NO_PREFIX");
    }

    private zzgdm(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

