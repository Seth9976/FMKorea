package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbfv extends zzatv implements zzbfx {
    zzbfv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfx
    public final void zze(zzbfn zzbfn0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbfn0);
        this.zzbh(1, parcel0);
    }
}

