package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

final class zzbql implements MediationAdLoadCallback {
    final zzbpn zza;
    final zzbol zzb;
    final zzbqo zzc;

    zzbql(zzbqo zzbqo0, zzbpn zzbpn0, zzbol zzbol0) {
        this.zzc = zzbqo0;
        this.zza = zzbpn0;
        this.zzb = zzbol0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError0) {
        try {
            zze zze0 = adError0.zza();
            this.zza.zzf(zze0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String s) {
        this.onFailure(new AdError(0, s, "undefined"));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object object0) {
        MediationAppOpenAd mediationAppOpenAd0 = (MediationAppOpenAd)object0;
        if(mediationAppOpenAd0 == null) {
            zzcaa.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("", remoteException0);
            }
            return null;
        }
        try {
            zzbqo.zzc(this.zzc, mediationAppOpenAd0);
            this.zza.zzg();
            return new zzbqp(this.zzb);
        }
        catch(RemoteException remoteException1) {
            zzcaa.zzh("", remoteException1);
            return new zzbqp(this.zzb);
        }
    }
}

