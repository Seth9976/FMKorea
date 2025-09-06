package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzbi extends zzatv implements zzbk {
    zzbi(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        this.zzbh(1, this.zza());
    }
}

