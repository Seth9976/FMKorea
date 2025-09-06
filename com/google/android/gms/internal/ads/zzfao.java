package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

final class zzfao implements zzfya {
    final zzelm zza;
    final zzfhr zzb;
    final zzfhg zzc;
    final zzfaq zzd;
    final zzfar zze;

    zzfao(zzfar zzfar0, zzelm zzelm0, zzfhr zzfhr0, zzfhg zzfhg0, zzfaq zzfaq0) {
        this.zze = zzfar0;
        this.zza = zzelm0;
        this.zzb = zzfhr0;
        this.zzc = zzfhg0;
        this.zzd = zzfaq0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzdnv zzdnv0 = (zzdnv)zzfar.zze(this.zze).zzd();
        zze zze0 = zzdnv0 == null ? zzfdb.zzb(throwable0, null) : zzdnv0.zzb().zza(throwable0);
        synchronized(this.zze) {
            if(zzdnv0 == null) {
                zzfar.zzf(this.zze).zzbF(zze0);
                zzfar.zzd(this.zze, this.zzd).zze().zzb().zzc().zzh();
            }
            else {
                zzdnv0.zza().zzbF(zze0);
                zzfar.zzh(this.zze).execute(new zzfan(this, zze0));
            }
            zzfcv.zzb(zze0.zza, throwable0, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                zzfhr zzfhr0 = this.zzb;
                if(zzfhr0 != null) {
                    zzfhr0.zzc(zze0);
                    this.zzc.zzg(throwable0);
                    this.zzc.zzf(false);
                    zzfhr0.zza(this.zzc);
                    zzfhr0.zzg();
                    return;
                }
            }
            this.zzc.zza(zze0);
            this.zzc.zzg(throwable0);
            this.zzc.zzf(false);
            zzfar.zzg(this.zze).zzb(this.zzc.zzl());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        synchronized(this.zze) {
            ((zzdnq)object0).zzn().zzd(this.zze.zzd);
            this.zza.zzb(((zzdnq)object0));
            zzfah zzfah0 = this.zze.zzd;
            zzfah0.getClass();
            this.zze.zzb.execute(new zzfam(zzfah0));
            this.zze.zzd.onAdMetadataChanged();
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                zzfhr zzfhr0 = this.zzb;
                if(zzfhr0 != null) {
                    zzfhr0.zzf(((zzdnq)object0).zzp().zzb);
                    zzfhr0.zze(((zzdnq)object0).zzl().zzg());
                    this.zzc.zzf(true);
                    zzfhr0.zza(this.zzc);
                    zzfhr0.zzg();
                    return;
                }
            }
            this.zzc.zzb(((zzdnq)object0).zzp().zzb);
            this.zzc.zzd(((zzdnq)object0).zzl().zzg());
            this.zzc.zzf(true);
            this.zze.zzg.zzb(this.zzc.zzl());
        }
    }
}

