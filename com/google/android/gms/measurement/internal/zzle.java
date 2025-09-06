package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;

final class zzle implements Runnable {
    private final zzbg zza;
    private final String zzb;
    private final zzcv zzc;
    private final zzkp zzd;

    zzle(zzkp zzkp0, zzbg zzbg0, String s, zzcv zzcv0) {
        this.zzd = zzkp0;
        this.zza = zzbg0;
        this.zzb = s;
        this.zzc = zzcv0;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0;
        byte[] arr_b = null;
        try {
            zzfk0 = this.zzd.zzb;
            if(zzfk0 == null) {
                this.zzd.zzj().zzg().zza("Discarding data. Failed to send event to service to bundle");
                goto label_4;
            }
            goto label_6;
        }
        catch(RemoteException remoteException0) {
            goto label_10;
        }
        catch(Throwable throwable0) {
            this.zzd.zzq().zza(this.zzc, arr_b);
            throw throwable0;
        }
    label_4:
        this.zzd.zzq().zza(this.zzc, null);
        return;
        try {
            try {
            label_6:
                arr_b = zzfk0.zza(this.zza, this.zzb);
                this.zzd.zzal();
                goto label_16;
            }
            catch(RemoteException remoteException0) {
            }
        label_10:
            this.zzd.zzj().zzg().zza("Failed to send event to the service to bundle", remoteException0);
        }
        catch(Throwable throwable0) {
            this.zzd.zzq().zza(this.zzc, arr_b);
            throw throwable0;
        }
        this.zzd.zzq().zza(this.zzc, arr_b);
        return;
    label_16:
        this.zzd.zzq().zza(this.zzc, arr_b);
    }
}

