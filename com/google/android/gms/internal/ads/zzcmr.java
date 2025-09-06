package com.google.android.gms.internal.ads;

public final class zzcmr implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzcmr(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzcmq zza() {
        return new zzcmq(((zzgyx)this.zza).zzd(), ((zzgyx)this.zzb).zzd());
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

