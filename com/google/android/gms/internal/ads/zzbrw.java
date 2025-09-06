package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbrw extends zzatv implements zzbry {
    zzbrw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbry
    public final zzbrv zze(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        zzbrv zzbrv0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbrv0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbrv0 = iInterface0 instanceof zzbrv ? ((zzbrv)iInterface0) : new zzbrt(iBinder0);
        }
        parcel1.recycle();
        return zzbrv0;
    }
}

