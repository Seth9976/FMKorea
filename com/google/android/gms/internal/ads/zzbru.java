package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbru extends zzatw implements zzbrv {
    public zzbru() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbrv zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterface0 instanceof zzbrv ? ((zzbrv)iInterface0) : new zzbrt(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                Intent intent0 = (Intent)zzatx.zza(parcel0, Intent.CREATOR);
                zzatx.zzc(parcel0);
                this.zze(intent0);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzi(iObjectWrapper2, s, s1);
                break;
            }
            case 3: {
                this.zzh();
                break;
            }
            case 4: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzg(iObjectWrapper1);
                break;
            }
            case 5: {
                String[] arr_s = parcel0.createStringArray();
                int[] arr_v = parcel0.createIntArray();
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzf(arr_s, arr_v, iObjectWrapper0);
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

