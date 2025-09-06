package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzbve extends zzatv implements IInterface {
    zzbve(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvd zzbvd0, String s, String s1) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbvd0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzbh(2, parcel0);
    }
}

