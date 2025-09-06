package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

final class zzli implements Runnable {
    private final boolean zza;
    private final zzo zzb;
    private final boolean zzc;
    private final zzad zzd;
    private final zzad zze;
    private final zzkp zzf;

    zzli(zzkp zzkp0, boolean z, zzo zzo0, boolean z1, zzad zzad0, zzad zzad1) {
        this.zzf = zzkp0;
        this.zza = true;
        this.zzb = zzo0;
        this.zzc = z1;
        this.zzd = zzad0;
        this.zze = zzad1;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0 = this.zzf.zzb;
        if(zzfk0 == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if(this.zza) {
            Preconditions.checkNotNull(this.zzb);
            this.zzf.zza(zzfk0, (this.zzc ? null : this.zzd), this.zzb);
        }
        else {
            try {
                if(TextUtils.isEmpty(this.zze.zza)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzfk0.zza(this.zzd, this.zzb);
                }
                else {
                    zzfk0.zza(this.zzd);
                }
                goto label_16;
            }
            catch(RemoteException remoteException0) {
            }
            this.zzf.zzj().zzg().zza("Failed to send conditional user property to the service", remoteException0);
        }
    label_16:
        this.zzf.zzal();
    }
}

