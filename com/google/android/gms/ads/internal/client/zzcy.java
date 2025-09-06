package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzcy extends zzatv implements zzda {
    zzcy(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(1, parcel0);
    }
}

