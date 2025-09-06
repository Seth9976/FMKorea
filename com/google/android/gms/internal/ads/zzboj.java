package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

public final class zzboj extends zzatv implements zzbol {
    zzboj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zze() {
        this.zzbh(1, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzf() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzg(int v) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzh(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(23, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzi(int v, String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        this.zzbh(22, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzj(int v) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzk(zze zze0) {
        Parcel parcel0 = this.zza();
        zzatx.zzd(parcel0, zze0);
        this.zzbh(24, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzl(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzm() {
        this.zzbh(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzn() {
        this.zzbh(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzo() {
        this.zzbh(6, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzp() {
        this.zzbh(5, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzq(String s, String s1) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzbh(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzr(zzbfq zzbfq0, String s) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbfq0);
        parcel0.writeString(s);
        this.zzbh(10, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzs(zzbvp zzbvp0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzt(zzbvt zzbvt0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbvt0);
        this.zzbh(16, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzu() {
        this.zzbh(18, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzv() {
        this.zzbh(11, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzw() {
        this.zzbh(15, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzx() {
        this.zzbh(20, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzy() {
        this.zzbh(13, this.zza());
    }
}

