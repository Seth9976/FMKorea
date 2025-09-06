package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.List;

public final class zzfm extends zzbu implements zzfk {
    zzfm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final zzam zza(zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzo0);
        Parcel parcel1 = this.zza(21, parcel0);
        zzam zzam0 = (zzam)zzbw.zza(parcel1, zzam.CREATOR);
        parcel1.recycle();
        return zzam0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(zzo zzo0, Bundle bundle0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzo0);
        zzbw.zza(parcel0, bundle0);
        Parcel parcel1 = this.zza(24, parcel0);
        List list0 = parcel1.createTypedArrayList(zzmh.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(zzo zzo0, boolean z) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzo0);
        zzbw.zza(parcel0, z);
        Parcel parcel1 = this.zza(7, parcel0);
        List list0 = parcel1.createTypedArrayList(zznc.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(String s, String s1, zzo zzo0) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, zzo0);
        Parcel parcel1 = this.zza(16, parcel0);
        List list0 = parcel1.createTypedArrayList(zzad.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(String s, String s1, String s2) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        Parcel parcel1 = this.zza(17, parcel0);
        List list0 = parcel1.createTypedArrayList(zzad.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(String s, String s1, String s2, boolean z) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        zzbw.zza(parcel0, z);
        Parcel parcel1 = this.zza(15, parcel0);
        List list0 = parcel1.createTypedArrayList(zznc.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(String s, String s1, boolean z, zzo zzo0) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, z);
        zzbw.zza(parcel0, zzo0);
        Parcel parcel1 = this.zza(14, parcel0);
        List list0 = parcel1.createTypedArrayList(zznc.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(long v, String s, String s1, String s2) {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        this.zzb(10, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(Bundle bundle0, zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        zzbw.zza(parcel0, zzo0);
        this.zzb(19, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zzad zzad0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzad0);
        this.zzb(13, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zzad zzad0, zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzad0);
        zzbw.zza(parcel0, zzo0);
        this.zzb(12, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zzbg zzbg0, zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzbg0);
        zzbw.zza(parcel0, zzo0);
        this.zzb(1, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zzbg zzbg0, String s, String s1) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzbg0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzb(5, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zznc zznc0, zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zznc0);
        zzbw.zza(parcel0, zzo0);
        this.zzb(2, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final byte[] zza(zzbg zzbg0, String s) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzbg0);
        parcel0.writeString(s);
        Parcel parcel1 = this.zza(9, parcel0);
        byte[] arr_b = parcel1.createByteArray();
        parcel1.recycle();
        return arr_b;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final String zzb(zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzo0);
        Parcel parcel1 = this.zza(11, parcel0);
        String s = parcel1.readString();
        parcel1.recycle();
        return s;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zzc(zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzo0);
        this.zzb(4, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zzd(zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzo0);
        this.zzb(18, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zze(zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzo0);
        this.zzb(20, parcel0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zzf(zzo zzo0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzo0);
        this.zzb(6, parcel0);
    }
}

