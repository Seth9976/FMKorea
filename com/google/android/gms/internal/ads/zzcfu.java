package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;

public final class zzcfu {
    public static final zzcfi zza(Context context0, zzcgx zzcgx0, String s, boolean z, boolean z1, zzaqx zzaqx0, zzbct zzbct0, zzcag zzcag0, zzbcj zzbcj0, zzl zzl0, zza zza0, zzaxe zzaxe0, zzfbe zzfbe0, zzfbi zzfbi0, zzecs zzecs0) {
        zzbbr.zza(context0);
        try {
            zzcfq zzcfq0 = new zzcfq(context0, zzcgx0, s, z, z1, zzaqx0, zzbct0, zzcag0, null, zzl0, zza0, zzaxe0, zzfbe0, zzfbi0, zzecs0);
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitDiskReads().permitDiskWrites().build());
                return zzcfq0.zza();
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
        }
        catch(Throwable throwable0) {
        }
        throw new zzcft("Webview initialization failed.", throwable0);
    }
}

