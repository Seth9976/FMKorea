package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

public final class zzfnd {
    final zzfne zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    zzfnd(zzfne zzfne0, byte[] arr_b, zzfnc zzfnc0) {
        this.zza = zzfne0;
        super();
        this.zzb = arr_b;
    }

    public final zzfnd zza(int v) {
        this.zzd = v;
        return this;
    }

    public final zzfnd zzb(int v) {
        this.zzc = v;
        return this;
    }

    public final void zzc() {
        synchronized(this) {
            zzfne zzfne0 = this.zza;
            if(zzfne0.zzb) {
                try {
                    zzfne0.zza.zzj(this.zzb);
                    this.zza.zza.zzi(this.zzc);
                    this.zza.zza.zzg(this.zzd);
                    this.zza.zza.zzh(null);
                    this.zza.zza.zzf();
                }
                catch(RemoteException remoteException0) {
                    Log.d("GASS", "Clearcut log failed", remoteException0);
                }
            }
        }
    }
}

