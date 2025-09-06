package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class zzcqg implements zzgyt {
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

    public zzcqg(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6, zzgzg zzgzg7, zzgzg zzgzg8, zzgzg zzgzg9) {
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

    public final zzcqf zza() {
        return new zzcqf(((zzcud)this.zza).zza(), ((Context)this.zzb.zzb()), ((zzcqm)this.zzc).zza(), ((zzcql)this.zzd).zza(), ((zzcqx)this.zze).zza(), ((zzcqn)this.zzf).zza(), ((zzdgk)this.zzg).zza(), ((zzddy)this.zzh.zzb()), zzgys.zza(this.zzi), ((Executor)this.zzj.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }

    public static zzcqf zzc(zzcsd zzcsd0, Context context0, zzfbf zzfbf0, View view0, zzcfi zzcfi0, zzcsc zzcsc0, zzdin zzdin0, zzddy zzddy0, zzgyn zzgyn0, Executor executor0) {
        return new zzcqf(zzcsd0, context0, zzfbf0, view0, zzcfi0, zzcsc0, zzdin0, zzddy0, zzgyn0, executor0);
    }
}

