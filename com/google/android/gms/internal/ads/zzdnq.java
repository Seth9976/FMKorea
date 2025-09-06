package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.ref.WeakReference;

public final class zzdnq extends zzcse {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdfy zze;
    private final zzdde zzf;
    private final zzcwv zzg;
    private final zzcyc zzh;
    private final zzcsy zzi;
    private final zzbvt zzj;
    private final zzfln zzk;
    private final zzfbt zzl;
    private boolean zzm;

    zzdnq(zzcsd zzcsd0, Context context0, zzcfi zzcfi0, zzdfy zzdfy0, zzdde zzdde0, zzcwv zzcwv0, zzcyc zzcyc0, zzcsy zzcsy0, zzfbe zzfbe0, zzfln zzfln0, zzfbt zzfbt0) {
        super(zzcsd0);
        this.zzm = false;
        this.zzc = context0;
        this.zze = zzdfy0;
        this.zzd = new WeakReference(zzcfi0);
        this.zzf = zzdde0;
        this.zzg = zzcwv0;
        this.zzh = zzcyc0;
        this.zzi = zzcsy0;
        this.zzk = zzfln0;
        this.zzj = new zzbwn((zzfbe0.zzm == null ? "" : zzfbe0.zzm.zza), (zzfbe0.zzm == null ? 1 : zzfbe0.zzm.zzb));
        this.zzl = zzfbt0;
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
            else if(!this.zzm && zzcfi0 != null) {
                zzdnp zzdnp0 = new zzdnp(zzcfi0);
                zzcan.zze.execute(zzdnp0);
            }
        }
        finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbvt zzc() {
        return this.zzj;
    }

    public final zzfbt zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfi zzcfi0 = (zzcfi)this.zzd.get();
        return zzcfi0 != null && !zzcfi0.zzaB();
    }

    public final boolean zzh(boolean z, Activity activity0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzaB)).booleanValue() && zzs.zzD(this.zzc)) {
            zzcaa.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
            this.zzg.zzb();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzaC)).booleanValue()) {
                this.zzk.zza(this.zza.zzb.zzb.zzb);
            }
            return false;
        }
        if(this.zzm) {
            zzcaa.zzj("The rewarded ad have been showed.");
            zze zze0 = zzfdb.zzd(10, null, null);
            this.zzg.zza(zze0);
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        if(activity0 == null) {
            activity0 = this.zzc;
        }
        try {
            this.zze.zza(z, activity0, this.zzg);
            this.zzf.zza();
            return true;
        }
        catch(zzdfx zzdfx0) {
            this.zzg.zzc(zzdfx0);
            return false;
        }
    }
}

