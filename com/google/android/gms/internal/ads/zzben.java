package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class zzben extends zzatw implements zzbeo {
    public zzben() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 2: {
                String s = this.zzg();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 3: {
                List list0 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeList(list0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbeo zzj(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterface0 instanceof zzbeo ? ((zzbeo)iInterface0) : new zzbem(iBinder0);
    }
}

