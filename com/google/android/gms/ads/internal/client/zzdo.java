package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

public final class zzdo extends zzatv implements zzdq {
    zzdo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        Parcel parcel0 = this.zzbg(5, this.zza());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        zzdt zzdt0;
        Parcel parcel0 = this.zzbg(11, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzdt0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdt0 = iInterface0 instanceof zzdt ? ((zzdt)iInterface0) : new zzdr(iBinder0);
        }
        parcel0.recycle();
        return zzdt0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        this.zzbh(1, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdt0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzdt0);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        this.zzbh(13, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        Parcel parcel0 = this.zzbg(12, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        Parcel parcel0 = this.zzbg(10, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        Parcel parcel0 = this.zzbg(4, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

