package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

final class zzexp implements zzfya {
    final zzelm zza;
    final zzfhr zzb;
    final zzfhg zzc;
    final zzcqz zzd;
    final zzexq zze;

    zzexp(zzexq zzexq0, zzelm zzelm0, zzfhr zzfhr0, zzfhg zzfhg0, zzcqz zzcqz0) {
        this.zze = zzexq0;
        this.zza = zzelm0;
        this.zzb = zzfhr0;
        this.zzc = zzfhg0;
        this.zzd = zzcqz0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zze zze0 = this.zzd.zzd().zza(throwable0);
        synchronized(this.zze) {
            zzexq.zzl(this.zze, null);
            this.zzd.zzf().zzbF(zze0);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzhO)).booleanValue()) {
                zzexq.zzk(this.zze).execute(new zzexo(this, zze0));
            }
            zzexq.zze(this.zze).zzd(zzexq.zzf(this.zze).zzc());
            zzfcv.zzb(zze0.zza, throwable0, "BannerAdLoader.onFailure");
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
            zzexq.zzj(this.zze).zzb(this.zzc.zzl());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        synchronized(this.zze) {
            zzexq.zzl(this.zze, null);
            this.zze.zzf.removeAllViews();
            if(((zzcqc)object0).zzc() != null) {
                String s = "";
                ViewParent viewParent0 = ((zzcqc)object0).zzc().getParent();
                if(viewParent0 instanceof ViewGroup) {
                    if(((zzcqc)object0).zzl() != null) {
                        s = ((zzcqc)object0).zzl().zzg();
                    }
                    zzcaa.zzj(("Banner view provided from " + s + " already has a parent view. Removing its old parent."));
                    ((ViewGroup)viewParent0).removeView(((zzcqc)object0).zzc());
                }
            }
            zzbbj zzbbj0 = zzbbr.zzhO;
            if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue()) {
                zzdan zzdan0 = ((zzcqc)object0).zzn();
                zzdan0.zza(this.zze.zzd);
                zzdan0.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(((zzcqc)object0).zzc());
            this.zza.zzb(((zzcqc)object0));
            if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue()) {
                zzekx zzekx0 = this.zze.zzd;
                zzekx0.getClass();
                zzexn zzexn0 = new zzexn(zzekx0);
                this.zze.zzb.execute(zzexn0);
            }
            int v1 = ((zzcqc)object0).zza();
            this.zze.zzh.zzd(v1);
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                zzfhr zzfhr0 = this.zzb;
                if(zzfhr0 != null) {
                    zzfhr0.zzf(((zzcqc)object0).zzp().zzb);
                    zzfhr0.zze(((zzcqc)object0).zzl().zzg());
                    this.zzc.zzf(true);
                    zzfhr0.zza(this.zzc);
                    zzfhr0.zzg();
                    return;
                }
                goto label_36;
            }
            else {
            label_36:
                this.zzc.zzb(((zzcqc)object0).zzp().zzb);
                this.zzc.zzd(((zzcqc)object0).zzl().zzg());
                this.zzc.zzf(true);
                zzfhk zzfhk0 = this.zzc.zzl();
                this.zze.zzi.zzb(zzfhk0);
            }
        }
    }
}

