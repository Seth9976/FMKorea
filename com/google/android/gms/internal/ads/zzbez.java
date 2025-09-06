package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbez extends zzatw implements zzbfa {
    public zzbez() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbfa zzbE(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterface0 instanceof zzbfa ? ((zzbfa)iInterface0) : new zzbey(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbet zzbet0;
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzbz(s, iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                zzatx.zzc(parcel0);
                IObjectWrapper iObjectWrapper1 = this.zzb(s1);
                parcel1.writeNoException();
                zzatx.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzbD(iObjectWrapper2);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zzc();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                Stub.asInterface(parcel0.readStrongBinder());
                parcel0.readInt();
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzbA(iObjectWrapper3);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzd(iObjectWrapper4);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbet0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbet0 = iInterface0 instanceof zzbet ? ((zzbet)iInterface0) : new zzber(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzbB(zzbet0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzbC(iObjectWrapper5);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

