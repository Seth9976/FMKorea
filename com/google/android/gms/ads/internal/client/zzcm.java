package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbof;
import java.util.List;

public final class zzcm extends zzatv implements zzco {
    zzcm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        Parcel parcel0 = this.zzbg(7, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        Parcel parcel0 = this.zzbg(9, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        Parcel parcel0 = this.zzbg(13, this.zza());
        List list0 = parcel0.createTypedArrayList(zzbko.CREATOR);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(10, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzbh(15, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(17, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        this.zzbh(1, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String s, IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(null);
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzda0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzda0);
        this.zzbh(16, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper0, String s) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbof zzbof0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbof0);
        this.zzbh(11, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(4, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) {
        Parcel parcel0 = this.zza();
        parcel0.writeFloat(f);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String s) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkv zzbkv0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbkv0);
        this.zzbh(12, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(18, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzff0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzff0);
        this.zzbh(14, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        Parcel parcel0 = this.zzbg(8, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

