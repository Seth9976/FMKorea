package com.google.android.gms.internal.ads;

public final class zzcrw {
    private final zzcyx zza;
    private final zzdbe zzb;

    public zzcrw(zzcyx zzcyx0, zzdbe zzdbe0) {
        this.zza = zzcyx0;
        this.zzb = zzdbe0;
    }

    public final zzcyx zza() {
        return this.zza;
    }

    final zzdbe zzb() {
        return this.zzb;
    }

    final zzddo zzc() {
        return this.zzb == null ? new zzddo(new zzcrv(this), zzcan.zzf) : new zzddo(this.zzb, zzcan.zzf);
    }
}

