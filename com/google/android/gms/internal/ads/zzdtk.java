package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzdtk implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;

    public zzdtk(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6, zzgzg zzgzg7, zzgzg zzgzg8, zzgzg zzgzg9) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
        this.zzg = zzgzg6;
        this.zzh = zzgzg7;
        this.zzi = zzgzg8;
        this.zzj = zzgzg9;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object object0 = this.zza.zzb();
        Context context0 = ((zzchj)this.zzb).zza();
        WeakReference weakReference0 = ((zzchk)this.zzc).zza();
        zzgzb.zzb(zzcan.zza);
        Object object1 = this.zze.zzb();
        Object object2 = this.zzf.zzb();
        Object object3 = this.zzg.zzb();
        zzcag zzcag0 = ((zzchv)this.zzh).zza();
        zzdcz zzdcz0 = ((zzdda)this.zzi).zza();
        Object object4 = this.zzj.zzb();
        return new zzdtj(((Executor)object0), context0, weakReference0, zzcan.zza, ((zzdpc)object1), ((ScheduledExecutorService)object2), ((zzdrq)object3), zzcag0, zzdcz0, ((zzfhu)object4));
    }
}

