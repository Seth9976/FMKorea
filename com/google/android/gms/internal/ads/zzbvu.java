package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbvu extends zzatv implements zzbvw {
    zzbvu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final Bundle zzb() {
        Parcel parcel0 = this.zzbg(9, this.zza());
        Bundle bundle0 = (Bundle)zzatx.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final zzdn zzc() {
        Parcel parcel0 = this.zzbg(12, this.zza());
        zzdn zzdn0 = zzdm.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final zzbvt zzd() {
        zzbvt zzbvt0;
        Parcel parcel0 = this.zzbg(11, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbvt0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbvt0 = iInterface0 instanceof zzbvt ? ((zzbvt)iInterface0) : new zzbvr(iBinder0);
        }
        parcel0.recycle();
        return zzbvt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final String zze() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(zzl zzl0, zzbwd zzbwd0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, zzbwd0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzg(zzl zzl0, zzbwd zzbwd0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, zzbwd0);
        this.zzbh(14, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzh(boolean z) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzbh(15, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(zzdd zzdd0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzdd0);
        this.zzbh(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzj(zzdg zzdg0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzdg0);
        this.zzbh(13, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvz zzbvz0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbvz0);
        this.zzbh(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzl(zzbwk zzbwk0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zzbwk0);
        this.zzbh(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzm(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        this.zzbh(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final boolean zzo() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzp(zzbwe zzbwe0) {
        throw null;
    }
}

