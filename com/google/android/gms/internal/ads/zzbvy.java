package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbvy extends zzatw implements zzbvz {
    public zzbvy() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        zzbvt zzbvt0;
        switch(v) {
            case 1: {
                this.zzj();
                break;
            }
            case 2: {
                this.zzg();
                break;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    zzbvt0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbvt0 = iInterface0 instanceof zzbvt ? ((zzbvt)iInterface0) : new zzbvr(iBinder0);
                }
                zzatx.zzc(parcel0);
                this.zzk(zzbvt0);
                break;
            }
            case 4: {
                int v2 = parcel0.readInt();
                zzatx.zzc(parcel0);
                this.zzh(v2);
                break;
            }
            case 5: {
                zze zze0 = (zze)zzatx.zza(parcel0, zze.CREATOR);
                zzatx.zzc(parcel0);
                this.zzi(zze0);
                break;
            }
            case 6: {
                this.zzf();
                break;
            }
            case 7: {
                this.zze();
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

