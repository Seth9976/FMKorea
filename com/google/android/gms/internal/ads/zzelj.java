package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzelj implements zzcwl {
    public final zzekx zza;
    public final zzblj zzb;

    public zzelj(zzekx zzekx0, zzblj zzblj0) {
        this.zza = zzekx0;
        this.zzb = zzblj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        zzblj zzblj0 = this.zzb;
        this.zza.zzbF(zze0);
        if(zzblj0 != null) {
            try {
                zzblj0.zzf(zze0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        if(zzblj0 != null) {
            try {
                zzblj0.zze(zze0.zza);
            }
            catch(RemoteException remoteException1) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException1);
            }
        }
    }
}

