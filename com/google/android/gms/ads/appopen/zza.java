package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.internal.ads.zzawg;
import com.google.android.gms.internal.ads.zzbtf;

public final class zza implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdManagerAdRequest zzc;
    public final int zzd;
    public final AppOpenAdLoadCallback zze;

    public zza(Context context0, String s, AdManagerAdRequest adManagerAdRequest0, int v, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adManagerAdRequest0;
        this.zzd = v;
        this.zze = appOpenAd$AppOpenAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            new zzawg(context0, this.zzb, this.zzc.zza(), this.zzd, this.zze).zza();
        }
        catch(IllegalStateException illegalStateException0) {
            zzbtf.zza(context0).zzf(illegalStateException0, "AppOpenAdManager.load");
        }
    }
}

