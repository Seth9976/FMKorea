package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdxt implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;

    public zzdxt(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
    }

    public final zzdxs zza() {
        zzgzb.zzb(zzcan.zza);
        zzdwy zzdwy0 = ((zzdwz)this.zzb).zza();
        zzgyn zzgyn0 = zzgys.zza(this.zzc);
        Object object0 = this.zzd.zzb();
        Context context0 = ((zzchj)this.zze).zza();
        zzcag zzcag0 = ((zzchv)this.zzf).zza();
        return new zzdxs(zzcan.zza, zzdwy0, zzgyn0, ((zzfhu)object0), context0, zzcag0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

