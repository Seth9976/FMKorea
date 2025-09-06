package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbys extends zzatv implements zzbyu {
    zzbys(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final zzbyr zze(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        zzbyr zzbyr0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbyr0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbyr0 = iInterface0 instanceof zzbyr ? ((zzbyr)iInterface0) : new zzbyp(iBinder0);
        }
        parcel1.recycle();
        return zzbyr0;
    }
}

