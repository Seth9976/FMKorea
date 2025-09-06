package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbfc extends zzatw implements zzbfd {
    public static zzbfd zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterface0 instanceof zzbfd ? ((zzbfd)iInterface0) : new zzbfb(iBinder0);
    }
}

