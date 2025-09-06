package com.google.android.gms.internal.consent_sdk;

import W1.c.c;
import W1.f.a;
import W1.f.b;
import android.app.Activity;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbq {
    private final zzdr zza;
    private final Executor zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;

    zzbq(zzdr zzdr0, Executor executor0) {
        this.zzc = new AtomicReference();
        this.zzd = new AtomicReference();
        this.zza = zzdr0;
        this.zzb = executor0;
    }

    // 检测为 Lambda 实现
    final void zza(zzbe zzbe0) [...]

    public final void zzb(b f$b0, a f$a0) {
        zzct.zza();
        zzbs zzbs0 = (zzbs)this.zzc.get();
        if(zzbs0 == null) {
            f$a0.onConsentFormLoadFailure(new zzi(3, "No available form can be built.").zza());
            return;
        }
        Object object0 = this.zza.zzb();
        ((zzay)object0).zza(zzbs0);
        ((zzay)object0).zzb().zza().zzb(f$b0, f$a0);
    }

    // 检测为 Lambda 实现
    public final void zzc() [...]

    public final void zzd(zzbs zzbs0) {
        this.zzc.set(zzbs0);
    }

    public final void zze(Activity activity0, W1.b.a b$a0) {
        zzct.zza();
        zzl zzl0 = zzc.zza(activity0).zzb();
        if(zzl0 == null) {
            zzbl zzbl0 = new zzbl(b$a0);
            zzct.zza.post(zzbl0);
            return;
        }
        if(!zzl0.isConsentFormAvailable() && zzl0.getPrivacyOptionsRequirementStatus() != c.g) {
            zzbm zzbm0 = new zzbm(b$a0);
            zzct.zza.post(zzbm0);
            zzl0.zza(activity0);
            return;
        }
        if(zzl0.getPrivacyOptionsRequirementStatus() == c.g) {
            zzbn zzbn0 = new zzbn(b$a0);
            zzct.zza.post(zzbn0);
            return;
        }
        W1.b b0 = (W1.b)this.zzd.get();
        if(b0 == null) {
            zzbo zzbo0 = new zzbo(b$a0);
            zzct.zza.post(zzbo0);
            return;
        }
        b0.show(activity0, b$a0);
        zzbp zzbp0 = () -> {
            zzbs zzbs0 = (zzbs)this.zzc.get();
            if(zzbs0 == null) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
                return;
            }
            Object object0 = this.zza.zzb();
            ((zzay)object0).zza(zzbs0);
            zzbe zzbe0 = ((zzay)object0).zzb().zza();
            zzbe0.zza = true;
            zzbk zzbk0 = () -> zzbe0.zzb(new zzbi(this.zzd), zzbj.zza);
            zzct.zza.post(zzbk0);
        };
        this.zzb.execute(zzbp0);
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}

