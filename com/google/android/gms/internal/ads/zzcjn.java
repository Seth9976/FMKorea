package com.google.android.gms.internal.ads;

final class zzcjn implements zzcqy {
    private final zzciz zza;
    private zzeyz zzb;
    private zzeyc zzc;
    private zzdbv zzd;
    private zzcvs zze;
    private zzejg zzf;
    private zzcrw zzg;
    private zzehj zzh;
    private zzcpz zzi;
    private zzdgh zzj;

    zzcjn(zzciz zzciz0, zzcjm zzcjm0) {
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

    @Override  // com.google.android.gms.internal.ads.zzcqy
    public final zzcqy zzc(zzcpz zzcpz0) {
        this.zzi = zzcpz0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqy
    public final zzcqy zzd(zzdgh zzdgh0) {
        this.zzj = zzdgh0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqy
    public final zzcqy zze(zzejg zzejg0) {
        this.zzf = zzejg0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqy
    public final zzcqy zzf(zzdbv zzdbv0) {
        this.zzd = zzdbv0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqy
    public final zzcqy zzg(zzcrw zzcrw0) {
        this.zzg = zzcrw0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvo
    public final Object zzh() {
        return this.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzcqy
    public final zzcqy zzi(zzcvs zzcvs0) {
        this.zze = zzcvs0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqy
    public final zzcqy zzj(zzehj zzehj0) {
        this.zzh = zzehj0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqy
    public final zzcqz zzk() {
        zzgzb.zzc(this.zzd, zzdbv.class);
        zzgzb.zzc(this.zze, zzcvs.class);
        zzgzb.zzc(this.zzf, zzejg.class);
        zzgzb.zzc(this.zzg, zzcrw.class);
        if(this.zzh == null) {
            this.zzh = zzehl.zza();
        }
        zzgzb.zzc(this.zzi, zzcpz.class);
        zzgzb.zzc(this.zzj, zzdgh.class);
        zzcpz zzcpz0 = this.zzi;
        zzdgh zzdgh0 = this.zzj;
        zzctn zzctn0 = new zzctn();
        zzfdf zzfdf0 = new zzfdf();
        zzcuy zzcuy0 = new zzcuy();
        zzdru zzdru0 = new zzdru();
        return new zzcjp(this.zza, zzcpz0, zzdgh0, zzctn0, zzfdf0, zzcuy0, zzdru0, this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc, null);
    }
}

