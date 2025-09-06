package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbfw extends zzatw implements zzbfx {
    public static zzbfx zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterface0 instanceof zzbfx ? ((zzbfx)iInterface0) : new zzbfv(iBinder0);
    }
}

