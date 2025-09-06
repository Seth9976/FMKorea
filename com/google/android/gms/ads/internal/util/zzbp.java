package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzbp extends zzatv implements zzbr {
    zzbp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper0, String s, String s1) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        Parcel parcel1 = this.zzbg(1, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }
}

