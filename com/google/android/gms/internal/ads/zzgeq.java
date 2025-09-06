package com.google.android.gms.internal.ads;

public final class zzgeq {
    public static final zzgeq zza;
    public static final zzgeq zzb;
    public static final zzgeq zzc;
    private final String zzd;

    static {
        zzgeq.zza = new zzgeq("TINK");
        zzgeq.zzb = new zzgeq("CRUNCHY");
        zzgeq.zzc = new zzgeq("NO_PREFIX");
    }

    private zzgeq(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

