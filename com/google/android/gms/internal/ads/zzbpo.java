package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbpo extends zzatv implements zzbpq {
    zzbpo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpq
    public final void zze(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString("Adapter returned null.");
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpq
    public final void zzf(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpq
    public final void zzg(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpq
    public final void zzh(zzboo zzboo0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzboo0);
        this.zzbh(4, parcel0);
    }
}

