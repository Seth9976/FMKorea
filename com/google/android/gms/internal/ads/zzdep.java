package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.ref.WeakReference;

public final class zzdep extends zzcse {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdde zze;
    private final zzdfy zzf;
    private final zzcsy zzg;
    private final zzfln zzh;
    private final zzcwv zzi;
    private final zzbzn zzj;
    private boolean zzk;

    zzdep(zzcsd zzcsd0, Context context0, zzcfi zzcfi0, zzdde zzdde0, zzdfy zzdfy0, zzcsy zzcsy0, zzfln zzfln0, zzcwv zzcwv0, zzbzn zzbzn0) {
        super(zzcsd0);
        this.zzk = false;
        this.zzc = context0;
        this.zzd = new WeakReference(zzcfi0);
        this.zze = zzdde0;
        this.zzf = zzdfy0;
        this.zzg = zzcsy0;
        this.zzh = zzfln0;
        this.zzi = zzcwv0;
        this.zzj = zzbzn0;
    }

    @Override
    public final void finalize() {
        try {
            zzcfi zzcfi0 = (zzcfi)this.zzd.get();
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgD)).booleanValue()) {
                if(zzcfi0 != null) {
                    zzcfi0.destroy();
                }
            }
            else if(!this.zzk && zzcfi0 != null) {
                zzdeo zzdeo0 = new zzdeo(zzcfi0);
                zzcan.zze.execute(zzdeo0);
            }
        }
        finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    public final boolean zzc(boolean z, Activity activity0) {
        this.zze.zzb();
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzaB)).booleanValue() || !zzs.zzD(this.zzc)) {
            zzcfi zzcfi0 = (zzcfi)this.zzd.get();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzkC)).booleanValue() && zzcfi0 != null) {
                zzfbe zzfbe0 = zzcfi0.zzD();
                if(zzfbe0 != null && zzfbe0.zzar) {
                    int v = this.zzj.zzb();
                    if(zzfbe0.zzas != v) {
                        zzcaa.zzj("The interstitial consent form has been shown.");
                        zze zze0 = zzfdb.zzd(12, "The consent form has already been shown.", null);
                        this.zzi.zza(zze0);
                        return false;
                    }
                }
            }
            if(this.zzk) {
                zzcaa.zzj("The interstitial ad has been shown.");
                zze zze1 = zzfdb.zzd(10, null, null);
                this.zzi.zza(zze1);
            }
            if(!this.zzk) {
                if(activity0 == null) {
                    activity0 = this.zzc;
                }
                try {
                    this.zzf.zza(z, activity0, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
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
                this.zzh.zza(this.zza.zzb.zzb.zzb);
                return false;
            }
        }
        return false;
    }
}

