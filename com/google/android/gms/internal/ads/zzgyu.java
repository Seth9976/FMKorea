package com.google.android.gms.internal.ads;

public final class zzgyu implements zzgyn, zzgyt {
    private static final zzgyu zza;
    private final Object zzb;

    static {
        zzgyu.zza = new zzgyu(null);
    }

    private zzgyu(Object object0) {
        this.zzb = object0;
    }

    public static zzgyt zza(Object object0) {
        zzgzb.zza(object0, "instance cannot be null");
        return new zzgyu(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgyn, com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zzb;
    }

    public static zzgyt zzc(Object object0) {
        return object0 == null ? zzgyu.zza : new zzgyu(object0);
    }
}

