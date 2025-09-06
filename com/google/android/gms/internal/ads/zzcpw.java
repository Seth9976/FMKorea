package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzcpw extends zzcse {
    private final zzcfi zzc;
    private final int zzd;
    private final Context zze;
    private final zzcpl zzf;
    private final zzdfy zzg;
    private final zzdde zzh;
    private final zzcwv zzi;
    private final boolean zzj;
    private final zzbzn zzk;
    private boolean zzl;

    zzcpw(zzcsd zzcsd0, Context context0, zzcfi zzcfi0, int v, zzcpl zzcpl0, zzdfy zzdfy0, zzdde zzdde0, zzcwv zzcwv0, zzbzn zzbzn0) {
        super(zzcsd0);
        this.zzl = false;
        this.zzc = zzcfi0;
        this.zze = context0;
        this.zzd = v;
        this.zzf = zzcpl0;
        this.zzg = zzdfy0;
        this.zzh = zzdde0;
        this.zzi = zzcwv0;
        this.zzj = ((Boolean)zzba.zzc().zzb(zzbbr.zzff)).booleanValue();
        this.zzk = zzbzn0;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzcse
    public final void zzb() {
        super.zzb();
        zzcfi zzcfi0 = this.zzc;
        if(zzcfi0 != null) {
            zzcfi0.destroy();
        }
    }

    public final void zzc(zzavs zzavs0) {
        zzcfi zzcfi0 = this.zzc;
        if(zzcfi0 != null) {
            zzcfi0.zzah(zzavs0);
        }
    }

    public final void zzd(Activity activity0, zzawf zzawf0, boolean z) {
        if(activity0 == null) {
            activity0 = this.zze;
        }
        if(this.zzj) {
            this.zzh.zzb();
        }
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzaB)).booleanValue() || !zzs.zzD(activity0)) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzkC)).booleanValue()) {
                zzcfi zzcfi0 = this.zzc;
                if(zzcfi0 != null) {
                    zzfbe zzfbe0 = zzcfi0.zzD();
                    if(zzfbe0 != null && zzfbe0.zzar) {
                        int v = this.zzk.zzb();
                        if(zzfbe0.zzas != v) {
                            zzcaa.zzj("The app open consent form has been shown.");
                            zze zze0 = zzfdb.zzd(12, "The consent form has already been shown.", null);
                            this.zzi.zza(zze0);
                            return;
                        }
                    }
                }
            }
            if(this.zzl) {
                zzcaa.zzj("App open interstitial ad is already visible.");
                zze zze1 = zzfdb.zzd(10, null, null);
                this.zzi.zza(zze1);
            }
            if(!this.zzl) {
                try {
                    this.zzg.zza(z, activity0, this.zzi);
                    if(this.zzj) {
                        this.zzh.zza();
                    }
                    this.zzl = true;
                }
                catch(zzdfx zzdfx0) {
                    this.zzi.zzc(zzdfx0);
                }
            }
        }
        else {
            zzcaa.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
            this.zzi.zzb();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzaC)).booleanValue()) {
                new zzfln(activity0.getApplicationContext(), zzt.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
            }
        }
    }

    public final void zze(long v, int v1) {
        this.zzf.zza(v, v1);
    }
}

