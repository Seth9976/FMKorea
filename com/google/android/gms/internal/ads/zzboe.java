package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzboe extends zzatw implements zzbof {
    public zzboe() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                zzatx.zzc(parcel0);
                zzboi zzboi0 = this.zzb(s);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzboi0);
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                zzatx.zzc(parcel0);
                boolean z = this.zze(s1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 3: {
                String s2 = parcel0.readString();
                zzatx.zzc(parcel0);
                zzbqc zzbqc0 = this.zzc(s2);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbqc0);
                return true;
            }
            case 4: {
                String s3 = parcel0.readString();
                zzatx.zzc(parcel0);
                boolean z1 = this.zzd(s3);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbof zzf(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterface0 instanceof zzbof ? ((zzbof)iInterface0) : new zzbod(iBinder0);
    }
}

