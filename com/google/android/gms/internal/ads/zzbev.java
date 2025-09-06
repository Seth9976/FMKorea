package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbev extends zzatw implements zzbew {
    public zzbev() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zzf();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                Uri uri0 = this.zze();
                parcel1.writeNoException();
                zzatx.zze(parcel1, uri0);
                return true;
            }
            case 3: {
                double f = this.zzb();
                parcel1.writeNoException();
                parcel1.writeDouble(f);
                return true;
            }
            case 4: {
                int v3 = this.zzd();
                parcel1.writeNoException();
                parcel1.writeInt(v3);
                return true;
            }
            case 5: {
                int v2 = this.zzc();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbew zzg(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterface0 instanceof zzbew ? ((zzbew)iInterface0) : new zzbeu(iBinder0);
    }
}

