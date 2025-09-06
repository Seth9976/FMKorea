package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzcac;

public final class zzj implements zzcac {
    public static final zzj zza;

    static {
        zzj.zza = new zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzcac
    public final Object zza(Object object0) {
        if(object0 == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterface0 instanceof zzbv ? ((zzbv)iInterface0) : new zzbv(((IBinder)object0));
    }
}

