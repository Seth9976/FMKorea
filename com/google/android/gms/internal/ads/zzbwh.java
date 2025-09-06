package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbwh implements zzcac {
    public static final zzbwh zza;

    static {
        zzbwh.zza = new zzbwh();
    }

    @Override  // com.google.android.gms.internal.ads.zzcac
    public final Object zza(Object object0) {
        if(object0 == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterface0 instanceof zzbwa ? ((zzbwa)iInterface0) : new zzbwa(((IBinder)object0));
    }
}

