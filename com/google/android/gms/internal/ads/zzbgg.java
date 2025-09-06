package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbgg extends zzatw implements zzbgh {
    public zzbgg() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbgh zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterface0 instanceof zzbgh ? ((zzbgh)iInterface0) : new zzbgf(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            zzbu zzbu0 = zzbt.zzac(parcel0.readStrongBinder());
            IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
            zzatx.zzc(parcel0);
            this.zze(zzbu0, iObjectWrapper0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

