package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcaa;

final class zzev implements Runnable {
    final zzew zza;

    zzev(zzew zzew0) {
        this.zza = zzew0;
        super();
    }

    @Override
    public final void run() {
        zzew zzew0 = this.zza;
        if(zzew0.zza != null) {
            try {
                zzew0.zza.zze(1);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Could not notify onAdFailedToLoad event.", remoteException0);
            }
        }
    }
}

