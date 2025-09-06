package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbgj extends zzatw implements zzbgk {
    public zzbgj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbgk zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterface0 instanceof zzbgk ? ((zzbgk)iInterface0) : new zzbgi(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbgt zzbgt0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                zzbgt0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                zzbgt0 = iInterface0 instanceof zzbgt ? ((zzbgt)iInterface0) : new zzbgr(iBinder0);
            }
            zzatx.zzc(parcel0);
            this.zze(zzbgt0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

