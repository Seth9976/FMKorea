package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbrt extends zzatv implements zzbrv {
    zzbrt(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zze(Intent intent0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, intent0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zzf(String[] arr_s, int[] arr_v, IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        parcel0.writeStringArray(arr_s);
        parcel0.writeIntArray(arr_v);
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zzg(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zzh() {
        this.zzbh(3, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zzi(IObjectWrapper iObjectWrapper0, String s, String s1) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzbh(2, parcel0);
    }
}

