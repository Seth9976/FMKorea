package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcjj implements zzewf {
    private final zzciz zza;
    private final zzcjj zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;

    zzcjj(zzciz zzciz0, Context context0, String s, zzcji zzcji0) {
        this.zzb = this;
        this.zza = zzciz0;
        zzgyt zzgyt0 = zzgyu.zza(context0);
        this.zzc = zzgyt0;
        zzgyt zzgyt1 = zzgyu.zza(s);
        this.zzd = zzgyt1;
        zzeyx zzeyx0 = new zzeyx(zzgyt0, zzciz0.zzaF, zzciz0.zzaG);
        this.zze = zzeyx0;
        zzgzg zzgzg0 = zzgys.zzc(new zzexd(zzciz0.zzaF));
        this.zzf = zzgzg0;
        zzgzg zzgzg1 = zzgys.zzc(new zzexf(zzgyt0, zzciz0.zzo, zzciz0.zzU, zzeyx0, zzgzg0, zzfcc.zza(), zzciz0.zzh));
        this.zzg = zzgzg1;
        this.zzh = zzgys.zzc(new zzexl(zzciz0.zzU, zzgyt0, zzgyt1, zzgzg1, zzgzg0, zzciz0.zzh, zzciz0.zzZ));
    }

    @Override  // com.google.android.gms.internal.ads.zzewf
    public final zzexk zza() {
        return (zzexk)this.zzh.zzb();
    }
}

