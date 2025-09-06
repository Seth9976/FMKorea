package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;

final class zzlk implements Runnable {
    private final String zza;
    private final String zzb;
    private final zzo zzc;
    private final zzcv zzd;
    private final zzkp zze;

    zzlk(zzkp zzkp0, String s, String s1, zzo zzo0, zzcv zzcv0) {
        this.zze = zzkp0;
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzo0;
        this.zzd = zzcv0;
        super();
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = new ArrayList();
        try {
            zzfk zzfk0 = this.zze.zzb;
            if(zzfk0 != null) {
                Preconditions.checkNotNull(this.zzc);
                arrayList0 = zznd.zzb(zzfk0.zza(this.zza, this.zzb, this.zzc));
                this.zze.zzal();
                return;
            }
            this.zze.zzj().zzg().zza("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
        }
        catch(RemoteException remoteException0) {
            this.zze.zzj().zzg().zza("Failed to get conditional properties; remote exception", this.zza, this.zzb, remoteException0);
        }
        finally {
            this.zze.zzq().zza(this.zzd, arrayList0);
        }
    }
}

