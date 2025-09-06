package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyr;

public final class zzcc extends zzatv implements zzce {
    zzcc(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper0, String s, zzbof zzbof0, int v) {
        zzbq zzbq0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(3, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbq0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbq0 = iInterface0 instanceof zzbq ? ((zzbq)iInterface0) : new zzbo(iBinder0);
        }
        parcel1.recycle();
        return zzbq0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbof zzbof0, int v) {
        zzbu zzbu0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzq0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(13, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbu0 = iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
        }
        parcel1.recycle();
        return zzbu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbof zzbof0, int v) {
        zzbu zzbu0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzq0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbu0 = iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
        }
        parcel1.recycle();
        return zzbu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbof zzbof0, int v) {
        zzbu zzbu0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzq0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbu0 = iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
        }
        parcel1.recycle();
        return zzbu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, int v) {
        zzbu zzbu0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzd(parcel0, zzq0);
        parcel0.writeString(s);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(10, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbu0 = iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
        }
        parcel1.recycle();
        return zzbu0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper0, int v) {
        zzco zzco0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(9, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzco0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzco0 = iInterface0 instanceof zzco ? ((zzco)iInterface0) : new zzcm(iBinder0);
        }
        parcel1.recycle();
        return zzco0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        zzdj zzdj0;
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(17, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzdj0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdj0 = iInterface0 instanceof zzdj ? ((zzdj)iInterface0) : new zzdh(iBinder0);
        }
        parcel1.recycle();
        return zzdj0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbfa zzi(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, iObjectWrapper1);
        Parcel parcel1 = this.zzbg(5, parcel0);
        zzbfa zzbfa0 = zzbez.zzbE(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbfa0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbfg zzj(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, iObjectWrapper1);
        zzatx.zzf(parcel0, iObjectWrapper2);
        Parcel parcel1 = this.zzbg(11, parcel0);
        zzbfg zzbfg0 = zzbff.zze(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbfg0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbjs zzk(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v, zzbjp zzbjp0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        zzatx.zzf(parcel0, zzbjp0);
        Parcel parcel1 = this.zzbg(16, parcel0);
        zzbjs zzbjs0 = zzbjr.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbjs0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbrv zzl(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(15, parcel0);
        zzbrv zzbrv0 = zzbru.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbrv0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbsc zzm(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzbg(8, parcel0);
        zzbsc zzbsc0 = zzbsb.zzH(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbsc0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzn(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbvw zzo(IObjectWrapper iObjectWrapper0, String s, zzbof zzbof0, int v) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(12, parcel0);
        zzbvw zzbvw0 = zzbvv.zzq(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbvw0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbyr zzp(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbof0);
        parcel0.writeInt(233012000);
        Parcel parcel1 = this.zzbg(14, parcel0);
        zzbyr zzbyr0 = zzbyq.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbyr0;
    }
}

