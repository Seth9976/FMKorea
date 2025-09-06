package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

public final class zzbhb {
    private final OnCustomTemplateAdLoadedListener zza;
    private final OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzbhb(OnCustomTemplateAdLoadedListener nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0, OnCustomClickListener nativeCustomTemplateAd$OnCustomClickListener0) {
        this.zza = nativeCustomTemplateAd$OnCustomTemplateAdLoadedListener0;
        this.zzb = nativeCustomTemplateAd$OnCustomClickListener0;
    }

    static OnCustomClickListener zza(zzbhb zzbhb0) {
        return zzbhb0.zzb;
    }

    static OnCustomTemplateAdLoadedListener zzb(zzbhb zzbhb0) {
        return zzbhb0.zza;
    }

    static NativeCustomTemplateAd zzc(zzbhb zzbhb0, zzbfq zzbfq0) {
        return zzbhb0.zzf(zzbfq0);
    }

    public final zzbga zzd() {
        return this.zzb == null ? null : new zzbgy(this, null);
    }

    public final zzbgd zze() {
        return new zzbha(this, null);
    }

    private final NativeCustomTemplateAd zzf(zzbfq zzbfq0) {
        synchronized(this) {
            NativeCustomTemplateAd nativeCustomTemplateAd0 = this.zzc;
            if(nativeCustomTemplateAd0 != null) {
                return nativeCustomTemplateAd0;
            }
            NativeCustomTemplateAd nativeCustomTemplateAd1 = new zzbfr(zzbfq0);
            this.zzc = nativeCustomTemplateAd1;
            return nativeCustomTemplateAd1;
        }
    }
}

