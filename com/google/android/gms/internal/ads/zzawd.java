package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public final class zzawd extends zzatv implements zzawf {
    zzawd(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzawf
    public final void zzb() {
        this.zzbh(5, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzawf
    public final void zzc() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzawf
    public final void zzd(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzawf
    public final void zze() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzawf
    public final void zzf() {
        this.zzbh(1, this.zza());
    }
}

