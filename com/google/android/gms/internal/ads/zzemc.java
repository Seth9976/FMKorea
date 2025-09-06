package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

public final class zzemc implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzemc(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object object0 = this.zza.zzb();
        zzgzb.zzb(zzcan.zza);
        Context context0 = ((zzchj)this.zzc).zza();
        zzfca zzfca0 = ((zzcvz)this.zzd).zza();
        ViewGroup viewGroup0 = ((zzcqa)this.zze).zza();
        return new zzema(((zzfyo)object0), zzcan.zza, context0, zzfca0, viewGroup0);
    }
}

