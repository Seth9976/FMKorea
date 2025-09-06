package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzpr;

final class zzjq implements Runnable {
    private final zzcv zza;
    private final zziq zzb;

    zzjq(zziq zziq0, zzcv zzcv0) {
        this.zzb = zziq0;
        this.zza = zzcv0;
        super();
    }

    @Override
    public final void run() {
        Long long0;
        zzlx zzlx0 = this.zzb.zzp();
        if(!zzpr.zza() || !zzlx0.zze().zza(zzbi.zzbx)) {
            zzlx0.zzj().zzv().zza("getSessionId has been disabled.");
            long0 = null;
        }
        else if(!zzlx0.zzk().zzm().zzh()) {
            zzlx0.zzj().zzv().zza("Analytics storage consent denied; will not get session id");
            long0 = null;
        }
        else if(zzlx0.zzk().zza(zzlx0.zzb().currentTimeMillis()) || zzlx0.zzk().zzl.zza() == 0L) {
            long0 = null;
        }
        else {
            long0 = zzlx0.zzk().zzl.zza();
        }
        if(long0 != null) {
            this.zzb.zzu.zzt().zza(this.zza, ((long)long0));
            return;
        }
        try {
            this.zza.zza(null);
        }
        catch(RemoteException remoteException0) {
            this.zzb.zzu.zzj().zzg().zza("getSessionId failed with exception", remoteException0);
        }
    }
}

