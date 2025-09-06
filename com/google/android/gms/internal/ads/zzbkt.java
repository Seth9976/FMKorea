package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class zzbkt extends zzatv implements zzbkv {
    zzbkt(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbkv
    public final void zzb(List list0) {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        this.zzbh(1, parcel0);
    }
}

