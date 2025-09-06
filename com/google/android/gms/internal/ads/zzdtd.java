package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;

public final class zzdtd implements Runnable {
    public final zzdtj zza;
    public final zzbkv zzb;

    public zzdtd(zzdtj zzdtj0, zzbkv zzbkv0) {
        this.zza = zzdtj0;
        this.zzb = zzbkv0;
    }

    @Override
    public final void run() {
        try {
            List list0 = this.zza.zzg();
            this.zzb.zzb(list0);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }
}

