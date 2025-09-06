package com.google.android.gms.internal.ads;

public final class zzebb implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzebb(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzeba zza() {
        return new zzeba(((zzeax)this.zza).zza(), ((zzfyo)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

