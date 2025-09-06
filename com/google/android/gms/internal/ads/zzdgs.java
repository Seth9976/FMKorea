package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzdgs implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;

    public zzdgs(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzchd zzchd0 = (zzchd)this.zza.zzb();
        zzcvq zzcvq0 = ((zzcwa)this.zzb).zza();
        zzdbv zzdbv0 = ((zzdco)this.zzc).zza();
        zzdgh zzdgh0 = ((zzdgj)this.zzd).zza();
        zzcyx zzcyx0 = ((zzcqb)this.zze).zza();
        zzehc zzehc0 = (zzehc)this.zzf.zzb();
        zzcqy zzcqy0 = zzchd0.zze();
        zzcqy0.zzi(zzcvq0.zzj());
        zzcqy0.zzf(zzdbv0);
        zzcqy0.zzd(zzdgh0);
        zzcqy0.zze(new zzejg(null));
        zzcqy0.zzg(new zzcrw(zzcyx0, null));
        zzcqy0.zzc(new zzcpz(null));
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdr)).booleanValue()) {
            zzcqy0.zzj(zzehj.zzb(zzehc0));
        }
        zzcsh zzcsh0 = zzcqy0.zzk().zzc();
        zzgzb.zzb(zzcsh0);
        return zzcsh0;
    }
}

