package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbpr extends zzatv implements zzbpt {
    zzbpr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zze(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString("Adapter returned null.");
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzf(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzg() {
        this.zzbh(2, this.zza());
    }
}

