package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

public abstract class zzbsq extends zzatw implements zzbsr {
    public zzbsq() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbsr zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterface0 instanceof zzbsr ? ((zzbsr)iInterface0) : new zzbsp(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(Uri.CREATOR);
                zzatx.zzc(parcel0);
                this.zzf(arrayList0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zze(s);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

