package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;

final class zzara extends ConnectivityManager.NetworkCallback {
    final zzarb zza;

    zzara(zzarb zzarb0) {
        this.zza = zzarb0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onCapabilitiesChanged(Network network0, NetworkCapabilities networkCapabilities0) {
        synchronized(zzarb.class) {
            zzarb.zzd(this.zza, networkCapabilities0);
        }
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLost(Network network0) {
        synchronized(zzarb.class) {
            zzarb.zzd(this.zza, null);
        }
    }
}

