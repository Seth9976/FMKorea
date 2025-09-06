package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbwc extends zzatw implements zzbwd {
    public zzbwc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                this.zzg();
                break;
            }
            case 2: {
                int v2 = parcel0.readInt();
                zzatx.zzc(parcel0);
                this.zze(v2);
                break;
            }
            case 3: {
                zze zze0 = (zze)zzatx.zza(parcel0, zze.CREATOR);
                zzatx.zzc(parcel0);
                this.zzf(zze0);
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

