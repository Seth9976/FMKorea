package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbft extends zzatw implements zzbfu {
    public static zzbfu zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterface0 instanceof zzbfu ? ((zzbfu)iInterface0) : new zzbfs(iBinder0);
    }
}

