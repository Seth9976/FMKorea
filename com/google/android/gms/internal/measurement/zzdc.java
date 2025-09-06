package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzdc extends zzbu implements zzda {
    zzdc(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override  // com.google.android.gms.internal.measurement.zzda
    public final int zza() {
        Parcel parcel0 = this.zza(2, this.a_());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzda
    public final void zza(String s, String s1, Bundle bundle0, long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(1, parcel0);
    }
}

