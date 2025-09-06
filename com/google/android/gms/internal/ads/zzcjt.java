package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

final class zzcjt implements zzext {
    private final Context zza;
    private final zzq zzb;
    private final String zzc;
    private final zzciz zzd;
    private final zzcjt zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;

    zzcjt(zzciz zzciz0, Context context0, String s, zzq zzq0, zzcjs zzcjs0) {
        this.zze = this;
        this.zzd = zzciz0;
        this.zza = context0;
        this.zzb = zzq0;
        this.zzc = s;
        zzgyt zzgyt0 = zzgyu.zza(context0);
        this.zzf = zzgyt0;
        zzgyt zzgyt1 = zzgyu.zza(zzq0);
        this.zzg = zzgyt1;
        zzgzg zzgzg0 = zzgys.zzc(new zzeky(zzciz0.zzn));
        this.zzh = zzgzg0;
        zzgzg zzgzg1 = zzgys.zzc(zzeld.zza());
        this.zzi = zzgzg1;
        zzgzg zzgzg2 = zzgys.zzc(zzdbg.zza());
        this.zzj = zzgzg2;
        this.zzk = zzgys.zzc(new zzexr(zzgyt0, zzciz0.zzo, zzgyt1, zzciz0.zzU, zzgzg0, zzgzg1, zzfcc.zza(), zzgzg2));
    }

    @Override  // com.google.android.gms.internal.ads.zzext
    public final zzekd zza() {
        Object object0 = this.zzk.zzb();
        Object object1 = this.zzh.zzb();
        zzcag zzcag0 = this.zzd.zza.zzd();
        zzgzb.zzb(zzcag0);
        Object object2 = this.zzd.zzZ.zzb();
        return new zzekd(this.zza, this.zzb, this.zzc, ((zzexq)object0), ((zzekx)object1), zzcag0, ((zzdrh)object2));
    }
}

