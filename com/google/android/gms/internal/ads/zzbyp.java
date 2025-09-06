package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbyp extends zzatv implements zzbyr {
    zzbyp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zze(IObjectWrapper iObjectWrapper0, zzbyv zzbyv0, zzbyo zzbyo0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzbyv0);
        zzatx.zzf(parcel0, zzbyo0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(zzbta zzbta0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbta0);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0) {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbsr0);
        this.zzbh(10, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0) {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbsr0);
        this.zzbh(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzk(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0) {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbsr0);
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzl(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0) {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbsr0);
        this.zzbh(5, parcel0);
    }
}

