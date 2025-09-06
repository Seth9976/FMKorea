package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzaws extends zzatv implements IInterface {
    zzaws(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzawq zzawq0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzawq0);
        Parcel parcel1 = this.zzbg(3, parcel0);
        long v = parcel1.readLong();
        parcel1.recycle();
        return v;
    }

    public final zzawn zzf(zzawq zzawq0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzawq0);
        Parcel parcel1 = this.zzbg(1, parcel0);
        zzawn zzawn0 = (zzawn)zzatx.zza(parcel1, zzawn.CREATOR);
        parcel1.recycle();
        return zzawn0;
    }

    public final zzawn zzg(zzawq zzawq0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzawq0);
        Parcel parcel1 = this.zzbg(2, parcel0);
        zzawn zzawn0 = (zzawn)zzatx.zza(parcel1, zzawn.CREATOR);
        parcel1.recycle();
        return zzawn0;
    }
}

