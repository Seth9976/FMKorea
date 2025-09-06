package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzetg implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;

    public zzetg(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
        this.zzg = zzgzg6;
    }

    public static zzete zza(zzbza zzbza0, Context context0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, int v, boolean z, boolean z1) {
        return new zzete(zzbza0, context0, scheduledExecutorService0, executor0, v, z, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzbza zzbza0 = new zzbza();
        Context context0 = ((zzchj)this.zzb).zza();
        Object object0 = this.zzc.zzb();
        zzgzb.zzb(zzcan.zza);
        int v = (int)((zzevl)this.zze).zza();
        boolean z = ((zzevm)this.zzf).zza().booleanValue();
        boolean z1 = ((zzevo)this.zzg).zza().booleanValue();
        return new zzete(zzbza0, context0, ((ScheduledExecutorService)object0), zzcan.zza, v, z, z1);
    }
}

