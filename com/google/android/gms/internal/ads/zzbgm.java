package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbgm extends zzatw implements zzbgn {
    public zzbgm() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 2) {
            IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
            zzatx.zzc(parcel0);
            boolean z = this.zzb(iObjectWrapper0);
            parcel1.writeNoException();
            parcel1.writeInt(((int)z));
            return true;
        }
        return false;
    }

    public static zzbgn zzc(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterface0 instanceof zzbgn ? ((zzbgn)iInterface0) : new zzbgl(iBinder0);
    }
}

