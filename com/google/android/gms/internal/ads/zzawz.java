package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class zzawz implements BaseOnConnectionFailedListener {
    final zzcas zza;
    final zzaxa zzb;

    zzawz(zzaxa zzaxa0, zzcas zzcas0) {
        this.zzb = zzaxa0;
        this.zza = zzcas0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        synchronized(zzaxa.zzb(this.zzb)) {
            RuntimeException runtimeException0 = new RuntimeException("Connection failed.");
            this.zza.zzd(runtimeException0);
        }
    }
}

