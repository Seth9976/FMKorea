package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;

public final class zzcj extends zzatv implements zzcl {
    zzcj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcl
    public final zzbof getAdapterCreator() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        zzbof zzbof0 = zzboe.zzf(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbof0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() {
        Parcel parcel0 = this.zzbg(1, this.zza());
        zzen zzen0 = (zzen)zzatx.zza(parcel0, zzen.CREATOR);
        parcel0.recycle();
        return zzen0;
    }
}

