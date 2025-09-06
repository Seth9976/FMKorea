package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbvn extends zzatw implements zzbvo {
    public zzbvn() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbvo zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterface0 instanceof zzbvo ? ((zzbvo)iInterface0) : new zzbvm(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzl(iObjectWrapper0);
                break;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                int v2 = parcel0.readInt();
                zzatx.zzc(parcel0);
                this.zzk(iObjectWrapper1, v2);
                break;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzi(iObjectWrapper2);
                break;
            }
            case 4: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzj(iObjectWrapper3);
                break;
            }
            case 5: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzo(iObjectWrapper4);
                break;
            }
            case 6: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzf(iObjectWrapper5);
                break;
            }
            case 7: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                zzbvp zzbvp0 = (zzbvp)zzatx.zza(parcel0, zzbvp.CREATOR);
                zzatx.zzc(parcel0);
                this.zzm(iObjectWrapper6, zzbvp0);
                break;
            }
            case 8: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zze(iObjectWrapper7);
                break;
            }
            case 9: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                int v3 = parcel0.readInt();
                zzatx.zzc(parcel0);
                this.zzg(iObjectWrapper8, v3);
                break;
            }
            case 10: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzh(iObjectWrapper9);
                break;
            }
            case 11: {
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzn(iObjectWrapper10);
                break;
            }
            case 12: {
                Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
                zzatx.zzc(parcel0);
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

