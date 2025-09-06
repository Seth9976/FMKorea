package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbog extends zzatv implements zzboi {
    zzbog(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzA(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(28, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzB(zzl zzl0, String s, String s1) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzC(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(0x20, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzD(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzE() {
        this.zzbh(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzF() {
        this.zzbh(9, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzG(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(25, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzH(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(39, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzI() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzJ(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(37, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzK(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(30, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzL() {
        this.zzbh(12, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final boolean zzM() {
        Parcel parcel0 = this.zzbg(22, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final boolean zzN() {
        Parcel parcel0 = this.zzbg(13, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzboq zzO() {
        zzboq zzboq0;
        Parcel parcel0 = this.zzbg(15, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzboq0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzboq0 = iInterface0 instanceof zzboq ? ((zzboq)iInterface0) : new zzboq(iBinder0);
        }
        parcel0.recycle();
        return zzboq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbor zzP() {
        zzbor zzbor0;
        Parcel parcel0 = this.zzbg(16, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbor0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbor0 = iInterface0 instanceof zzbor ? ((zzbor)iInterface0) : new zzbor(iBinder0);
        }
        parcel0.recycle();
        return zzbor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final Bundle zze() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final Bundle zzf() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final Bundle zzg() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzdq zzh() {
        Parcel parcel0 = this.zzbg(26, this.zza());
        zzdq zzdq0 = zzdp.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbfq zzi() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzboo zzj() {
        zzboo zzboo0;
        Parcel parcel0 = this.zzbg(36, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzboo0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzboo0 = iInterface0 instanceof zzboo ? ((zzboo)iInterface0) : new zzbom(iBinder0);
        }
        parcel0.recycle();
        return zzboo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbou zzk() {
        zzbou zzbou0;
        Parcel parcel0 = this.zzbg(27, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbou0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbou0 = iInterface0 instanceof zzbou ? ((zzbou)iInterface0) : new zzbos(iBinder0);
        }
        parcel0.recycle();
        return zzbou0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbqq zzl() {
        Parcel parcel0 = this.zzbg(33, this.zza());
        zzbqq zzbqq0 = (zzbqq)zzatx.zza(parcel0, zzbqq.CREATOR);
        parcel0.recycle();
        return zzbqq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final zzbqq zzm() {
        Parcel parcel0 = this.zzbg(34, this.zza());
        zzbqq zzbqq0 = (zzbqq)zzatx.zza(parcel0, zzbqq.CREATOR);
        parcel0.recycle();
        return zzbqq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final IObjectWrapper zzn() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzo() {
        this.zzbh(5, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzp(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbvo zzbvo0, String s1) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(null);
        zzatx.zzf(parcel0, zzbvo0);
        parcel0.writeString(s1);
        this.zzbh(10, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzq(IObjectWrapper iObjectWrapper0, zzbks zzbks0, List list0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbks0);
        parcel0.writeTypedList(list0);
        this.zzbh(0x1F, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzr(IObjectWrapper iObjectWrapper0, zzbvo zzbvo0, List list0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbvo0);
        parcel0.writeStringList(list0);
        this.zzbh(23, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzs(zzl zzl0, String s) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(s);
        this.zzbh(11, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzt(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(38, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzu(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, zzbol zzbol0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzv(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, String s1, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzq0);
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzw(IObjectWrapper iObjectWrapper0, zzq zzq0, zzl zzl0, String s, String s1, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzq0);
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(35, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzx(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, zzbol zzbol0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzy(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, String s1, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzboi
    public final void zzz(IObjectWrapper iObjectWrapper0, zzl zzl0, String s, String s1, zzbol zzbol0, zzbek zzbek0, List list0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzl0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzf(parcel0, zzbol0);
        zzatx.zzd(parcel0, zzbek0);
        parcel0.writeStringList(list0);
        this.zzbh(14, parcel0);
    }
}

