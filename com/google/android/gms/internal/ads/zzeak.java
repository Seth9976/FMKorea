package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzeak implements zzcwl, zzcxw, zzczd {
    private final zzfgn zza;
    private final zzfgo zzb;
    private final zzbzn zzc;

    public zzeak(zzfgn zzfgn0, zzfgo zzfgo0, zzbzn zzbzn0) {
        this.zza = zzfgn0;
        this.zzb = zzfgo0;
        this.zzc = zzbzn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        this.zza.zza("action", "ftl");
        this.zza.zza("ftl", String.valueOf(zze0.zza));
        this.zza.zza("ed", zze0.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
        this.zza.zzi(zzbun0.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
        this.zza.zzh(zzfbr0, this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        this.zza.zza("action", "loaded");
        this.zzb.zzb(this.zza);
    }
}

