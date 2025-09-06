package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbon extends zzatw implements zzboo {
    public zzbon() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzboo zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterface0 instanceof zzboo ? ((zzboo)iInterface0) : new zzbom(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zze();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                boolean z = this.zzf();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

