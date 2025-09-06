package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbos extends zzatv implements zzbou {
    zzbos(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final boolean zzA() {
        Parcel parcel0 = this.zzbg(18, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final boolean zzB() {
        Parcel parcel0 = this.zzbg(17, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final double zze() {
        Parcel parcel0 = this.zzbg(8, this.zza());
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final float zzf() {
        Parcel parcel0 = this.zzbg(23, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final float zzg() {
        Parcel parcel0 = this.zzbg(25, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final float zzh() {
        Parcel parcel0 = this.zzbg(24, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final Bundle zzi() {
        Parcel parcel0 = this.zzbg(16, this.zza());
        Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final zzdq zzj() {
        Parcel parcel0 = this.zzbg(11, this.zza());
        zzdq zzdq0 = zzdp.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final zzbeo zzk() {
        Parcel parcel0 = this.zzbg(12, this.zza());
        zzbeo zzbeo0 = zzben.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbeo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final zzbew zzl() {
        Parcel parcel0 = this.zzbg(5, this.zza());
        zzbew zzbew0 = zzbev.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbew0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final IObjectWrapper zzm() {
        Parcel parcel0 = this.zzbg(13, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final IObjectWrapper zzn() {
        Parcel parcel0 = this.zzbg(14, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final IObjectWrapper zzo() {
        Parcel parcel0 = this.zzbg(15, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final String zzp() {
        Parcel parcel0 = this.zzbg(7, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final String zzq() {
        Parcel parcel0 = this.zzbg(4, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final String zzr() {
        Parcel parcel0 = this.zzbg(6, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final String zzs() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final String zzt() {
        Parcel parcel0 = this.zzbg(10, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final String zzu() {
        Parcel parcel0 = this.zzbg(9, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final List zzv() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        List list0 = zzatx.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final void zzw(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(20, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final void zzx() {
        this.zzbh(19, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final void zzy(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, iObjectWrapper1);
        zzatx.zzf(parcel0, iObjectWrapper2);
        this.zzbh(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbou
    public final void zzz(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(22, parcel0);
    }
}

