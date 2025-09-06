package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzcha extends zzatv implements zzchc {
    zzcha(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzchc
    public final void zze(IObjectWrapper iObjectWrapper0, zzcgz zzcgz0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzcgz0);
        this.zzbh(2, parcel0);
    }
}

