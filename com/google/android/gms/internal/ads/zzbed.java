package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

public final class zzbed {
    private final Context zza;

    public zzbed(Context context0) {
        this.zza = context0;
    }

    public final void zza(zzbtm zzbtm0) {
        try {
            ((zzbee)zzcae.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbec.zza)).zze(zzbtm0);
        }
        catch(zzcad zzcad0) {
            zzcaa.zzj(("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:" + zzcad0.getMessage()));
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzj(("Error calling setFlagsAccessedBeforeInitializedListener: " + remoteException0.getMessage()));
        }
    }
}

