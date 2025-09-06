package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbfe extends zzatv implements zzbfg {
    zzbfe(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfg
    public final void zzb(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfg
    public final void zzc(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfg
    public final void zzd() {
        this.zzbh(2, this.zza());
    }
}

