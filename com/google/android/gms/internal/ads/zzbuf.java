package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;

public abstract class zzbuf extends zzatw implements zzbug {
    public zzbuf() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        switch(v) {
            case 1: {
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)zzatx.zza(parcel0, ParcelFileDescriptor.CREATOR);
                zzatx.zzc(parcel0);
                this.zzf(parcelFileDescriptor0);
                break;
            }
            case 2: {
                zzaz zzaz0 = (zzaz)zzatx.zza(parcel0, zzaz.CREATOR);
                zzatx.zzc(parcel0);
                this.zze(zzaz0);
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

