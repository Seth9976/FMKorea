package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbvf extends zzatw implements zzbvg {
    public zzbvf() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbvj zzbvj0 = null;
        switch(v) {
            case 1: {
                zzbvk zzbvk0 = (zzbvk)zzatx.zza(parcel0, zzbvk.CREATOR);
                zzatx.zzc(parcel0);
                this.zzg(zzbvk0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                this.zzq();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbvj0 = iInterface0 instanceof zzbvj ? ((zzbvj)iInterface0) : new zzbvh(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzo(zzbvj0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                boolean z = this.zzs();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 6: {
                this.zzh();
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                this.zzj();
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.zze();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzi(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzk(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzf(iObjectWrapper2);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                String s = this.zzd();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 13: {
                String s1 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzp(s1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzby zzby0 = zzbx.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzl(zzby0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                Bundle bundle0 = this.zzb();
                parcel1.writeNoException();
                zzatx.zze(parcel1, bundle0);
                return true;
            }
            case 16: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    zzbvj0 = iInterface1 instanceof zzbve ? ((zzbve)iInterface1) : new zzbve(iBinder1);
                }
                zzatx.zzc(parcel0);
                this.zzu(((zzbve)zzbvj0));
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                parcel0.readString();
                zzatx.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzr(iObjectWrapper3);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                String s2 = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzm(s2);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                boolean z1 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 21: {
                zzdn zzdn0 = this.zzc();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdn0);
                return true;
            }
            case 34: {
                boolean z2 = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzn(z2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

