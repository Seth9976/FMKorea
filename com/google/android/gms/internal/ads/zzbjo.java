package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbjo extends zzatw implements zzbjp {
    public zzbjo() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            String s = parcel0.readString();
            zzatx.zzc(parcel0);
            this.zzb(s);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzbjp zzc(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterface0 instanceof zzbjp ? ((zzbjp)iInterface0) : new zzbjn(iBinder0);
    }
}

