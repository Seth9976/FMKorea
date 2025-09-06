package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

public abstract class zzcd {
    private static zzcd zza;

    static {
        zzcd.zza = new zzcg(null);
    }

    public static zzcd zza() {
        synchronized(zzcd.class) {
        }
        return zzcd.zza;
    }

    public abstract URLConnection zza(URL arg1, String arg2);
}

