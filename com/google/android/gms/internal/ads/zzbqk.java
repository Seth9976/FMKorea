package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

final class zzbqk implements MediationAdLoadCallback {
    final zzbpw zza;
    final zzbol zzb;

    zzbqk(zzbqo zzbqo0, zzbpw zzbpw0, zzbol zzbol0) {
        this.zza = zzbpw0;
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
        UnifiedNativeAdMapper unifiedNativeAdMapper0 = (UnifiedNativeAdMapper)object0;
        if(unifiedNativeAdMapper0 == null) {
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
            zzbpk zzbpk0 = new zzbpk(unifiedNativeAdMapper0);
            this.zza.zzg(zzbpk0);
            return new zzbqp(this.zzb);
        }
        catch(RemoteException remoteException1) {
            zzcaa.zzh("", remoteException1);
            return new zzbqp(this.zzb);
        }
    }
}

