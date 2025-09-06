package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbtx extends zzatv implements zzbtz {
    zzbtx(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override  // com.google.android.gms.internal.ads.zzbtz
    public final void zze(zzbun zzbun0, zzbuj zzbuj0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbun0);
        zzatx.zzf(parcel0, zzbuj0);
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbtz
    public final void zzf(zzbun zzbun0, zzbuj zzbuj0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbun0);
        zzatx.zzf(parcel0, zzbuj0);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(zzbun zzbun0, zzbuj zzbuj0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbun0);
        zzatx.zzf(parcel0, zzbuj0);
        this.zzbh(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbtz
    public final void zzh(String s, zzbuj zzbuj0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbuj0);
        this.zzbh(7, parcel0);
    }
}

