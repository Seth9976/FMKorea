package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public abstract class zzbkf extends zzatw implements zzbkg {
    public zzbkf() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int v, Parcel parcel0, Parcel parcel1, int v1) {
        if(v == 1) {
            ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)zzatx.zza(parcel0, ParcelFileDescriptor.CREATOR);
            zzatx.zzc(parcel0);
            this.zzb(parcelFileDescriptor0);
            return true;
        }
        return false;
    }
}

