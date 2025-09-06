package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public final class zzavz extends zzatv implements zzawb {
    zzavz(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzawb
    public final void zzb(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzawb
    public final void zzc(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzawb
    public final void zzd(zzavy zzavy0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzavy0);
        this.zzbh(1, parcel0);
    }
}

