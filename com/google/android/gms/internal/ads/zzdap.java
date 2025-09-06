package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

public final class zzdap implements AppEventListener, zza, zzo, OnAdMetadataChangedListener, zzcwi, zzcwy, zzcxc, zzcyh, zzcyt, zzddw {
    private final zzdan zza;
    private zzekx zzb;
    private zzelb zzc;
    private zzexc zzd;
    private zzfah zze;

    public zzdap() {
        this.zza = new zzdan(this, null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzdap.zzn(this.zzb, (zzdad this) -> ((zzekx)object0).onAdClicked());
        zzdap.zzn(this.zzc, (zzdae this) -> ((zzelb)object0).onAdClicked());
    }

    @Override  // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdap.zzn(this.zze, (zzczw this) -> ((zzfah)object0).onAdMetadataChanged());
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        zzdap.zzn(this.zzb, new zzczf(s, s1));
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        zzdap.zzn(this.zzb, (zzczx this) -> ((zzekx)object0).zza());
        zzdap.zzn(this.zze, (zzczy this) -> ((zzfah)object0).zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
        zzdap.zzn(this.zzb, (zzdaa this) -> ((zzekx)object0).zzb());
        zzdap.zzn(this.zze, (zzdaf this) -> ((zzfah)object0).zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzdap.zzn(this.zzb, (zzczs this) -> ((zzekx)object0).zzbK());
        zzdap.zzn(this.zzc, (zzczt this) -> ((zzelb)object0).zzbK());
        zzdap.zzn(this.zze, (zzczu this) -> ((zzfah)object0).zzbK());
        zzdap.zzn(this.zzd, (zzczv this) -> ((zzexc)object0).zzbK());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        zzdap.zzn(this.zzd, (Object object0) -> zzexc zzexc0 = (zzexc)object0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzdap.zzn(this.zzd, (Object object0) -> zzexc zzexc0 = (zzexc)object0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzdap.zzn(this.zzd, (zzczl this) -> ((zzexc)object0).zzbu());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzdap.zzn(this.zzd, (zzdaj this) -> ((zzexc)object0).zzbv());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvd0, String s, String s1) {
        zzdap.zzn(this.zzb, new zzczo(zzbvd0, s, s1));
        zzdap.zzn(this.zze, new zzczq(zzbvd0, s, s1));
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        zzdap.zzn(this.zzd, (zzcze this) -> ((zzexc)object0).zzbx());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        zzdap.zzn(this.zzd, new zzczz(v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        zzdap.zzn(this.zzb, (zzdak this) -> ((zzekx)object0).zzc());
        zzdap.zzn(this.zze, (zzdal this) -> ((zzfah)object0).zzc());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        zzdap.zzn(this.zzb, (Object object0) -> zzekx zzekx0 = (zzekx)object0);
        zzdap.zzn(this.zze, (zzczh this) -> ((zzfah)object0).zze());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        zzdap.zzn(this.zzb, (Object object0) -> zzekx zzekx0 = (zzekx)object0);
        zzdap.zzn(this.zze, (zzczk this) -> ((zzfah)object0).zzf());
    }

    @Override  // com.google.android.gms.internal.ads.zzcyh
    public final void zzg() {
        zzdap.zzn(this.zzd, (zzczr this) -> ((zzexc)object0).zzg());
    }

    @Override  // com.google.android.gms.internal.ads.zzcyt
    public final void zzh(zzs zzs0) {
        zzdap.zzn(this.zzb, new zzdag(zzs0));
        zzdap.zzn(this.zze, new zzdah(zzs0));
        zzdap.zzn(this.zzd, new zzdai(zzs0));
    }

    public final zzdan zzi() {
        return this.zza;
    }

    static void zzj(zzdap zzdap0, zzekx zzekx0) {
        zzdap0.zzb = zzekx0;
    }

    static void zzk(zzdap zzdap0, zzexc zzexc0) {
        zzdap0.zzd = zzexc0;
    }

    static void zzl(zzdap zzdap0, zzelb zzelb0) {
        zzdap0.zzc = zzelb0;
    }

    static void zzm(zzdap zzdap0, zzfah zzfah0) {
        zzdap0.zze = zzfah0;
    }

    private static void zzn(Object object0, zzdao zzdao0) {
        if(object0 != null) {
            zzdao0.zza(object0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(zze zze0) {
        zzdap.zzn(this.zze, new zzczm(zze0));
        zzdap.zzn(this.zzb, new zzczn(zze0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        zzdap.zzn(this.zzb, (zzczp this) -> ((zzekx)object0).zzq());
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzdap.zzn(this.zzb, (zzdac this) -> ((zzekx)object0).zzs());
    }
}

