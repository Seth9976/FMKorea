package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class zzbsp extends zzatv implements zzbsr {
    zzbsp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbsr
    public final void zze(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsr
    public final void zzf(List list0) {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        this.zzbh(1, parcel0);
    }
}

