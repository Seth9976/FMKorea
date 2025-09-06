package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

final class zzewj implements zzfya {
    final zzelm zza;
    final zzfhr zzb;
    final zzfhg zzc;
    final zzewl zzd;
    final zzewm zze;

    zzewj(zzewm zzewm0, zzelm zzelm0, zzfhr zzfhr0, zzfhg zzfhg0, zzewl zzewl0) {
        this.zze = zzewm0;
        this.zza = zzelm0;
        this.zzb = zzfhr0;
        this.zzc = zzfhg0;
        this.zzd = zzewl0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzcpm zzcpm0 = (zzcpm)zzewm.zzg(this.zze).zzd();
        zze zze0 = zzcpm0 == null ? zzfdb.zzb(throwable0, null) : zzcpm0.zzb().zza(throwable0);
        synchronized(this.zze) {
            zzewm.zzj(this.zze, null);
            if(zzcpm0 == null) {
                zzewm.zzf(this.zze).zzbF(zze0);
                ((zzcvp)zzewm.zzd(this.zze, this.zzd).zzh()).zzb().zzc().zzh();
            }
            else {
                zzcpm0.zzc().zzbF(zze0);
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
                    zzewm.zzi(this.zze).execute(new zzewi(this, zze0));
                }
            }
            zzfcv.zzb(zze0.zza, throwable0, "AppOpenAdLoader.onFailure");
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
            zzewm.zzh(this.zze).zzb(this.zzc.zzl());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        synchronized(this.zze) {
            zzewm.zzj(this.zze, null);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
                ((zzcse)object0).zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(((zzcse)object0));
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
                goto label_16;
            }
            else {
            label_16:
                this.zzc.zzb(((zzcse)object0).zzp().zzb);
                this.zzc.zzd(((zzcse)object0).zzl().zzg());
                this.zzc.zzf(true);
                zzfhk zzfhk0 = this.zzc.zzl();
                this.zze.zzh.zzb(zzfhk0);
            }
        }
    }
}

