package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzcg extends zzatv implements zzci {
    zzcg(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() {
        this.zzbh(5, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() {
        this.zzbh(3, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zze() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() {
        this.zzbh(2, this.zza());
    }
}

