package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbrx extends zzatw implements zzbry {
    public static zzbry zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterface0 instanceof zzbry ? ((zzbry)iInterface0) : new zzbrw(iBinder0);
    }
}

