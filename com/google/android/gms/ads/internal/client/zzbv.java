package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbof;

public final class zzbv extends zzatv implements IInterface {
    zzbv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbof zzbof0, int v, int v1) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzq0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        parcel0.writeInt(v1);
        Parcel parcel1 = this.zzbg(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        parcel1.recycle();
        return iBinder0;
    }
}

