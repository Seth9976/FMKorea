package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;

public final class zzdr extends zzatv implements zzdt {
    zzdr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        this.zzbh(3, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        this.zzbh(1, this.zza());
    }
}

