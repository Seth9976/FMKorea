package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdkc implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzdkc(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzdic zzdic0 = ((zzdiv)this.zza).zza();
        zzdih zzdih0 = ((zzdhe)this.zzb).zza();
        Executor executor0 = (Executor)this.zzc.zzb();
        zzgzb.zzb(zzcan.zza);
        return new zzdkb(zzdic0, zzdih0, executor0, zzcan.zza);
    }
}

