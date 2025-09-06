package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbvv extends zzatw implements zzbvw {
    public zzbvv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbwd zzbwd0 = null;
        switch(v) {
            case 1: {
                zzl zzl0 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwd0 = iInterface0 instanceof zzbwd ? ((zzbwd)iInterface0) : new zzbwb(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzf(zzl0, zzbwd0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwd0 = iInterface1 instanceof zzbvz ? ((zzbvz)iInterface1) : new zzbvx(iBinder1);
                }
                zzatx.zzc(parcel0);
                this.zzk(((zzbvz)zzbwd0));
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = this.zzo();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 4: {
                String s = this.zze();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 5: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzm(iObjectWrapper0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwd0 = iInterface2 instanceof zzbwe ? ((zzbwe)iInterface2) : new zzbwe(iBinder2);
                }
                zzatx.zzc(parcel0);
                this.zzp(((zzbwe)zzbwd0));
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzbwk zzbwk0 = (zzbwk)zzatx.zza(parcel0, zzbwk.CREATOR);
                zzatx.zzc(parcel0);
                this.zzl(zzbwk0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                zzdd zzdd0 = zzdc.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzi(zzdd0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                Bundle bundle0 = this.zzb();
                parcel1.writeNoException();
                zzatx.zze(parcel1, bundle0);
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                boolean z1 = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzn(iObjectWrapper1, z1);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzbvt zzbvt0 = this.zzd();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzbvt0);
                return true;
            }
            case 12: {
                zzdn zzdn0 = this.zzc();
                parcel1.writeNoException();
                zzatx.zzf(parcel1, zzdn0);
                return true;
            }
            case 13: {
                zzdg zzdg0 = zzdf.zzb(parcel0.readStrongBinder());
                zzatx.zzc(parcel0);
                this.zzj(zzdg0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzl zzl1 = (zzl)zzatx.zza(parcel0, zzl.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwd0 = iInterface3 instanceof zzbwd ? ((zzbwd)iInterface3) : new zzbwb(iBinder3);
                }
                zzatx.zzc(parcel0);
                this.zzg(zzl1, zzbwd0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                boolean z2 = zzatx.zzg(parcel0);
                zzatx.zzc(parcel0);
                this.zzh(z2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static zzbvw zzq(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterface0 instanceof zzbvw ? ((zzbvw)iInterface0) : new zzbvu(iBinder0);
    }
}

