package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzble extends zzatv implements zzblg {
    zzble(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzblg
    public final void zze(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzblg
    public final void zzf() {
        this.zzbh(1, this.zza());
    }
}

