package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbvm extends zzatv implements zzbvo {
    zzbvm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zze(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzf(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzg(IObjectWrapper iObjectWrapper0, int v) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeInt(v);
        this.zzbh(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzh(IObjectWrapper iObjectWrapper0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzi(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzk(IObjectWrapper iObjectWrapper0, int v) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzl(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzm(IObjectWrapper iObjectWrapper0, zzbvp zzbvp0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzbvp0);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzn(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(11, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzo(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(5, parcel0);
    }
}

