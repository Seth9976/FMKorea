package com.google.android.gms.internal.ads;

public enum zzgva {
    DOUBLE(zzgvb.zzd, 1),
    FLOAT(zzgvb.zzc, 5),
    INT64(zzgvb.zzb, 0),
    UINT64(zzgvb.zzb, 0),
    INT32(zzgvb.zza, 0),
    FIXED64(zzgvb.zzb, 1),
    FIXED32(zzgvb.zza, 5),
    BOOL(zzgvb.zze, 0),
    STRING(zzgvb.zzf, 2),
    GROUP(zzgvb.zzi, 3),
    MESSAGE(zzgvb.zzi, 2),
    BYTES(zzgvb.zzg, 2),
    UINT32(zzgvb.zza, 0),
    ENUM(zzgvb.zzh, 0),
    SFIXED32(zzgvb.zza, 5),
    SFIXED64(zzgvb.zzb, 1),
    SINT32(zzgvb.zza, 0),
    SINT64(zzgvb.zzb, 0);

    private final zzgvb zzt;

    private zzgva(zzgvb zzgvb0, int v1) {
        this.zzt = zzgvb0;
    }

    public final zzgvb zza() {
        return this.zzt;
    }
}

