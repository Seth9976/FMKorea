package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcaa;

final class zzer implements Runnable {
    final zzet zza;

    zzer(zzet zzet0) {
        this.zza = zzet0;
        super();
    }

    @Override
    public final void run() {
        zzeu zzeu0 = this.zza.zza;
        if(zzeu.zzb(zzeu0) != null) {
            try {
                zzeu.zzb(zzeu0).zze(1);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Could not notify onAdFailedToLoad event.", remoteException0);
            }
        }
    }
}

