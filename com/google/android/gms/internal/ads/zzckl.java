package com.google.android.gms.internal.ads;

final class zzckl implements zzdfp {
    private final zzciz zza;
    private zzeyz zzb;
    private zzeyc zzc;
    private zzdbv zzd;
    private zzcvs zze;
    private zzejg zzf;

    zzckl(zzciz zzciz0, zzckk zzckk0) {
        this.zza = zzciz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvo
    public final zzcvo zza(zzeyc zzeyc0) {
        this.zzc = zzeyc0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvo
    public final zzcvo zzb(zzeyz zzeyz0) {
        this.zzb = zzeyz0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfp
    public final zzdfp zzc(zzejg zzejg0) {
        this.zzf = zzejg0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfp
    public final zzdfp zzd(zzdbv zzdbv0) {
        this.zzd = zzdbv0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfp
    public final zzdfp zze(zzcvs zzcvs0) {
        this.zze = zzcvs0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfp
    public final zzdfq zzf() {
        zzgzb.zzc(this.zzd, zzdbv.class);
        zzgzb.zzc(this.zze, zzcvs.class);
        zzgzb.zzc(this.zzf, zzejg.class);
        zzctn zzctn0 = new zzctn();
        zzfdf zzfdf0 = new zzfdf();
        zzcuy zzcuy0 = new zzcuy();
        zzdru zzdru0 = new zzdru();
        zzdbv zzdbv0 = this.zzd;
        zzcvs zzcvs0 = this.zze;
        zzehj zzehj0 = zzehl.zza();
        return new zzckn(this.zza, zzctn0, zzfdf0, zzcuy0, zzdru0, zzdbv0, zzcvs0, zzehj0, this.zzf, null, this.zzb, this.zzc, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvo
    public final Object zzh() {
        return this.zzf();
    }
}

