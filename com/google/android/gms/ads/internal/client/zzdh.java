package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzdh extends zzatv implements zzdj {
    zzdh(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, iObjectWrapper1);
        this.zzbh(1, parcel0);
    }
}

