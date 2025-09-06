package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzde extends zzatv implements zzdg {
    zzde(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdg
    public final void zze(zzs zzs0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzs0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

