package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzatw;

public abstract class zzbx extends zzatw implements zzby {
    public static zzby zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterface0 instanceof zzby ? ((zzby)iInterface0) : new zzbw(iBinder0);
    }
}

