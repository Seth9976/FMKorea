package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbvx extends zzatv implements zzbvz {
    zzbvx(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zze() {
        this.zzbh(7, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzf() {
        this.zzbh(6, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzg() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzh(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzi(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzj() {
        this.zzbh(1, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzk(zzbvt zzbvt0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbvt0);
        this.zzbh(3, parcel0);
    }
}

