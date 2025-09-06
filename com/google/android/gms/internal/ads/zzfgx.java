package com.google.android.gms.internal.ads;

public final class zzfgx implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzfgx(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzfgw zza() {
        return new zzfgw(((zzchj)this.zza).zza(), ((zzchv)this.zzb).zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

