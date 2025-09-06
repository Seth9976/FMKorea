package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import java.util.List;

public abstract class zzdm extends zzatw implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdn zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterface0 instanceof zzdn ? ((zzdn)iInterface0) : new zzdl(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                String s = this.zzg();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                String s1 = this.zzi();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 3: {
                List list0 = this.zzj();
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 4: {
                zzu zzu0 = this.zzf();
                parcel1.writeNoException();
                zzatx.zze(parcel1, zzu0);
                return true;
            }
            case 5: {
                Bundle bundle0 = this.zze();
                parcel1.writeNoException();
                zzatx.zze(parcel1, bundle0);
                return true;
            }
            case 6: {
                String s2 = this.zzh();
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

