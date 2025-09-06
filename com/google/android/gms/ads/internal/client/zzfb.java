package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzcaa;

public final class zzfb implements Runnable {
    public final zzbwd zza;

    public zzfb(zzbwd zzbwd0) {
        this.zza = zzbwd0;
    }

    @Override
    public final void run() {
        zzbwd zzbwd0 = this.zza;
        if(zzbwd0 != null) {
            try {
                zzbwd0.zze(1);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

