package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbju extends zzatw implements zzbjv {
    public static zzbjv zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return iInterface0 instanceof zzbjv ? ((zzbjv)iInterface0) : new zzbjt(iBinder0);
    }
}

