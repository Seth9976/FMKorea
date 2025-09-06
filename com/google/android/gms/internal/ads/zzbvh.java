package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbvh extends zzatv implements zzbvj {
    zzbvh(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbvj
    public final void zze(zzbvd zzbvd0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbvd0);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvj
    public final void zzf() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvj
    public final void zzh() {
        this.zzbh(6, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvj
    public final void zzi() {
        this.zzbh(1, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvj
    public final void zzj() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvj
    public final void zzk() {
        this.zzbh(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvj
    public final void zzl() {
        this.zzbh(3, this.zza());
    }
}

