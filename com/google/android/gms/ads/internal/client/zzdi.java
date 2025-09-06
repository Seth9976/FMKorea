package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;

public abstract class zzdi extends zzatw implements zzdj {
    public zzdi() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            String s = parcel0.readString();
            IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
            IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
            zzatx.zzc(parcel0);
            this.zze(s, iObjectWrapper0, iObjectWrapper1);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

