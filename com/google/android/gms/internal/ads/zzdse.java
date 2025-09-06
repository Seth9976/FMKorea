package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;

public final class zzdse implements AppEventListener, zza, zzcwi, zzcwl, zzcxc, zzcxd, zzcxw, zzczd, zzfgf {
    private final List zza;
    private final zzdrs zzb;
    private long zzc;

    public zzdse(zzdrs zzdrs0, zzchd zzchd0) {
        this.zzb = zzdrs0;
        this.zza = Collections.singletonList(zzchd0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzg(zza.class, "onAdClicked", new Object[0]);
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        this.zzg(AppEventListener.class, "onAppEvent", new Object[]{s, s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        this.zzg(zzcwi.class, "onAdClosed", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
        this.zzg(zzcwi.class, "onAdLeftApplication", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        this.zzg(zzcwl.class, "onAdFailedToLoad", new Object[]{zze0.zza, zze0.zzb, zze0.zzc});
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffy0, String s) {
        this.zzg(zzffx.class, "onTaskCreated", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffy0, String s, Throwable throwable0) {
        Object[] arr_object = {s, throwable0.getClass().getSimpleName()};
        this.zzg(zzffx.class, "onTaskFailed", arr_object);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffy0, String s) {
        this.zzg(zzffx.class, "onTaskStarted", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context0) {
        this.zzg(zzcxd.class, "onDestroy", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context0) {
        this.zzg(zzcxd.class, "onPause", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context0) {
        this.zzg(zzcxd.class, "onResume", new Object[]{context0});
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
        this.zzc = zzt.zzB().elapsedRealtime();
        this.zzg(zzczd.class, "onAdRequest", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvd0, String s, String s1) {
        this.zzg(zzcwi.class, "onRewarded", new Object[]{zzbvd0, s, s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        this.zzg(zzcwi.class, "onAdOpened", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffy0, String s) {
        this.zzg(zzffx.class, "onTaskSucceeded", new Object[]{s});
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        this.zzg(zzcwi.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        this.zzg(zzcwi.class, "onRewardedVideoStarted", new Object[0]);
    }

    private final void zzg(Class class0, String s, Object[] arr_object) {
        this.zzb.zza(this.zza, "Event-" + class0.getSimpleName(), s, arr_object);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        this.zzg(zzcxc.class, "onAdImpression", new Object[0]);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        com.google.android.gms.ads.internal.util.zze.zza(("Ad Request Latency : " + (zzt.zzB().elapsedRealtime() - this.zzc)));
        this.zzg(zzcxw.class, "onAdLoaded", new Object[0]);
    }
}

