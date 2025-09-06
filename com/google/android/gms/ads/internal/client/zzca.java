package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;

public abstract class zzca extends zzatw implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            zzatx.zzc(parcel0);
            this.zzc(s, s1);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }

    public static zzcb zzd(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterface0 instanceof zzcb ? ((zzcb)iInterface0) : new zzbz(iBinder0);
    }
}

