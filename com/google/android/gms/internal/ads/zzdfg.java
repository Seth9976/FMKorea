package com.google.android.gms.internal.ads;

public final class zzdfg implements zzgyt {
    private final zzdet zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdfg(zzdet zzdet0, zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzdet0;
        this.zzb = zzgzg0;
        this.zzc = zzgzg1;
    }

    public final zzbxn zza() {
        return new zzbxn(((zzchj)this.zzb).zza(), ((zzcvz)this.zzc).zza().zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

