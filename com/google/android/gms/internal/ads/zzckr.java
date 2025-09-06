package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

final class zzckr implements zzezk {
    private final zzciz zza;
    private final zzckr zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;

    zzckr(zzciz zzciz0, Context context0, String s, zzq zzq0, zzckq zzckq0) {
        this.zzb = this;
        this.zza = zzciz0;
        zzgyt zzgyt0 = zzgyu.zza(context0);
        this.zzc = zzgyt0;
        zzgyt zzgyt1 = zzgyu.zza(zzq0);
        this.zzd = zzgyt1;
        zzgyt zzgyt2 = zzgyu.zza(s);
        this.zze = zzgyt2;
        zzgzg zzgzg0 = zzgys.zzc(new zzeky(zzciz0.zzn));
        this.zzf = zzgzg0;
        zzgzg zzgzg1 = zzgys.zzc(new zzfai(zzciz0.zzaF));
        this.zzg = zzgzg1;
        zzgzg zzgzg2 = zzgys.zzc(new zzezi(zzgyt0, zzciz0.zzo, zzciz0.zzU, zzgzg0, zzgzg1, zzfcc.zza()));
        this.zzh = zzgzg2;
        this.zzi = zzgys.zzc(new zzelg(zzgyt0, zzgyt1, zzgyt2, zzgzg2, zzgzg0, zzgzg1, zzciz0.zzh, zzciz0.zzV, zzciz0.zzZ));
    }

    @Override  // com.google.android.gms.internal.ads.zzezk
    public final zzelf zza() {
        return (zzelf)this.zzi.zzb();
    }
}

