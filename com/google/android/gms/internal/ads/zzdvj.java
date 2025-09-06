package com.google.android.gms.internal.ads;

public final class zzdvj implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzdvj(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    public final zzdvi zza() {
        zzgzb.zzb(zzcan.zzb);
        zzgzb.zzb(zzcan.zza);
        zzdwq zzdwq0 = ((zzdvx)this.zzc).zza();
        zzgyn zzgyn0 = zzgys.zza(this.zzd);
        return new zzdvi(zzcan.zzb, zzcan.zza, zzdwq0, zzgyn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

