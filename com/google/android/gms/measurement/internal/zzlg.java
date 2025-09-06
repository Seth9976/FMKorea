package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzlg implements Runnable {
    private final zzo zza;
    private final zzkp zzb;

    zzlg(zzkp zzkp0, zzo zzo0) {
        this.zzb = zzkp0;
        this.zza = zzo0;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0 = this.zzb.zzb;
        if(zzfk0 == null) {
            this.zzb.zzj().zzg().zza("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzfk0.zze(this.zza);
            this.zzb.zzal();
        }
        catch(RemoteException remoteException0) {
            this.zzb.zzj().zzg().zza("Failed to send consent settings to the service", remoteException0);
        }
    }
}

