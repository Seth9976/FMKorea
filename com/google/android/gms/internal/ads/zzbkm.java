package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class zzbkm implements BaseOnConnectionFailedListener {
    final zzcas zza;

    zzbkm(zzbkn zzbkn0, zzcas zzcas0) {
        this.zza = zzcas0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        RuntimeException runtimeException0 = new RuntimeException("Connection failed.");
        this.zza.zzd(runtimeException0);
    }
}

