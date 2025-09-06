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

public final class zzboq extends zzatv implements IInterface {
    zzboq(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() {
        Parcel parcel0 = this.zzbg(7, this.zza());
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    public final Bundle zzf() {
        Parcel parcel0 = this.zzbg(15, this.zza());
        Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    public final zzdq zzg() {
        Parcel parcel0 = this.zzbg(17, this.zza());
        zzdq zzdq0 = zzdp.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdq0;
    }

    public final zzbeo zzh() {
        Parcel parcel0 = this.zzbg(19, this.zza());
        zzbeo zzbeo0 = zzben.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbeo0;
    }

    public final zzbew zzi() {
        Parcel parcel0 = this.zzbg(5, this.zza());
        zzbew zzbew0 = zzbev.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbew0;
    }

    public final IObjectWrapper zzj() {
        Parcel parcel0 = this.zzbg(18, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final IObjectWrapper zzk() {
        Parcel parcel0 = this.zzbg(20, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final IObjectWrapper zzl() {
        Parcel parcel0 = this.zzbg(21, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
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

    public final String zzp() {
        Parcel parcel0 = this.zzbg(9, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzq() {
        Parcel parcel0 = this.zzbg(8, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final List zzr() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        List list0 = zzatx.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    public final void zzs(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(11, parcel0);
    }

    public final void zzt() {
        this.zzbh(10, this.zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(12, parcel0);
    }

    public final void zzv(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, iObjectWrapper1);
        zzatx.zzf(parcel0, iObjectWrapper2);
        this.zzbh(22, parcel0);
    }

    public final void zzw(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(16, parcel0);
    }

    public final boolean zzx() {
        Parcel parcel0 = this.zzbg(14, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    public final boolean zzy() {
        Parcel parcel0 = this.zzbg(13, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

