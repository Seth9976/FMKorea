package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbub extends zzatv implements zzbud {
    zzbub(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zze(zzbtv zzbtv0, zzbug zzbug0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbtv0);
        zzatx.zzf(parcel0, zzbug0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzf(zzbtr zzbtr0, zzbug zzbug0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbtr0);
        zzatx.zzf(parcel0, zzbug0);
        this.zzbh(1, parcel0);
    }
}

