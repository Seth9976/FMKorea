package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbeu extends zzatv implements zzbew {
    zzbeu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override  // com.google.android.gms.internal.ads.zzbew
    public final double zzb() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbew
    public final int zzc() {
        Parcel parcel0 = this.zzbg(5, this.zza());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbew
    public final int zzd() {
        Parcel parcel0 = this.zzbg(4, this.zza());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbew
    public final Uri zze() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        Uri uri0 = (Uri)zzatx.zza(parcel0, Uri.CREATOR);
        parcel0.recycle();
        return uri0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbew
    public final IObjectWrapper zzf() {
        Parcel parcel0 = this.zzbg(1, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }
}

