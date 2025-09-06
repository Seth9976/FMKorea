package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbsk extends zzatw implements zzbsl {
    public static zzbsl zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterface0 instanceof zzbsl ? ((zzbsl)iInterface0) : new zzbsj(iBinder0);
    }
}

