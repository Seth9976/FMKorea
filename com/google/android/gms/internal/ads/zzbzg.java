package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;

final class zzbzg extends ConnectivityManager.NetworkCallback {
    final zzbzj zza;

    zzbzg(zzbzj zzbzj0) {
        this.zza = zzbzj0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onAvailable(Network network0) {
        zzbzj.zzo(this.zza).set(true);
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLost(Network network0) {
        zzbzj.zzo(this.zza).set(false);
    }
}

