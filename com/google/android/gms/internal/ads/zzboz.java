package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

final class zzboz implements InitializationCompleteCallback {
    final zzbks zza;

    zzboz(zzbpf zzbpf0, zzbks zzbks0) {
        this.zza = zzbks0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String s) {
        try {
            this.zza.zze(s);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }
}

