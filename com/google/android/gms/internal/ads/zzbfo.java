package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbfo extends zzatv implements zzbfq {
    zzbfo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final zzdq zze() {
        Parcel parcel0 = this.zzbg(7, this.zza());
        zzdq zzdq0 = zzdp.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final zzbet zzf() {
        zzbet zzbet0;
        Parcel parcel0 = this.zzbg(16, this.zza());
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

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final zzbew zzg(String s) {
        zzbew zzbew0;
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzbg(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbew0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbew0 = iInterface0 instanceof zzbew ? ((zzbew)iInterface0) : new zzbeu(iBinder0);
        }
        parcel1.recycle();
        return zzbew0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final IObjectWrapper zzh() {
        Parcel parcel0 = this.zzbg(9, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final String zzi() {
        Parcel parcel0 = this.zzbg(4, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final String zzj(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzbg(1, parcel0);
        String s1 = parcel1.readString();
        parcel1.recycle();
        return s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final List zzk() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        List list0 = parcel0.createStringArrayList();
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzl() {
        this.zzbh(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzm() {
        this.zzbh(15, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzn(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzo() {
        this.zzbh(6, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzp(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(14, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzq() {
        Parcel parcel0 = this.zzbg(12, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzr(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzbg(17, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzs(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzbg(10, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzt() {
        Parcel parcel0 = this.zzbg(13, this.zza());
        boolean z = zzatx.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

