package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzbfz extends zzatw implements zzbga {
    public zzbfz() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbga zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterface0 instanceof zzbga ? ((zzbga)iInterface0) : new zzbfy(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbfq zzbfq0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                zzbfq0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                zzbfq0 = iInterface0 instanceof zzbfq ? ((zzbfq)iInterface0) : new zzbfo(iBinder0);
            }
            String s = parcel0.readString();
            zzatx.zzc(parcel0);
            this.zze(zzbfq0, s);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

