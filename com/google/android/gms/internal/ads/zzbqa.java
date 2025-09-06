package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbqa extends zzatv implements zzbqc {
    zzbqa(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final zzdq zze() {
        Parcel parcel0 = this.zzbg(5, this.zza());
        zzdq zzdq0 = zzdp.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final zzbqq zzf() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        zzbqq zzbqq0 = (zzbqq)zzatx.zza(parcel0, zzbqq.CREATOR);
        parcel0.recycle();
        return zzbqq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final zzbqq zzg() {
        Parcel parcel0 = this.zzbg(3, this.zza());
        zzbqq zzbqq0 = (zzbqq)zzatx.zza(parcel0, zzbqq.CREATOR);
        parcel0.recycle();
        return zzbqq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzh(IObjectWrapper iObjectWrapper0, String s, Bundle bundle0, Bundle bundle1, zzq zzq0, zzbqf zzbqf0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzatx.zzd(parcel0, bundle0);
        zzatx.zzd(parcel0, bundle1);
        zzatx.zzd(parcel0, zzq0);
        zzatx.zzf(parcel0, zzbqf0);
        this.zzbh(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzi(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpn zzbpn0, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbpn0);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(23, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzj(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpq zzbpq0, zzbol zzbol0, zzq zzq0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbpq0);
        zzatx.zzf(parcel0, zzbol0);
        zzatx.zzd(parcel0, zzq0);
        this.zzbh(13, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzk(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpq zzbpq0, zzbol zzbol0, zzq zzq0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbpq0);
        zzatx.zzf(parcel0, zzbol0);
        zzatx.zzd(parcel0, zzq0);
        this.zzbh(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzl(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpt zzbpt0, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbpt0);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(14, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzm(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpw zzbpw0, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbpw0);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(18, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzn(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpw zzbpw0, zzbol zzbol0, zzbek zzbek0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbpw0);
        zzatx.zzf(parcel0, zzbol0);
        zzatx.zzd(parcel0, zzbek0);
        this.zzbh(22, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzo(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpz zzbpz0, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbpz0);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(20, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzp(String s, String s1, zzl zzl0, IObjectWrapper iObjectWrapper0, zzbpz zzbpz0, zzbol zzbol0) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzatx.zzd(parcel0, zzl0);
        zzatx.zzf(parcel0, iObjectWrapper0);
        zzatx.zzf(parcel0, zzbpz0);
        zzatx.zzf(parcel0, zzbol0);
        this.zzbh(16, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final void zzq(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(19, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzr(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzbg(24, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzs(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzbg(15, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzt(IObjectWrapper iObjectWrapper0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzbg(17, parcel0);
        boolean z = zzatx.zzg(parcel1);
        parcel1.recycle();
        return z;
    }
}

