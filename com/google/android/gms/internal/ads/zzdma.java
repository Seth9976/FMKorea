package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzdma implements Runnable {
    public final zzdmc zza;

    public zzdma(zzdmc zzdmc0) {
        this.zza = zzdmc0;
    }

    @Override
    public final void run() {
        try {
            this.zza.zzd();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

