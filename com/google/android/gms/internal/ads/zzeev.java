package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;

public final class zzeev implements zzcsc {
    public final zzedq zza;

    public zzeev(zzedq zzedq0) {
        this.zza = zzedq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcsc
    public final zzdq zza() {
        try {
            return ((zzbqc)this.zza.zzb).zze();
        }
        catch(RemoteException remoteException0) {
            throw new zzfcf(remoteException0);
        }
    }
}

