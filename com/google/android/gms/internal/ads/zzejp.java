package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

public final class zzejp {
    private final ConcurrentHashMap zza;
    private final zzdpc zzb;

    public zzejp(zzdpc zzdpc0) {
        this.zza = new ConcurrentHashMap();
        this.zzb = zzdpc0;
    }

    // 去混淆评级： 低(20)
    public final zzbqc zza(String s) {
        return this.zza.containsKey(s) ? ((zzbqc)this.zza.get(s)) : null;
    }

    public final void zzb(String s) {
        try {
            zzbqc zzbqc0 = this.zzb.zzb(s);
            this.zza.put(s, zzbqc0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Couldn\'t create RTB adapter : ", remoteException0);
        }
    }
}

