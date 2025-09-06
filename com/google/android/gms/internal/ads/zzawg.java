package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

public final class zzawg {
    private zzbu zza;
    private final Context zzb;
    private final String zzc;
    private final zzdx zzd;
    @AppOpenAdOrientation
    private final int zze;
    private final AppOpenAdLoadCallback zzf;
    private final zzboc zzg;
    private final zzp zzh;

    public zzawg(Context context0, String s, zzdx zzdx0, @AppOpenAdOrientation int v, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        this.zzg = new zzboc();
        this.zzb = context0;
        this.zzc = s;
        this.zzd = zzdx0;
        this.zze = v;
        this.zzf = appOpenAd$AppOpenAdLoadCallback0;
        this.zzh = zzp.zza;
    }

    public final void zza() {
        try {
            zzq zzq0 = zzq.zzb();
            zzbu zzbu0 = zzay.zza().zzd(this.zzb, zzq0, this.zzc, this.zzg);
            this.zza = zzbu0;
            if(zzbu0 != null) {
                if(this.zze != 3) {
                    zzw zzw0 = new zzw(this.zze);
                    this.zza.zzI(zzw0);
                }
                this.zza.zzH(new zzavt(this.zzf, this.zzc));
                this.zza.zzaa(this.zzh.zza(this.zzb, this.zzd));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzl("#007 Could not call remote method.", remoteException0);
    }
}

