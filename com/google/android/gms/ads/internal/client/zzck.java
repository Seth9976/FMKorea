package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbof;

public abstract class zzck extends zzatw implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterface0 instanceof zzcl ? ((zzcl)iInterface0) : new zzcj(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                zzen zzen0 = this.getLiteSdkVersion();
                parcel1.writeNoException();
                zzatx.zze(parcel1, zzen0);
                return true;
            }
            case 2: {
                zzbof zzbof0 = this.getAdapterCreator();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbof0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

