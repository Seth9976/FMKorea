package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbec implements zzcac {
    public static final zzbec zza;

    static {
        zzbec.zza = new zzbec();
    }

    @Override  // com.google.android.gms.internal.ads.zzcac
    public final Object zza(Object object0) {
        if(object0 == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return iInterface0 instanceof zzbee ? ((zzbee)iInterface0) : new zzbee(((IBinder)object0));
    }
}

