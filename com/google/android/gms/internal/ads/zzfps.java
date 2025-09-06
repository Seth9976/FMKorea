package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class zzfps extends zzatv implements zzfpu {
    zzfps(IBinder iBinder0) {
        super(iBinder0, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override  // com.google.android.gms.internal.ads.zzfpu
    public final void zze(Bundle bundle0, zzfpw zzfpw0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, bundle0);
        zzatx.zzf(parcel0, zzfpw0);
        this.zzbi(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpu
    public final void zzf(String s, Bundle bundle0, zzfpw zzfpw0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzatx.zzd(parcel0, bundle0);
        zzatx.zzf(parcel0, zzfpw0);
        this.zzbi(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpu
    public final void zzg(Bundle bundle0, zzfpw zzfpw0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, bundle0);
        zzatx.zzf(parcel0, zzfpw0);
        this.zzbi(3, parcel0);
    }
}

