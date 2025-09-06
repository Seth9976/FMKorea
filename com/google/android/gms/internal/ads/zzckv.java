package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzckv implements zzfay {
    private final zzciz zza;
    private final zzckv zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;

    zzckv(zzciz zzciz0, Context context0, String s, zzcku zzcku0) {
        this.zzb = this;
        this.zza = zzciz0;
        zzgyt zzgyt0 = zzgyu.zza(context0);
        this.zzc = zzgyt0;
        zzeyy zzeyy0 = new zzeyy(zzgyt0, zzciz0.zzaF, zzciz0.zzaG);
        this.zzd = zzeyy0;
        zzgzg zzgzg0 = zzgys.zzc(new zzfai(zzciz0.zzaF));
        this.zze = zzgzg0;
        zzgzg zzgzg1 = zzgys.zzc(zzfbx.zza());
        this.zzf = zzgzg1;
        zzgzg zzgzg2 = zzgys.zzc(new zzfas(zzgyt0, zzciz0.zzo, zzciz0.zzU, zzeyy0, zzgzg0, zzfcc.zza(), zzgzg1));
        this.zzg = zzgzg2;
        this.zzh = zzgys.zzc(new zzfbc(zzgzg2, zzgzg0, zzgzg1));
        zzgyt zzgyt1 = zzgyu.zzc(s);
        this.zzi = zzgyt1;
        this.zzj = zzgys.zzc(new zzfaw(zzgyt1, zzgzg2, zzgyt0, zzgzg0, zzgzg1, zzciz0.zzh, zzciz0.zzV, zzciz0.zzZ));
    }

    @Override  // com.google.android.gms.internal.ads.zzfay
    public final zzfav zza() {
        return (zzfav)this.zzj.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzfay
    public final zzfbb zzb() {
        return (zzfbb)this.zzh.zzb();
    }
}

