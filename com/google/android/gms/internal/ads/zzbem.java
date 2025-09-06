package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class zzbem extends zzatv implements zzbeo {
    zzbem(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override  // com.google.android.gms.internal.ads.zzbeo
    public final String zzg() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbeo
    public final List zzh() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        List list0 = zzatx.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }
}

