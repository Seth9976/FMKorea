package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

public abstract class zzbku extends zzatw implements zzbkv {
    public zzbku() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            ArrayList arrayList0 = parcel0.createTypedArrayList(zzbko.CREATOR);
            zzatx.zzc(parcel0);
            this.zzb(arrayList0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbkv zzc(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterface0 instanceof zzbkv ? ((zzbkv)iInterface0) : new zzbkt(iBinder0);
    }
}

