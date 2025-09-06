package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbu;

final class zzbhc implements Runnable {
    final AdManagerAdView zza;
    final zzbu zzb;
    final zzbhd zzc;

    zzbhc(zzbhd zzbhd0, AdManagerAdView adManagerAdView0, zzbu zzbu0) {
        this.zzc = zzbhd0;
        this.zza = adManagerAdView0;
        this.zzb = zzbu0;
        super();
    }

    @Override
    public final void run() {
        if(this.zza.zzb(this.zzb)) {
            zzbhd.zzc(this.zzc).onAdManagerAdViewLoaded(this.zza);
            return;
        }
        zzcaa.zzj("Could not bind.");
    }
}

