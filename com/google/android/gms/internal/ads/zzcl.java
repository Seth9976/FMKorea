package com.google.android.gms.internal.ads;

public final class zzcl {
    public static final zzcl zza;
    public static final zzn zzb;
    private static final String zzc;
    private final zzah zzd;

    static {
        zzcl.zza = new zzcj().zze();
        zzcl.zzc = "0";
        zzcl.zzb = zzci.zza;
    }

    zzcl(zzah zzah0, zzck zzck0) {
        this.zzd = zzah0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzcl ? this.zzd.equals(((zzcl)object0).zzd) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzd.hashCode();
    }

    static zzah zza(zzcl zzcl0) {
        return zzcl0.zzd;
    }
}

