package com.google.android.gms.internal.ads;

public final class zzebj implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzebj(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzebi zza() {
        return new zzebi(((zzebb)this.zza).zza(), ((zzchh)this.zzb).zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

