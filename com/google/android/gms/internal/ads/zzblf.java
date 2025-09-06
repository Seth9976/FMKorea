package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzblf extends zzatw implements zzblg {
    public zzblf() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v != 1) {
            if(v != 2) {
                return false;
            }
            parcel0.readInt();
            zzatx.zzc(parcel0);
        }
        parcel1.writeNoException();
        return true;
    }
}

