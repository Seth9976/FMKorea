package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzckh implements zzdsq {
    private final Context zza;
    private final zzbjp zzb;
    private final zzciz zzc;
    private final zzckh zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;

    zzckh(zzciz zzciz0, Context context0, zzbjp zzbjp0, zzckg zzckg0) {
        this.zzd = this;
        this.zzc = zzciz0;
        this.zza = context0;
        this.zzb = zzbjp0;
        zzgyt zzgyt0 = zzgyu.zza(this);
        this.zze = zzgyt0;
        zzgyt zzgyt1 = zzgyu.zza(zzbjp0);
        this.zzf = zzgyt1;
        zzdsm zzdsm0 = new zzdsm(zzgyt1);
        this.zzg = zzdsm0;
        this.zzh = zzgys.zzc(new zzdso(zzgyt0, zzdsm0));
    }

    static Context zza(zzckh zzckh0) {
        return zzckh0.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsq
    public final zzdsh zzb() {
        return new zzckb(this.zzc, this.zzd, null);
    }

    static zzdsl zzc(zzckh zzckh0) {
        return zzdsm.zzc(zzckh0.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzdsq
    public final zzdsn zzd() {
        return (zzdsn)this.zzh.zzb();
    }
}

