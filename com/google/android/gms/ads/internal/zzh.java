package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfmf;

final class zzh implements zzfmf {
    final zzi zza;

    zzh(zzi zzi0) {
        this.zza = zzi0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfmf
    public final void zza(int v, long v1) {
        zzi.zza(this.zza).zzd(v, System.currentTimeMillis() - v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfmf
    public final void zzb(int v, long v1, String s) {
        zzi.zza(this.zza).zze(v, System.currentTimeMillis() - v1, s);
    }
}

