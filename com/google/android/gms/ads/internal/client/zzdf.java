package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;

public abstract class zzdf extends zzatw implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterface0 instanceof zzdg ? ((zzdg)iInterface0) : new zzde(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                zzs zzs0 = (zzs)zzatx.zza(parcel0, zzs.CREATOR);
                zzatx.zzc(parcel0);
                this.zze(zzs0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                boolean z = this.zzf();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

