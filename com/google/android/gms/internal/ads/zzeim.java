package com.google.android.gms.internal.ads;

public final class zzeim implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzeim(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzeil zza() {
        return new zzeil(((zzejp)this.zza.zzb()), ((zzdpc)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

