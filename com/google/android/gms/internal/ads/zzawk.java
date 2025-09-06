package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class zzawk implements BaseConnectionCallbacks {
    final zzawm zza;

    zzawk(zzawm zzawm0) {
        this.zza = zzawm0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(zzawm.zze(this.zza)) {
            zzawm zzawm0 = this.zza;
            if(zzawm.zzc(zzawm0) != null) {
                try {
                    zzawm.zzk(zzawm0, zzawm.zzc(zzawm0).zzq());
                }
                catch(DeadObjectException deadObjectException0) {
                    zzcaa.zzh("Unable to obtain a cache service instance.", deadObjectException0);
                    zzawm.zzh(this.zza);
                }
            }
            zzawm.zze(this.zza).notifyAll();
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        synchronized(zzawm.zze(this.zza)) {
            zzawm.zzk(this.zza, null);
            zzawm.zze(this.zza).notifyAll();
        }
    }
}

