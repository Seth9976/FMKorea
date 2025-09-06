package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbyt extends zzatw implements zzbyu {
    public static zzbyu zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterface0 instanceof zzbyu ? ((zzbyu)iInterface0) : new zzbys(iBinder0);
    }
}

