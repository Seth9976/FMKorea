package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzkv implements Runnable {
    private final zzo zza;
    private final zzkp zzb;

    zzkv(zzkp zzkp0, zzo zzo0) {
        this.zzb = zzkp0;
        this.zza = zzo0;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0 = this.zzb.zzb;
        if(zzfk0 == null) {
            this.zzb.zzj().zzg().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzfk0.zzd(this.zza);
        }
        catch(RemoteException remoteException0) {
            this.zzb.zzj().zzg().zza("Failed to reset data on the service: remote exception", remoteException0);
        }
        this.zzb.zzal();
    }
}

