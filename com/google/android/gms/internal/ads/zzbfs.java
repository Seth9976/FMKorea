package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbfs extends zzatv implements zzbfu {
    zzbfs(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfu
    public final void zze(zzbfl zzbfl0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbfl0);
        this.zzbh(1, parcel0);
    }
}

