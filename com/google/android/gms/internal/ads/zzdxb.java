package com.google.android.gms.internal.ads;

public final class zzdxb implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdxb(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzdxa zza() {
        return new zzdxa(((zzchj)this.zza).zza(), ((zzbyf)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

