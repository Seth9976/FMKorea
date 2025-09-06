package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;

public final class zzbz extends zzatv implements zzcb {
    zzbz(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String s, String s1) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzbh(1, parcel0);
    }
}

