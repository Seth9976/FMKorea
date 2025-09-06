package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzfpv extends zzatw implements zzfpw {
    public zzfpv() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
            zzatx.zzc(parcel0);
            this.zzb(bundle0);
            return true;
        }
        return false;
    }
}

