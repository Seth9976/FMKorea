package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzla implements Runnable {
    private final zzo zza;
    private final zzkp zzb;

    zzla(zzkp zzkp0, zzo zzo0) {
        this.zzb = zzkp0;
        this.zza = zzo0;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0 = this.zzb.zzb;
        if(zzfk0 == null) {
            this.zzb.zzj().zzg().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzfk0.zzc(this.zza);
            this.zzb.zzh().zzac();
            this.zzb.zza(zzfk0, null, this.zza);
            this.zzb.zzal();
        }
        catch(RemoteException remoteException0) {
            this.zzb.zzj().zzg().zza("Failed to send app launch to the service", remoteException0);
        }
    }
}

