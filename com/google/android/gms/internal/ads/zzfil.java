package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfil implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzfil(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = ((zzchj)this.zza).zza();
        zzgzb.zzb(zzcan.zza);
        zzcaf zzcaf0 = (zzcaf)this.zzc.zzb();
        zzfhu zzfhu0 = (zzfhu)this.zzd.zzb();
        return new zzfik(context0, zzcan.zza, zzcaf0, zzfhu0);
    }
}

