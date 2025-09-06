package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

final class zzlf implements Runnable {
    private final boolean zza;
    private final zzo zzb;
    private final boolean zzc;
    private final zzbg zzd;
    private final String zze;
    private final zzkp zzf;

    zzlf(zzkp zzkp0, boolean z, zzo zzo0, boolean z1, zzbg zzbg0, String s) {
        this.zzf = zzkp0;
        this.zza = z;
        this.zzb = zzo0;
        this.zzc = z1;
        this.zzd = zzbg0;
        this.zze = s;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0 = this.zzf.zzb;
        if(zzfk0 == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
            return;
        }
        if(this.zza) {
            Preconditions.checkNotNull(this.zzb);
            this.zzf.zza(zzfk0, (this.zzc ? null : this.zzd), this.zzb);
        }
        else {
            try {
                if(TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    zzfk0.zza(this.zzd, this.zzb);
                }
                else {
                    String s = this.zzf.zzj().zzx();
                    zzfk0.zza(this.zzd, this.zze, s);
                }
                goto label_17;
            }
            catch(RemoteException remoteException0) {
            }
            this.zzf.zzj().zzg().zza("Failed to send event to the service", remoteException0);
        }
    label_17:
        this.zzf.zzal();
    }
}

