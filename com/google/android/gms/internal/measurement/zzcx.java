package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzcx extends zzbu implements zzcv {
    zzcx(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override  // com.google.android.gms.internal.measurement.zzcv
    public final void zza(Bundle bundle0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        this.zzb(1, parcel0);
    }
}

