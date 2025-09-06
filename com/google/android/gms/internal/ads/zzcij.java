package com.google.android.gms.internal.ads;

final class zzcij implements zzdgl {
    private final zzciz zza;
    private zzeyz zzb;
    private zzeyc zzc;
    private zzdbv zzd;
    private zzcvs zze;
    private zzdgh zzf;
    private zzcpz zzg;

    zzcij(zzciz zzciz0, zzcii zzcii0) {
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

    @Override  // com.google.android.gms.internal.ads.zzdgl
    public final zzdgl zzc(zzcpz zzcpz0) {
        this.zzg = zzcpz0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgl
    public final zzdgl zzd(zzdgh zzdgh0) {
        this.zzf = zzdgh0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgl
    public final zzdgl zze(zzdbv zzdbv0) {
        this.zzd = zzdbv0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgl
    public final zzdgl zzf(zzcvs zzcvs0) {
        this.zze = zzcvs0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgl
    public final zzdgm zzg() {
        zzgzb.zzc(this.zzd, zzdbv.class);
        zzgzb.zzc(this.zze, zzcvs.class);
        zzgzb.zzc(this.zzf, zzdgh.class);
        zzgzb.zzc(this.zzg, zzcpz.class);
        zzcpz zzcpz0 = this.zzg;
        zzdgh zzdgh0 = this.zzf;
        zzctn zzctn0 = new zzctn();
        zzfdf zzfdf0 = new zzfdf();
        zzcuy zzcuy0 = new zzcuy();
        zzdru zzdru0 = new zzdru();
        zzdbv zzdbv0 = this.zzd;
        zzcvs zzcvs0 = this.zze;
        zzehj zzehj0 = zzehl.zza();
        return new zzcil(this.zza, zzcpz0, zzdgh0, zzctn0, zzfdf0, zzcuy0, zzdru0, zzdbv0, zzcvs0, zzehj0, null, this.zzb, this.zzc, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvo
    public final Object zzh() {
        return this.zzg();
    }
}

