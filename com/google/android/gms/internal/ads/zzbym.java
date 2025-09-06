package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzbym extends zzatv implements zzbyo {
    zzbym(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyo
    public final void zzb(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyo
    public final void zzc(String s, String s1, Bundle bundle0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, bundle0);
        this.zzbh(3, parcel0);
    }
}

