package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.HashMap;

public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbgv zzd;
    private final zzbwi zze;
    private final zzbrz zzf;
    private final zzbgw zzg;
    private zzbth zzh;

    public zzaw(zzk zzk0, zzi zzi0, zzeq zzeq0, zzbgv zzbgv0, zzbwi zzbwi0, zzbrz zzbrz0, zzbgw zzbgw0) {
        this.zza = zzk0;
        this.zzb = zzi0;
        this.zzc = zzeq0;
        this.zzd = zzbgv0;
        this.zze = zzbwi0;
        this.zzf = zzbrz0;
        this.zzg = zzbgw0;
    }

    static zzi zza(zzaw zzaw0) {
        return zzaw0.zzb;
    }

    public final zzbq zzc(Context context0, String s, zzbof zzbof0) {
        return (zzbq)new zzao(this, context0, s, zzbof0).zzd(context0, false);
    }

    public final zzbu zzd(Context context0, zzq zzq0, String s, zzbof zzbof0) {
        return (zzbu)new zzak(this, context0, zzq0, s, zzbof0).zzd(context0, false);
    }

    public final zzbu zze(Context context0, zzq zzq0, String s, zzbof zzbof0) {
        return (zzbu)new zzam(this, context0, zzq0, s, zzbof0).zzd(context0, false);
    }

    public final zzdj zzf(Context context0, zzbof zzbof0) {
        return (zzdj)new zzac(this, context0, zzbof0).zzd(context0, false);
    }

    static zzeq zzg(zzaw zzaw0) {
        return zzaw0.zzc;
    }

    public final zzbfa zzh(Context context0, FrameLayout frameLayout0, FrameLayout frameLayout1) {
        return (zzbfa)new zzas(this, frameLayout0, frameLayout1, context0).zzd(context0, false);
    }

    public final zzbfg zzi(View view0, HashMap hashMap0, HashMap hashMap1) {
        return (zzbfg)new zzau(this, view0, hashMap0, hashMap1).zzd(view0.getContext(), false);
    }

    static zzbgv zzj(zzaw zzaw0) {
        return zzaw0.zzd;
    }

    static zzbgw zzk(zzaw zzaw0) {
        return zzaw0.zzg;
    }

    public final zzbjs zzl(Context context0, zzbof zzbof0, OnH5AdsEventListener onH5AdsEventListener0) {
        return (zzbjs)new zzai(this, context0, zzbof0, onH5AdsEventListener0).zzd(context0, false);
    }

    public final zzbrv zzm(Context context0, zzbof zzbof0) {
        return (zzbrv)new zzag(this, context0, zzbof0).zzd(context0, false);
    }

    public final zzbsc zzo(Activity activity0) {
        zzaa zzaa0 = new zzaa(this, activity0);
        Intent intent0 = activity0.getIntent();
        if(!intent0.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcaa.zzg("useClientJar flag not found in activity intent extras.");
            return (zzbsc)zzaa0.zzd(activity0, false);
        }
        return (zzbsc)zzaa0.zzd(activity0, intent0.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false));
    }

    public final zzbvw zzq(Context context0, String s, zzbof zzbof0) {
        return (zzbvw)new zzav(this, context0, s, zzbof0).zzd(context0, false);
    }

    public final zzbyr zzr(Context context0, zzbof zzbof0) {
        return (zzbyr)new zzae(this, context0, zzbof0).zzd(context0, false);
    }

    static void zzt(Context context0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("action", "no_ads_fallback");
        bundle0.putString("flow", s);
        zzay.zzb().zzn(context0, zzay.zzc().zza, "gmob-apps", bundle0, true);
    }
}

