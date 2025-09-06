package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzbf extends zzatv implements zzbh {
    zzbf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        this.zzbh(6, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        this.zzbh(1, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        this.zzbh(7, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        this.zzbh(3, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        this.zzbh(5, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
        this.zzbh(9, this.zza());
    }
}

