package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class zzawl implements BaseOnConnectionFailedListener {
    final zzawm zza;

    zzawl(zzawm zzawm0) {
        this.zza = zzawm0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        synchronized(zzawm.zze(this.zza)) {
            zzawm.zzk(this.zza, null);
            zzawm zzawm0 = this.zza;
            if(zzawm.zzc(zzawm0) != null) {
                zzawm.zzf(zzawm0, null);
            }
            zzawm.zze(this.zza).notifyAll();
        }
    }
}

