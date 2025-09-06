package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzbtl extends zzatw implements zzbtm {
    public zzbtl() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            this.zzb();
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

