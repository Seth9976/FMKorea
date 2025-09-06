package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzefv implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzefv(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = (Context)this.zza.zzb();
        zzcag zzcag0 = ((zzchv)this.zzb).zza();
        zzdfq zzdfq0 = (zzdfq)this.zzc.zzb();
        zzgzb.zzb(zzcan.zza);
        return new zzefu(context0, zzcag0, zzdfq0, zzcan.zza);
    }
}

