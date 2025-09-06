package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbgf extends zzatv implements zzbgh {
    zzbgf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgh
    public final void zze(zzbu zzbu0, IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbu0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(1, parcel0);
    }
}

