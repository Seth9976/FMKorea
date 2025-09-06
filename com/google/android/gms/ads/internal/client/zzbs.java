package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzawb;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvj;

public final class zzbs extends zzatv implements zzbu {
    zzbs(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        this.zzbh(11, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        this.zzbh(6, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbe0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbe0);
        this.zzbh(20, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbh0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbh0);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzby0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzq0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzq0);
        this.zzbh(13, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcb0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzcb0);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzawb zzawb0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzawb0);
        this.zzbh(40, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzw0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzw0);
        this.zzbh(39, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzci0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzci0);
        this.zzbh(45, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzdu0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(34, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsl zzbsl0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(22, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbcp zzbcp0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdg0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzdg0);
        this.zzbh(42, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbso zzbso0, String s) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String s) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvj zzbvj0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String s) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzfl0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzfl0);
        this.zzbh(29, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(44, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        Parcel parcel0 = this.zzbg(23, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzl0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzl0);
        Parcel parcel1 = this.zzbg(4, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcf0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        Parcel parcel0 = this.zzbg(12, this.zza());
        zzq zzq0 = (zzq)zzatx.zza(parcel0, zzq.CREATOR);
        parcel0.recycle();
        return zzq0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        zzbh zzbh0;
        Parcel parcel0 = this.zzbg(33, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbh0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbh0 = iInterface0 instanceof zzbh ? ((zzbh)iInterface0) : new zzbf(iBinder0);
        }
        parcel0.recycle();
        return zzbh0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        zzcb zzcb0;
        Parcel parcel0 = this.zzbg(0x20, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzcb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcb0 = iInterface0 instanceof zzcb ? ((zzcb)iInterface0) : new zzbz(iBinder0);
        }
        parcel0.recycle();
        return zzcb0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        zzdn zzdn0;
        Parcel parcel0 = this.zzbg(41, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzdn0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdn0 = iInterface0 instanceof zzdn ? ((zzdn)iInterface0) : new zzdl(iBinder0);
        }
        parcel0.recycle();
        return zzdn0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        zzdq zzdq0;
        Parcel parcel0 = this.zzbg(26, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzdq0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdq0 = iInterface0 instanceof zzdq ? ((zzdq)iInterface0) : new zzdo(iBinder0);
        }
        parcel0.recycle();
        return zzdq0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        Parcel parcel0 = this.zzbg(1, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        Parcel parcel0 = this.zzbg(0x1F, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzl0, zzbk zzbk0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, zzbk0);
        this.zzbh(43, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        this.zzbh(5, this.zza());
    }
}

