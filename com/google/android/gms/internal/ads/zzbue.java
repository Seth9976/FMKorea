package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;

public final class zzbue extends zzatv implements zzbug {
    zzbue(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zze(zzaz zzaz0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzaz0);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, parcelFileDescriptor0);
        this.zzbh(1, parcel0);
    }
}

