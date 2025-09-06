package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

final class zzelt implements zzfya {
    final zzelm zza;
    final zzfhr zzb;
    final zzfhg zzc;
    final zzdgm zzd;
    final zzelu zze;

    zzelt(zzelu zzelu0, zzelm zzelm0, zzfhr zzfhr0, zzfhg zzfhg0, zzdgm zzdgm0) {
        this.zze = zzelu0;
        this.zza = zzelm0;
        this.zzb = zzfhr0;
        this.zzc = zzfhg0;
        this.zzd = zzdgm0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zze zze0 = this.zzd.zza().zza(throwable0);
        this.zzd.zzb().zzbF(zze0);
        zzelu.zzc(this.zze).zzB().execute(new zzels(this, zze0));
        zzfcv.zzb(zze0.zza, throwable0, "NativeAdLoader.onFailure");
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
        zzelu.zze(this.zze).zzb(this.zzc.zzl());
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        synchronized(this.zze) {
            ((zzcse)object0).zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(((zzcse)object0));
            this.zze.zzb.zzB().execute(new zzelr(this));
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                zzfhr zzfhr0 = this.zzb;
                if(zzfhr0 != null) {
                    zzfhr0.zzf(((zzcse)object0).zzp().zzb);
                    zzfhr0.zze(((zzcse)object0).zzl().zzg());
                    this.zzc.zzf(true);
                    zzfhr0.zza(this.zzc);
                    zzfhr0.zzg();
                    return;
                }
                goto label_15;
            }
            else {
            label_15:
                this.zzc.zzb(((zzcse)object0).zzp().zzb);
                this.zzc.zzd(((zzcse)object0).zzl().zzg());
                this.zzc.zzf(true);
                zzfhk zzfhk0 = this.zzc.zzl();
                this.zze.zze.zzb(zzfhk0);
            }
        }
    }
}

