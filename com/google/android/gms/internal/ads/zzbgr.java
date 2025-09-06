package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbgr extends zzatv implements zzbgt {
    zzbgr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzA() {
        this.zzbh(28, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzB(Bundle bundle0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, bundle0);
        this.zzbh(17, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzC() {
        this.zzbh(27, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzD(zzcs zzcs0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzcs0);
        this.zzbh(26, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzE(zzdg zzdg0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzdg0);
        this.zzbh(0x20, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzF(zzbgq zzbgq0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbgq0);
        this.zzbh(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzG() {
        Parcel parcel0 = this.zzbg(30, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzH() {
        Parcel parcel0 = this.zzbg(24, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzI(Bundle bundle0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, bundle0);
        Parcel parcel1 = this.zzbg(16, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final double zze() {
        Parcel parcel0 = this.zzbg(8, this.zza());
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final Bundle zzf() {
        Parcel parcel0 = this.zzbg(20, this.zza());
        Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzdn zzg() {
        Parcel parcel0 = this.zzbg(0x1F, this.zza());
        zzdn zzdn0 = zzdm.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzdq zzh() {
        Parcel parcel0 = this.zzbg(11, this.zza());
        zzdq zzdq0 = zzdp.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzbeo zzi() {
        zzbeo zzbeo0;
        Parcel parcel0 = this.zzbg(14, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbeo0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbeo0 = iInterface0 instanceof zzbeo ? ((zzbeo)iInterface0) : new zzbem(iBinder0);
        }
        parcel0.recycle();
        return zzbeo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzbet zzj() {
        zzbet zzbet0;
        Parcel parcel0 = this.zzbg(29, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbet0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbet0 = iInterface0 instanceof zzbet ? ((zzbet)iInterface0) : new zzber(iBinder0);
        }
        parcel0.recycle();
        return zzbet0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final zzbew zzk() {
        zzbew zzbew0;
        Parcel parcel0 = this.zzbg(5, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbew0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbew0 = iInterface0 instanceof zzbew ? ((zzbew)iInterface0) : new zzbeu(iBinder0);
        }
        parcel0.recycle();
        return zzbew0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final IObjectWrapper zzl() {
        Parcel parcel0 = this.zzbg(19, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final IObjectWrapper zzm() {
        Parcel parcel0 = this.zzbg(18, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzn() {
        Parcel parcel0 = this.zzbg(7, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzo() {
        Parcel parcel0 = this.zzbg(4, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzp() {
        Parcel parcel0 = this.zzbg(6, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzq() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzr() {
        Parcel parcel0 = this.zzbg(12, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzs() {
        Parcel parcel0 = this.zzbg(10, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final String zzt() {
        Parcel parcel0 = this.zzbg(9, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final List zzu() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        List list0 = zzatx.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final List zzv() {
        Parcel parcel0 = this.zzbg(23, this.zza());
        List list0 = zzatx.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzw() {
        this.zzbh(22, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzx() {
        this.zzbh(13, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzy(zzcw zzcw0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzcw0);
        this.zzbh(25, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgt
    public final void zzz(Bundle bundle0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, bundle0);
        this.zzbh(15, parcel0);
    }
}

