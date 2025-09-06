package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

final class zzezg implements zzfya {
    final zzelm zza;
    final zzfhr zzb;
    final zzfhg zzc;
    final zzdfq zzd;
    final zzezh zze;

    zzezg(zzezh zzezh0, zzelm zzelm0, zzfhr zzfhr0, zzfhg zzfhg0, zzdfq zzdfq0) {
        this.zze = zzezh0;
        this.zza = zzelm0;
        this.zzb = zzfhr0;
        this.zzc = zzfhg0;
        this.zzd = zzdfq0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zze zze0 = this.zzd.zza().zza(throwable0);
        synchronized(this.zze) {
            zzezh.zzg(this.zze, null);
            this.zzd.zzb().zzbF(zze0);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzhQ)).booleanValue()) {
                zzezh.zzf(this.zze).execute(new zzeze(this, zze0));
                zzezh.zzf(this.zze).execute(new zzezf(this, zze0));
            }
            zzfcv.zzb(zze0.zza, throwable0, "InterstitialAdLoader.onFailure");
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
            zzezh.zze(this.zze).zzb(this.zzc.zzl());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        synchronized(this.zze) {
            zzezh.zzg(this.zze, null);
            zzbbj zzbbj0 = zzbbr.zzhQ;
            if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue()) {
                zzdan zzdan0 = ((zzdep)object0).zzn();
                zzdan0.zza(this.zze.zzd);
                zzdan0.zzd(this.zze.zze);
            }
            this.zza.zzb(((zzdep)object0));
            if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue()) {
                zzezc zzezc0 = new zzezc(this);
                this.zze.zzb.execute(zzezc0);
                zzezd zzezd0 = new zzezd(this);
                this.zze.zzb.execute(zzezd0);
            }
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                zzfhr zzfhr0 = this.zzb;
                if(zzfhr0 != null) {
                    zzfhr0.zzf(((zzdep)object0).zzp().zzb);
                    zzfhr0.zze(((zzdep)object0).zzl().zzg());
                    this.zzc.zzf(true);
                    zzfhr0.zza(this.zzc);
                    zzfhr0.zzg();
                    return;
                }
                goto label_24;
            }
            else {
            label_24:
                this.zzc.zzb(((zzdep)object0).zzp().zzb);
                this.zzc.zzd(((zzdep)object0).zzl().zzg());
                this.zzc.zzf(true);
                zzfhk zzfhk0 = this.zzc.zzl();
                this.zze.zzg.zzb(zzfhk0);
            }
        }
    }
}

