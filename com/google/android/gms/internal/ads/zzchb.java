package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzchb extends zzatw implements zzchc {
    public static zzchc zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterface0 instanceof zzchc ? ((zzchc)iInterface0) : new zzcha(iBinder0);
    }
}

