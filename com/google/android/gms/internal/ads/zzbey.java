package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbey extends zzatv implements zzbfa {
    zzbey(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final IObjectWrapper zzb(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzbg(2, parcel0);
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel1.readStrongBinder());
        parcel1.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbA(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbB(zzbet zzbet0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbet0);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbC(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbD(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbz(String s, IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzc() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zze(IObjectWrapper iObjectWrapper0, int v) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeInt(v);
        this.zzbh(5, parcel0);
    }
}

