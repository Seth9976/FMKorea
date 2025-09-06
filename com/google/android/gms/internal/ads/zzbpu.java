package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbpu extends zzatv implements zzbpw {
    zzbpu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpw
    public final void zze(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString("Adapter returned null.");
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpw
    public final void zzf(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpw
    public final void zzg(zzbou zzbou0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbou0);
        this.zzbh(1, parcel0);
    }
}

