package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzfmo extends zzatv implements IInterface {
    zzfmo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfmm zze(zzfmk zzfmk0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzfmk0);
        Parcel parcel1 = this.zzbg(1, parcel0);
        zzfmm zzfmm0 = (zzfmm)zzatx.zza(parcel1, zzfmm.CREATOR);
        parcel1.recycle();
        return zzfmm0;
    }

    public final zzfmv zzf(zzfmt zzfmt0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzfmt0);
        Parcel parcel1 = this.zzbg(3, parcel0);
        zzfmv zzfmv0 = (zzfmv)zzatx.zza(parcel1, zzfmv.CREATOR);
        parcel1.recycle();
        return zzfmv0;
    }

    public final void zzg(zzfmh zzfmh0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzfmh0);
        this.zzbh(2, parcel0);
    }
}

