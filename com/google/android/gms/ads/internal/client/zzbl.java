package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzbl extends zzatv implements zzbn {
    zzbl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzl0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzl0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzl0, int v) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeInt(v);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

