package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class zzdwj implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;

    public zzdwj(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
        this.zzg = zzgzg6;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = ((zzchj)this.zza).zza();
        zzfca zzfca0 = ((zzcvz)this.zzb).zza();
        zzdvi zzdvi0 = ((zzdvj)this.zzc).zza();
        zzgzb.zzb(zzcan.zza);
        Object object0 = this.zze.zzb();
        Object object1 = this.zzf.zzb();
        Object object2 = this.zzg.zzb();
        return new zzdwi(context0, zzfca0, zzdvi0, zzcan.zza, ((ScheduledExecutorService)object0), ((zzebe)object1), ((zzfhr)object2));
    }
}

