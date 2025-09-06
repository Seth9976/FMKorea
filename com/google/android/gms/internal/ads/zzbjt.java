package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbjt extends zzatv implements zzbjv {
    zzbjt(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbjv
    public final zzbjs zze(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v, zzbjp zzbjp0) {
        zzbjs zzbjs0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        zzatx.zzf(parcel0, zzbjp0);
        Parcel parcel1 = this.zzbg(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbjs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbjs0 = iInterface0 instanceof zzbjs ? ((zzbjs)iInterface0) : new zzbjq(iBinder0);
        }
        parcel1.recycle();
        return zzbjs0;
    }
}

