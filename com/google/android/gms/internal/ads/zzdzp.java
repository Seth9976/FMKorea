package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

public final class zzdzp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;

    public zzdzp(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6, zzgzg zzgzg7) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
        this.zzg = zzgzg6;
        this.zzh = zzgzg7;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = ((zzchj)this.zza).zza();
        zzgzb.zzb(zzcan.zza);
        zzbuz zzbuz0 = new zzbuz();
        zzcmp zzcmp0 = ((zzchs)this.zzd).zza();
        zzeag zzeag0 = ((zzeah)this.zze).zza();
        Object object0 = this.zzf.zzb();
        zzead zzead0 = new zzead();
        Object object1 = this.zzh.zzb();
        return new zzdzo(context0, zzcan.zza, zzbuz0, zzcmp0, zzeag0, ((ArrayDeque)object0), zzead0, ((zzfhu)object1));
    }
}

