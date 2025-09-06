package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzfng extends zzatw implements zzfnh {
    public zzfng() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 2: {
                Stub.asInterface(parcel0.readStrongBinder());
                parcel0.readString();
                zzatx.zzc(parcel0);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                parcel0.createIntArray();
                zzatx.zzc(parcel0);
                break;
            }
            case 5: {
                parcel0.createByteArray();
                zzatx.zzc(parcel0);
                break;
            }
            case 6: {
                parcel0.readInt();
                zzatx.zzc(parcel0);
                break;
            }
            case 7: {
                parcel0.readInt();
                zzatx.zzc(parcel0);
                break;
            }
            case 8: {
                Stub.asInterface(parcel0.readStrongBinder());
                parcel0.readString();
                parcel0.readString();
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

