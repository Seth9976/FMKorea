package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzatz extends zzatw implements zzaua {
    public static zzaua zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterface0 instanceof zzaua ? ((zzaua)iInterface0) : new zzaty(iBinder0);
    }
}

