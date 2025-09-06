package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbgb extends zzatv implements zzbgd {
    zzbgb(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgd
    public final void zze(zzbfq zzbfq0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbfq0);
        this.zzbh(1, parcel0);
    }
}

