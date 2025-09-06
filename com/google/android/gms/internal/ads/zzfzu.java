package com.google.android.gms.internal.ads;

public final class zzfzu {
    public static final zzfzu zza;
    public static final zzfzu zzb;
    public static final zzfzu zzc;
    private final String zzd;

    static {
        zzfzu.zza = new zzfzu("ENABLED");
        zzfzu.zzb = new zzfzu("DISABLED");
        zzfzu.zzc = new zzfzu("DESTROYED");
    }

    private zzfzu(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

