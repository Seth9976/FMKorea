package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbor extends zzatv implements IInterface {
    zzbor(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel parcel0 = this.zzbg(13, this.zza());
        Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    public final zzdq zzf() {
        Parcel parcel0 = this.zzbg(16, this.zza());
        zzdq zzdq0 = zzdp.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdq0;
    }

    public final zzbeo zzg() {
        Parcel parcel0 = this.zzbg(19, this.zza());
        zzbeo zzbeo0 = zzben.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbeo0;
    }

    public final zzbew zzh() {
        Parcel parcel0 = this.zzbg(5, this.zza());
        zzbew zzbew0 = zzbev.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbew0;
    }

    public final IObjectWrapper zzi() {
        Parcel parcel0 = this.zzbg(15, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final IObjectWrapper zzj() {
        Parcel parcel0 = this.zzbg(20, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final IObjectWrapper zzk() {
        Parcel parcel0 = this.zzbg(21, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final String zzl() {
        Parcel parcel0 = this.zzbg(7, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzm() {
        Parcel parcel0 = this.zzbg(4, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzn() {
        Parcel parcel0 = this.zzbg(6, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzo() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final List zzp() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        List list0 = zzatx.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    public final void zzq(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(9, parcel0);
    }

    public final void zzr() {
        this.zzbh(8, this.zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(10, parcel0);
    }

    public final void zzt(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, iObjectWrapper1);
        zzatx.zzf(parcel0, iObjectWrapper2);
        this.zzbh(22, parcel0);
    }

    public final void zzu(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(14, parcel0);
    }

    public final boolean zzv() {
        Parcel parcel0 = this.zzbg(12, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    public final boolean zzw() {
        Parcel parcel0 = this.zzbg(11, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

