package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public class zzeiu extends zzbok {
    private final zzcwg zza;
    private final zzddu zzb;
    private final zzcxa zzc;
    private final zzcxp zzd;
    private final zzcxu zze;
    private final zzdbc zzf;
    private final zzcyo zzg;
    private final zzdem zzh;
    private final zzday zzi;
    private final zzcwv zzj;

    public zzeiu(zzcwg zzcwg0, zzddu zzddu0, zzcxa zzcxa0, zzcxp zzcxp0, zzcxu zzcxu0, zzdbc zzdbc0, zzcyo zzcyo0, zzdem zzdem0, zzday zzday0, zzcwv zzcwv0) {
        this.zza = zzcwg0;
        this.zzb = zzddu0;
        this.zzc = zzcxa0;
        this.zzd = zzcxp0;
        this.zze = zzcxu0;
        this.zzf = zzdbc0;
        this.zzg = zzcyo0;
        this.zzh = zzdem0;
        this.zzi = zzday0;
        this.zzj = zzcwv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzbK();
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzf() {
        this.zzg.zzby(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzg(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzh(zze zze0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzi(int v, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    @Deprecated
    public final void zzj(int v) {
        this.zzk(new zze(v, "", "undefined", null, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzk(zze zze0) {
        zze zze1 = zzfdb.zzc(8, zze0);
        this.zzj.zza(zze1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzl(String s) {
        this.zzk(new zze(0, s, "undefined", null, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzo() {
        this.zze.zzr();
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzp() {
        this.zzg.zzbv();
        this.zzi.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzq(String s, String s1) {
        this.zzf.zzb(s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzr(zzbfq zzbfq0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public void zzs(zzbvp zzbvp0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public void zzt(zzbvt zzbvt0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public void zzu() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public void zzv() {
        this.zzh.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public final void zzx() {
        this.zzh.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzbol
    public void zzy() {
        this.zzh.zzd();
    }
}

