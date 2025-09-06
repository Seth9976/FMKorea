package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class zzkz implements Runnable {
    private final zzki zza;
    private final zzkp zzb;

    zzkz(zzkp zzkp0, zzki zzki0) {
        this.zzb = zzkp0;
        this.zza = zzki0;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0 = this.zzb.zzb;
        if(zzfk0 == null) {
            this.zzb.zzj().zzg().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzki zzki0 = this.zza;
            if(zzki0 == null) {
                zzfk0.zza(0L, null, null, "com.fmkorea.m.fmk");
            }
            else {
                zzfk0.zza(zzki0.zzc, zzki0.zza, zzki0.zzb, "com.fmkorea.m.fmk");
            }
            this.zzb.zzal();
            return;
        }
        catch(RemoteException remoteException0) {
        }
        this.zzb.zzj().zzg().zza("Failed to send current screen to the service", remoteException0);
    }
}

