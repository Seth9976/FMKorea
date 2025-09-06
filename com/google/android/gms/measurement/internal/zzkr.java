package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcv;

final class zzkr implements Runnable {
    private final String zza;
    private final String zzb;
    private final zzo zzc;
    private final boolean zzd;
    private final zzcv zze;
    private final zzkp zzf;

    zzkr(zzkp zzkp0, String s, String s1, zzo zzo0, boolean z, zzcv zzcv0) {
        this.zzf = zzkp0;
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzo0;
        this.zzd = z;
        this.zze = zzcv0;
        super();
    }

    @Override
    public final void run() {
        Bundle bundle0 = new Bundle();
        try {
            zzfk zzfk0 = this.zzf.zzb;
            if(zzfk0 != null) {
                Preconditions.checkNotNull(this.zzc);
                bundle0 = zznd.zza(zzfk0.zza(this.zza, this.zzb, this.zzd, this.zzc));
                this.zzf.zzal();
                return;
            }
            this.zzf.zzj().zzg().zza("Failed to get user properties; not connected to service", this.zza, this.zzb);
        }
        catch(RemoteException remoteException0) {
            this.zzf.zzj().zzg().zza("Failed to get user properties; remote exception", this.zza, remoteException0);
        }
        finally {
            this.zzf.zzq().zza(this.zze, bundle0);
        }
    }
}

