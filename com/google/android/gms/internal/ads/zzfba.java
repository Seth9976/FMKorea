package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

final class zzfba implements OnAdMetadataChangedListener {
    final zzby zza;
    final zzfbb zzb;

    zzfba(zzfbb zzfbb0, zzby zzby0) {
        this.zzb = zzfbb0;
        this.zza = zzby0;
        super();
    }

    @Override  // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if(zzfbb.zzv(this.zzb) != null) {
            try {
                this.zza.zze();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

