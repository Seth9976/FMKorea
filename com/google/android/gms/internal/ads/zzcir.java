package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

final class zzcir extends zzetw {
    private final zzevc zza;
    private final zzciz zzb;
    private final zzcir zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;
    private final zzgzg zzl;
    private final zzgzg zzm;
    private final zzgzg zzn;

    zzcir(zzciz zzciz0, zzevc zzevc0, zzciq zzciq0) {
        this.zzc = this;
        this.zzb = zzciz0;
        this.zza = zzevc0;
        zzeve zzeve0 = new zzeve(zzevc0);
        this.zzd = zzeve0;
        zzgzg zzgzg0 = zzgys.zzc(zzdqg.zza());
        this.zze = zzgzg0;
        zzgzg zzgzg1 = zzgys.zzc(zzdqe.zza());
        this.zzf = zzgzg1;
        zzgzg zzgzg2 = zzgys.zzc(zzdqi.zza());
        this.zzg = zzgzg2;
        zzgzg zzgzg3 = zzgys.zzc(zzdqk.zza());
        this.zzh = zzgzg3;
        zzgyw zzgyw0 = zzgyx.zzc(4);
        zzgyw0.zzb(zzffy.zze, zzgzg0);
        zzgyw0.zzb(zzffy.zzg, zzgzg1);
        zzgyw0.zzb(zzffy.zzi, zzgzg2);
        zzgyw0.zzb(zzffy.zzk, zzgzg3);
        zzgyx zzgyx0 = zzgyw0.zzc();
        this.zzi = zzgyx0;
        zzgzg zzgzg4 = zzgys.zzc(new zzdql(zzeve0, zzciz.zzal(zzciz0), zzfez.zza(), zzgyx0));
        this.zzj = zzgzg4;
        zzgzd zzgzd0 = zzgze.zza(0, 1);
        zzgzd0.zza(zzgzg4);
        zzgze zzgze0 = zzgzd0.zzc();
        this.zzk = zzgze0;
        zzfgh zzfgh0 = new zzfgh(zzgze0);
        this.zzl = zzfgh0;
        this.zzm = zzgys.zzc(new zzfgg(zzfez.zza(), zzciz.zzaA(zzciz0), zzfgh0));
        this.zzn = zzgys.zzc(new zzfhs(zzciz.zzam(zzciz0)));
    }

    @Override  // com.google.android.gms.internal.ads.zzetw
    public final zzesm zza() {
        Context context0 = zzciz.zzE(this.zzb).zza();
        zzgzb.zzb(context0);
        zzbyx zzbyx0 = new zzbyx();
        zzgzb.zzb(zzcan.zza);
        String s = zzevd.zza(this.zza);
        zzeuw zzeuw0 = new zzeuw(zzbyx0, zzcan.zza, s);
        zzgzb.zzb(zzcan.zza);
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)zzciz.zzaA(this.zzb).zzb();
        Object object0 = this.zzn.zzb();
        Object object1 = zzciz.zzS(this.zzb).zzb();
        HashSet hashSet0 = new HashSet();
        hashSet0.add(new zzeqr(zzeuw0, 0L, scheduledExecutorService0));
        return new zzesm(context0, zzcan.zza, hashSet0, ((zzfhr)object0), ((zzdrh)object1));
    }

    @Override  // com.google.android.gms.internal.ads.zzetw
    public final zzfge zzb() {
        return (zzfge)this.zzm.zzb();
    }
}

