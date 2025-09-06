package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbsa extends zzatv implements zzbsc {
    zzbsa(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final boolean zzG() {
        Parcel parcel0 = this.zzbg(11, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzh(int v, int v1, Intent intent0) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        parcel0.writeInt(v1);
        zzatx.zzd(parcel0, intent0);
        this.zzbh(12, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzi() {
        this.zzbh(10, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzk(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(13, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzl(Bundle bundle0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, bundle0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzm() {
        this.zzbh(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzo() {
        this.zzbh(5, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzp(int v, String[] arr_s, int[] arr_v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        parcel0.writeStringArray(arr_s);
        parcel0.writeIntArray(arr_v);
        this.zzbh(15, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzq() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzr() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzs(Bundle bundle0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, bundle0);
        Parcel parcel1 = this.zzbg(6, parcel0);
        if(parcel1.readInt() != 0) {
            bundle0.readFromParcel(parcel1);
        }
        parcel1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzt() {
        this.zzbh(3, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzu() {
        this.zzbh(7, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzv() {
        this.zzbh(14, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzx() {
        this.zzbh(9, this.zza());
    }
}

