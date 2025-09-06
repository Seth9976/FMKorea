package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzcac;

public final class zzap implements zzcac {
    public static final zzap zza;

    static {
        zzap.zza = new zzap();
    }

    @Override  // com.google.android.gms.internal.ads.zzcac
    public final Object zza(Object object0) {
        if(object0 == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterface0 instanceof zzcp ? ((zzcp)iInterface0) : new zzcp(((IBinder)object0));
    }
}

