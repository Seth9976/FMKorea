package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;

public abstract class zzcz extends zzatw implements zzda {
    public zzcz() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            zze zze0 = (zze)zzatx.zza(parcel0, zze.CREATOR);
            zzatx.zzc(parcel0);
            this.zze(zze0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

