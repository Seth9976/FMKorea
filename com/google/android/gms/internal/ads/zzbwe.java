package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzbwe extends zzatv implements IInterface {
    zzbwe(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvt zzbvt0, String s, String s1) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbvt0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzbh(2, parcel0);
    }
}

