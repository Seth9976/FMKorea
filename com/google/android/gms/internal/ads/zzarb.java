package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build.VERSION;
import y0.o;

public final class zzarb {
    private NetworkCapabilities zza;

    zzarb(ConnectivityManager connectivityManager0) {
        if(connectivityManager0 != null && Build.VERSION.SDK_INT >= 24) {
            try {
                o.a(connectivityManager0, new zzara(this));
            }
            catch(RuntimeException unused_ex) {
                synchronized(zzarb.class) {
                    this.zza = null;
                }
            }
        }
    }

    public final long zza() {
        synchronized(zzarb.class) {
            NetworkCapabilities networkCapabilities0 = this.zza;
            if(networkCapabilities0 != null) {
                if(networkCapabilities0.hasTransport(4)) {
                    return 2L;
                }
                if(this.zza.hasTransport(1)) {
                    return 1L;
                }
                if(this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }

    public static zzarb zzc(Context context0) {
        return context0 == null ? null : new zzarb(((ConnectivityManager)context0.getSystemService("connectivity")));
    }

    static void zzd(zzarb zzarb0, NetworkCapabilities networkCapabilities0) {
        zzarb0.zza = networkCapabilities0;
    }
}

