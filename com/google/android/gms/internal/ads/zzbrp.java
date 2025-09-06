package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

public final class zzbrp {
    private final OnCustomFormatAdLoadedListener zza;
    private final OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbrp(OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener0, OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener0) {
        this.zza = nativeCustomFormatAd$OnCustomFormatAdLoadedListener0;
        this.zzb = nativeCustomFormatAd$OnCustomClickListener0;
    }

    public final zzbga zza() {
        return this.zzb == null ? null : new zzbrm(this, null);
    }

    public final zzbgd zzb() {
        return new zzbro(this, null);
    }

    static OnCustomClickListener zzc(zzbrp zzbrp0) {
        return zzbrp0.zzb;
    }

    static OnCustomFormatAdLoadedListener zzd(zzbrp zzbrp0) {
        return zzbrp0.zza;
    }

    static NativeCustomFormatAd zze(zzbrp zzbrp0, zzbfq zzbfq0) {
        return zzbrp0.zzf(zzbfq0);
    }

    private final NativeCustomFormatAd zzf(zzbfq zzbfq0) {
        synchronized(this) {
            NativeCustomFormatAd nativeCustomFormatAd0 = this.zzc;
            if(nativeCustomFormatAd0 != null) {
                return nativeCustomFormatAd0;
            }
            NativeCustomFormatAd nativeCustomFormatAd1 = new zzbrq(zzbfq0);
            this.zzc = nativeCustomFormatAd1;
            return nativeCustomFormatAd1;
        }
    }
}

