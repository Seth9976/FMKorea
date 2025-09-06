package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public final class zzblh extends zzatv implements zzblj {
    zzblh(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzblj
    public final void zze(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzblj
    public final void zzf(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzblj
    public final void zzg(zzbld zzbld0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbld0);
        this.zzbh(1, parcel0);
    }
}

