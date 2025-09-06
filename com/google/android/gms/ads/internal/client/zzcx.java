package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.zzcaa;

public final class zzcx implements MuteThisAdReason {
    private final String zza;
    private final zzcw zzb;

    public zzcx(zzcw zzcw0) {
        String s;
        this.zzb = zzcw0;
        try {
            s = zzcw0.zze();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
            s = null;
        }
        this.zza = s;
    }

    @Override  // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    @Override
    public final String toString() {
        return this.zza;
    }

    public final zzcw zza() {
        return this.zzb;
    }
}

