package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

final class zzfat implements OnAdMetadataChangedListener {
    final zzdd zza;
    final zzfav zzb;

    zzfat(zzfav zzfav0, zzdd zzdd0) {
        this.zzb = zzfav0;
        this.zza = zzdd0;
        super();
    }

    @Override  // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if(zzfav.zzr(this.zzb) != null) {
            try {
                this.zza.zze();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

