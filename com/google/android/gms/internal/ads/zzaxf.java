package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzaxf implements Runnable {
    public final zzaxk zza;
    public final Context zzb;

    public zzaxf(zzaxk zzaxk0, Context context0) {
        this.zza = zzaxk0;
        this.zzb = context0;
    }

    @Override
    public final void run() {
        zzaxk zzaxk0 = this.zza;
        Context context0 = this.zzb;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeL)).booleanValue()) {
            try {
                zzaxk0.zza = (zzaua)zzcae.zzb(context0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzaxg.zza);
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                zzaxk0.zza.zze(iObjectWrapper0, "GMA_SDK");
                zzaxk0.zzb = true;
            }
            catch(zzcad | RemoteException | NullPointerException unused_ex) {
                zzcaa.zze("Cannot dynamite load clearcut");
            }
        }
    }
}

