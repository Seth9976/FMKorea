package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

final class zzbqi implements MediationAdLoadCallback {
    final zzbpq zza;
    final zzbol zzb;

    zzbqi(zzbqo zzbqo0, zzbpq zzbpq0, zzbol zzbol0) {
        this.zza = zzbpq0;
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
        MediationInterscrollerAd mediationInterscrollerAd0 = (MediationInterscrollerAd)object0;
        if(mediationInterscrollerAd0 == null) {
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
            zzbpg zzbpg0 = new zzbpg(mediationInterscrollerAd0);
            this.zza.zzh(zzbpg0);
            return new zzbqp(this.zzb);
        }
        catch(RemoteException remoteException1) {
            zzcaa.zzh("", remoteException1);
            return new zzbqp(this.zzb);
        }
    }
}

