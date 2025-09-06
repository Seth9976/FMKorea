package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzfnf extends zzatv implements zzfnh {
    zzfnf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override  // com.google.android.gms.internal.ads.zzfnh
    public final void zze(IObjectWrapper iObjectWrapper0, String s, String s1) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(null);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfnh
    public final void zzf() {
        this.zzbh(3, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzfnh
    public final void zzg(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfnh
    public final void zzh(int[] arr_v) {
        Parcel parcel0 = this.zza();
        parcel0.writeIntArray(null);
        this.zzbh(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfnh
    public final void zzi(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfnh
    public final void zzj(byte[] arr_b) {
        Parcel parcel0 = this.zza();
        parcel0.writeByteArray(arr_b);
        this.zzbh(5, parcel0);
    }
}

