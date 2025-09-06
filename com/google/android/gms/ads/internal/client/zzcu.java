package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;

public final class zzcu extends zzatv implements zzcw {
    zzcu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcw
    public final String zze() {
        Parcel parcel0 = this.zzbg(1, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcw
    public final String zzf() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }
}

