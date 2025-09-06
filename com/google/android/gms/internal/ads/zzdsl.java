package com.google.android.gms.internal.ads;

public final class zzdsl {
    private final zzbjp zza;

    zzdsl(zzbjp zzbjp0) {
        this.zza = zzbjp0;
    }

    public final void zza() {
        this.zzs(new zzdsk("initialize", null));
    }

    public final void zzb(long v) {
        zzdsk zzdsk0 = new zzdsk("interstitial", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onAdClicked";
        String s = zzdsk.zza(zzdsk0);
        this.zza.zzb(s);
    }

    public final void zzc(long v) {
        zzdsk zzdsk0 = new zzdsk("interstitial", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onAdClosed";
        this.zzs(zzdsk0);
    }

    public final void zzd(long v, int v1) {
        zzdsk zzdsk0 = new zzdsk("interstitial", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onAdFailedToLoad";
        zzdsk0.zzd = v1;
        this.zzs(zzdsk0);
    }

    public final void zze(long v) {
        zzdsk zzdsk0 = new zzdsk("interstitial", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onAdLoaded";
        this.zzs(zzdsk0);
    }

    public final void zzf(long v) {
        zzdsk zzdsk0 = new zzdsk("interstitial", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onNativeAdObjectNotAvailable";
        this.zzs(zzdsk0);
    }

    public final void zzg(long v) {
        zzdsk zzdsk0 = new zzdsk("interstitial", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onAdOpened";
        this.zzs(zzdsk0);
    }

    public final void zzh(long v) {
        zzdsk zzdsk0 = new zzdsk("creation", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "nativeObjectCreated";
        this.zzs(zzdsk0);
    }

    public final void zzi(long v) {
        zzdsk zzdsk0 = new zzdsk("creation", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "nativeObjectNotCreated";
        this.zzs(zzdsk0);
    }

    public final void zzj(long v) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onAdClicked";
        this.zzs(zzdsk0);
    }

    public final void zzk(long v) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onRewardedAdClosed";
        this.zzs(zzdsk0);
    }

    public final void zzl(long v, zzbvt zzbvt0) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onUserEarnedReward";
        zzdsk0.zze = zzbvt0.zzf();
        zzdsk0.zzf = zzbvt0.zze();
        this.zzs(zzdsk0);
    }

    public final void zzm(long v, int v1) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onRewardedAdFailedToLoad";
        zzdsk0.zzd = v1;
        this.zzs(zzdsk0);
    }

    public final void zzn(long v, int v1) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onRewardedAdFailedToShow";
        zzdsk0.zzd = v1;
        this.zzs(zzdsk0);
    }

    public final void zzo(long v) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onAdImpression";
        this.zzs(zzdsk0);
    }

    public final void zzp(long v) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onRewardedAdLoaded";
        this.zzs(zzdsk0);
    }

    public final void zzq(long v) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onNativeAdObjectNotAvailable";
        this.zzs(zzdsk0);
    }

    public final void zzr(long v) {
        zzdsk zzdsk0 = new zzdsk("rewarded", null);
        zzdsk0.zza = v;
        zzdsk0.zzc = "onRewardedAdOpened";
        this.zzs(zzdsk0);
    }

    private final void zzs(zzdsk zzdsk0) {
        String s = zzdsk.zza(zzdsk0);
        zzcaa.zzi(("Dispatching AFMA event on publisher webview: " + s));
        this.zza.zzb(s);
    }
}

