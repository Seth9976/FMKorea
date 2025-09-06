package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzbkh extends zzatv implements IInterface {
    zzbkh(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkb zzbkb0, zzbkg zzbkg0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbkb0);
        zzatx.zzf(parcel0, zzbkg0);
        this.zzbi(2, parcel0);
    }
}

