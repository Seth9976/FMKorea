package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import java.util.List;

public final class zzdl extends zzatv implements zzdn {
    zzdl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        Parcel parcel0 = this.zzbg(5, this.zza());
        Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        Parcel parcel0 = this.zzbg(4, this.zza());
        zzu zzu0 = (zzu)zzatx.zza(parcel0, zzu.CREATOR);
        parcel0.recycle();
        return zzu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        Parcel parcel0 = this.zzbg(1, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        Parcel parcel0 = this.zzbg(6, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        List list0 = parcel0.createTypedArrayList(zzu.CREATOR);
        parcel0.recycle();
        return list0;
    }
}

