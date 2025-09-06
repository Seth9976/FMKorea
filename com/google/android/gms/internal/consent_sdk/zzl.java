package com.google.android.gms.internal.consent_sdk;

import W1.c.b;
import W1.c;
import W1.d.a;
import W1.d;
import android.app.Activity;
import android.util.Log;

public final class zzl implements c {
    private final zzas zza;
    private final zzx zzb;
    private final zzbq zzc;
    private final Object zzd;
    private final Object zze;
    private boolean zzf;
    private boolean zzg;
    private d zzh;

    public zzl(zzas zzas0, zzx zzx0, zzbq zzbq0) {
        this.zzd = new Object();
        this.zze = new Object();
        this.zzf = false;
        this.zzg = false;
        this.zzh = new a().a();
        this.zza = zzas0;
        this.zzb = zzx0;
        this.zzc = zzbq0;
    }

    public final boolean canRequestAds() {
        int v = this.zzc() ? this.zza.zza() : 0;
        return v == 1 || v == 3;
    }

    public final int getConsentStatus() {
        return this.zzc() ? this.zza.zza() : 0;
    }

    public final W1.c.c getPrivacyOptionsRequirementStatus() {
        return this.zzc() ? this.zza.zzb() : W1.c.c.f;
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override  // W1.c
    public final void requestConsentInfoUpdate(Activity activity0, d d0, b c$b0, W1.c.a c$a0) {
        synchronized(this.zzd) {
            this.zzf = true;
        }
        this.zzh = d0;
        this.zzb.zzc(activity0, d0, c$b0, c$a0);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized(this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity0) {
        if(this.zzc() && !this.zzd()) {
            this.zzb(true);
            d d0 = this.zzh;
            zzj zzj0 = () -> synchronized(this.zze) {
                this.zzg = false;
            };
            zzk zzk0 = (/* 缺少LAMBDA参数 */) -> synchronized(this.zze) {
                this.zzg = false;
            };
            this.zzb.zzc(activity0, d0, zzj0, zzk0);
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + this.zzc() + ", retryRequestIsInProgress=" + this.zzd());
    }

    // 检测为 Lambda 实现
    public final void zzb(boolean z) [...]

    public final boolean zzc() {
        synchronized(this.zzd) {
        }
        return this.zzf;
    }

    public final boolean zzd() {
        synchronized(this.zze) {
        }
        return this.zzg;
    }
}

