package com.google.android.gms.internal.ads;

public final class zzdyj implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdyj(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    public final zzdyi zza() {
        zzgzb.zzb(zzcan.zza);
        zzdyd zzdyd0 = ((zzdye)this.zzb).zza();
        zzfge zzfge0 = (zzfge)this.zzc.zzb();
        return new zzdyi(zzcan.zza, zzdyd0, zzfge0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

