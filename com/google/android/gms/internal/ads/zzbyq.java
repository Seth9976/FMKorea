package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

public abstract class zzbyq extends zzatw implements zzbyr {
    public zzbyq() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbyr zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterface0 instanceof zzbyr ? ((zzbyr)iInterface0) : new zzbyp(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbyo zzbyo0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzbyv zzbyv0 = (zzbyv)zzatx.zza(parcel0, zzbyv.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbyo0 = iInterface0 instanceof zzbyo ? ((zzbyo)iInterface0) : new zzbym(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zze(iObjectWrapper0, zzbyv0, zzbyo0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzj(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                Stub.asInterface(parcel0.readStrongBinder());
                Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, null);
                return true;
            }
            case 4: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, null);
                return true;
            }
            case 5: {
                ArrayList arrayList0 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzbsr zzbsr0 = zzbsq.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzl(arrayList0, iObjectWrapper2, zzbsr0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                ArrayList arrayList1 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzbsr zzbsr1 = zzbsq.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzk(arrayList1, iObjectWrapper3, zzbsr1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzbta zzbta0 = (zzbta)zzatx.zza(parcel0, zzbta.CREATOR);
                zzatx.zzc(parcel0);
                this.zzf(zzbta0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzi(iObjectWrapper4);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                ArrayList arrayList2 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzbsr zzbsr2 = zzbsq.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzh(arrayList2, iObjectWrapper5, zzbsr2);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                ArrayList arrayList3 = parcel0.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzbsr zzbsr3 = zzbsq.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzg(arrayList3, iObjectWrapper6, zzbsr3);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

