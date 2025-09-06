package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

final class zzciv extends zzety {
    private final zzetm zza;
    private final zzciz zzb;
    private final zzciv zzc;
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

    zzciv(zzciz zzciz0, zzetm zzetm0, zzciu zzciu0) {
        this.zzc = this;
        this.zzb = zzciz0;
        this.zza = zzetm0;
        this.zzd = zzgys.zzc(new zzfhs(zzciz.zzam(zzciz0)));
        zzetu zzetu0 = new zzetu(zzetm0);
        this.zze = zzetu0;
        zzgzg zzgzg0 = zzgys.zzc(zzdqg.zza());
        this.zzf = zzgzg0;
        zzgzg zzgzg1 = zzgys.zzc(zzdqe.zza());
        this.zzg = zzgzg1;
        zzgzg zzgzg2 = zzgys.zzc(zzdqi.zza());
        this.zzh = zzgzg2;
        zzgzg zzgzg3 = zzgys.zzc(zzdqk.zza());
        this.zzi = zzgzg3;
        zzgyw zzgyw0 = zzgyx.zzc(4);
        zzgyw0.zzb(zzffy.zze, zzgzg0);
        zzgyw0.zzb(zzffy.zzg, zzgzg1);
        zzgyw0.zzb(zzffy.zzi, zzgzg2);
        zzgyw0.zzb(zzffy.zzk, zzgzg3);
        zzgyx zzgyx0 = zzgyw0.zzc();
        this.zzj = zzgyx0;
        zzgzg zzgzg4 = zzgys.zzc(new zzdql(zzetu0, zzciz.zzal(zzciz0), zzfez.zza(), zzgyx0));
        this.zzk = zzgzg4;
        zzgzd zzgzd0 = zzgze.zza(0, 1);
        zzgzd0.zza(zzgzg4);
        zzgze zzgze0 = zzgzd0.zzc();
        this.zzl = zzgze0;
        zzfgh zzfgh0 = new zzfgh(zzgze0);
        this.zzm = zzfgh0;
        this.zzn = zzgys.zzc(new zzfgg(zzfez.zza(), zzciz.zzaA(zzciz0), zzfgh0));
    }

    @Override  // com.google.android.gms.internal.ads.zzety
    public final zzesm zza() {
        Context context0 = zzciz.zzE(this.zzb).zza();
        zzgzb.zzb(context0);
        zzfyo zzfyo0 = zzcan.zza;
        zzgzb.zzb(zzfyo0);
        zzbyx zzbyx0 = new zzbyx();
        zzgzb.zzb(zzfyo0);
        zzesj zzesj0 = zzevs.zza(new zzeuw(zzbyx0, zzfyo0, zzetn.zza(this.zza)), zzeql.zza(), ((ScheduledExecutorService)zzciz.zzaA(this.zzb).zzb()), 0);
        zzbsg zzbsg0 = new zzbsg();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)zzciz.zzaA(this.zzb).zzb();
        Context context1 = zzciz.zzE(this.zzb).zza();
        zzgzb.zzb(context1);
        zzesj zzesj1 = zzevs.zzb(new zzevg(zzbsg0, scheduledExecutorService0, context1), ((ScheduledExecutorService)zzciz.zzaA(this.zzb).zzb()));
        zzbza zzbza0 = new zzbza();
        Context context2 = zzciz.zzE(this.zzb).zza();
        zzgzb.zzb(context2);
        Object object0 = zzciz.zzaA(this.zzb).zzb();
        zzgzb.zzb(zzfyo0);
        zzesj zzesj2 = zzevt.zza(zzetg.zza(zzbza0, context2, ((ScheduledExecutorService)object0), zzfyo0, zzeto.zza(this.zza), zzetq.zza(this.zza), zzetr.zza(this.zza)), ((ScheduledExecutorService)zzciz.zzaA(this.zzb).zzb()));
        zzgzb.zzb(zzfyo0);
        zzesj zzesj3 = zzevs.zzc(new zzewb(zzfyo0), ((ScheduledExecutorService)zzciz.zzaA(this.zzb).zzb()));
        Context context3 = zzciz.zzE(this.zzb).zza();
        zzgzb.zzb(context3);
        String s = zzetn.zza(this.zza);
        zzgzb.zzb(zzfyo0);
        zzeua zzeua0 = new zzeua(null, context3, s, zzfyo0);
        zzawt zzawt0 = new zzawt();
        zzgzb.zzb(zzfyo0);
        Context context4 = zzciz.zzE(this.zzb).zza();
        zzgzb.zzb(context4);
        zzeup zzeup0 = new zzeup(zzawt0, zzfyo0, context4);
        zzbbc zzbbc0 = new zzbbc();
        zzgzb.zzb(zzfyo0);
        zzeva zzeva0 = new zzeva(zzbbc0, zzfyo0, zzetp.zza(this.zza));
        zzbza zzbza1 = new zzbza();
        zzgzb.zzb(zzfyo0);
        zzetk zzetk0 = new zzetk(zzbza1, zzfyo0, zzets.zza(this.zza), zzett.zza(this.zza), zzeto.zza(this.zza));
        zzbza zzbza2 = new zzbza();
        int v = zzeto.zza(this.zza);
        Context context5 = zzciz.zzE(this.zzb).zza();
        zzgzb.zzb(context5);
        Object object1 = zzciz.zzai(this.zzb).zzb();
        Object object2 = zzciz.zzaA(this.zzb).zzb();
        zzgzb.zzb(zzfyo0);
        zzeul zzeul0 = new zzeul(zzbza2, v, context5, ((zzbzj)object1), ((ScheduledExecutorService)object2), zzfyo0, zzetn.zza(this.zza));
        zzesj zzesj4 = (zzesj)zzciz.zzQ(this.zzb).zzb();
        String s1 = zzetn.zza(this.zza);
        zzawh zzawh0 = new zzawh();
        zzbzj zzbzj0 = (zzbzj)zzciz.zzai(this.zzb).zzb();
        ScheduledExecutorService scheduledExecutorService1 = (ScheduledExecutorService)zzciz.zzaA(this.zzb).zzb();
        zzgzb.zzb(zzfyo0);
        zzesj[] arr_zzesj = {zzeup0, zzeva0, zzetk0, zzeul0, zzesj4, zzeuh.zza(s1, zzawh0, zzbzj0, scheduledExecutorService1, zzfyo0)};
        return new zzesm(context0, zzfyo0, zzfui.zzp(zzesj0, zzesj1, zzesj2, zzesj3, zzevq.zza, zzeua0, arr_zzesj), ((zzfhr)this.zzd.zzb()), ((zzdrh)zzciz.zzS(this.zzb).zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzety
    public final zzfge zzb() {
        return (zzfge)this.zzn.zzb();
    }
}

