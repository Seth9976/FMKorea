package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbgo extends zzatv implements zzbgq {
    zzbgo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zze() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzf(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(1, parcel0);
    }
}

