package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbfy extends zzatv implements zzbga {
    zzbfy(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zze(zzbfq zzbfq0, String s) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbfq0);
        parcel0.writeString(s);
        this.zzbh(1, parcel0);
    }
}

