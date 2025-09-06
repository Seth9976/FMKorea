package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzcac;

public final class zzab implements zzcac {
    public static final zzab zza;

    static {
        zzab.zza = new zzab();
    }

    @Override  // com.google.android.gms.internal.ads.zzcac
    public final Object zza(Object object0) {
        if(object0 == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
        return iInterface0 instanceof zzdk ? ((zzdk)iInterface0) : new zzdk(((IBinder)object0));
    }
}

