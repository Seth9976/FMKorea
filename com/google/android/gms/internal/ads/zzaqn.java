package com.google.android.gms.internal.ads;

final class zzaqn implements zzfmf {
    final zzflc zza;

    zzaqn(zzflc zzflc0) {
        this.zza = zzflc0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfmf
    public final void zza(int v, long v1) {
        this.zza.zzd(v, System.currentTimeMillis() - v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfmf
    public final void zzb(int v, long v1, String s) {
        this.zza.zze(v, System.currentTimeMillis() - v1, s);
    }
}

