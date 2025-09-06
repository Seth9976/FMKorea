package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzavw extends zzatv implements zzavy {
    zzavw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final zzbu zze() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final zzdn zzf() {
        Parcel parcel0 = this.zzbg(5, this.zza());
        zzdn zzdn0 = zzdm.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final void zzg(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final void zzh(zzdg zzdg0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzdg0);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzavy
    public final void zzi(IObjectWrapper iObjectWrapper0, zzawf zzawf0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzawf0);
        this.zzbh(4, parcel0);
    }
}

