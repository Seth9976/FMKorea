package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdpl implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzdpl(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = ((zzchj)this.zza).zza();
        String s = ((zzdvw)this.zzb).zza();
        zzcag zzcag0 = ((zzchv)this.zzc).zza();
        zzaxo zzaxo0 = (zzaxo)this.zzd.zzb();
        String s1 = (String)this.zze.zzb();
        zzaxe zzaxe0 = new zzaxe(new zzaxk(context0));
        zzbad zzbad0 = zzbae.zza();
        zzbad0.zza(zzcag0.zzb);
        zzbad0.zzc(zzcag0.zzc);
        zzbad0.zzb((zzcag0.zzd ? 0 : 2));
        zzaxe0.zzb(new zzdpk(zzaxo0, s, ((zzbae)zzbad0.zzal()), s1));
        return zzaxe0;
    }
}

