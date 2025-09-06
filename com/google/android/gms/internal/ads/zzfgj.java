package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzfgj implements zzgyt {
    private final zzfgi zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzfgj(zzfgi zzfgi0, zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzfgi0;
        this.zzb = zzgzg0;
        this.zzc = zzgzg1;
        this.zzd = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = ((zzchj)this.zzb).zza();
        zzcag zzcag0 = ((zzchv)this.zzc).zza();
        zzfhu zzfhu0 = (zzfhu)this.zzd.zzb();
        zzbni zzbni0 = new zzbmz().zza(context0, zzcag0, zzfhu0);
        zzgzb.zzb(zzbni0);
        return zzbni0;
    }
}

