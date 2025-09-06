package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzbyn extends zzatw implements zzbyo {
    public zzbyn() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                parcel0.readString();
                parcel0.readString();
                zzatx.zzc(parcel0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                zzatx.zzc(parcel0);
                this.zzb(s);
                break;
            }
            case 3: {
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
                zzatx.zzc(parcel0);
                this.zzc(s1, s2, bundle0);
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

