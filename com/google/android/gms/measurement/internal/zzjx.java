package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpy;

final class zzjx implements Application.ActivityLifecycleCallbacks {
    private final zziq zza;

    zzjx(zziq zziq0) {
        this.zza = zziq0;
        super();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        try {
            try {
                this.zza.zzj().zzp().zza("onActivityCreated");
                Intent intent0 = activity0.getIntent();
                if(intent0 != null) {
                    Uri uri0 = intent0.getData();
                    if(uri0 == null || !uri0.isHierarchical()) {
                        Bundle bundle1 = intent0.getExtras();
                        if(bundle1 == null) {
                            uri0 = null;
                        }
                        else {
                            String s = bundle1.getString("com.android.vending.referral_url");
                            uri0 = TextUtils.isEmpty(s) ? null : Uri.parse(s);
                        }
                    }
                    if(uri0 != null && uri0.isHierarchical()) {
                        this.zza.zzq();
                        String s1 = zznd.zza(intent0) ? "gs" : "auto";
                        String s2 = uri0.getQueryParameter("referrer");
                        this.zza.zzl().zzb(new zzka(this, bundle0 == null, uri0, s1, s2));
                        goto label_28;
                    }
                    goto label_30;
                }
                goto label_32;
            }
            catch(RuntimeException runtimeException0) {
            }
            this.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", runtimeException0);
        }
        catch(Throwable throwable0) {
            this.zza.zzn().zza(activity0, bundle0);
            throw throwable0;
        }
        this.zza.zzn().zza(activity0, bundle0);
        return;
    label_28:
        this.zza.zzn().zza(activity0, bundle0);
        return;
    label_30:
        this.zza.zzn().zza(activity0, bundle0);
        return;
    label_32:
        this.zza.zzn().zza(activity0, bundle0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.zza.zzn().zza(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.zza.zzn().zzb(activity0);
        zzlx zzlx0 = this.zza.zzp();
        long v = zzlx0.zzb().elapsedRealtime();
        zzlx0.zzl().zzb(new zzlz(zzlx0, v));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        zzlx zzlx0 = this.zza.zzp();
        long v = zzlx0.zzb().elapsedRealtime();
        zzlx0.zzl().zzb(new zzma(zzlx0, v));
        this.zza.zzn().zzc(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.zza.zzn().zzb(activity0, bundle0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }

    static void zza(zzjx zzjx0, boolean z, Uri uri0, String s, String s1) {
        Bundle bundle0;
        zzjx0.zza.zzt();
        try {
            zznd zznd0 = zzjx0.zza.zzq();
            boolean z1 = zzpy.zza() && zzjx0.zza.zze().zza(zzbi.zzby);
            boolean z2 = zzoi.zza() && zzjx0.zza.zze().zza(zzbi.zzcs);
            if(TextUtils.isEmpty(s1)) {
                bundle0 = null;
            }
            else if(!s1.contains("gclid") && (!z2 || !s1.contains("gbraid")) && !s1.contains("utm_campaign") && !s1.contains("utm_source") && !s1.contains("utm_medium") && !s1.contains("utm_id") && !s1.contains("dclid") && !s1.contains("srsltid") && (!z1 || !s1.contains("sfmc_id"))) {
                zznd0.zzj().zzc().zza("Activity created with data \'referrer\' without required params");
                bundle0 = null;
            }
            else {
                bundle0 = zznd0.zza(Uri.parse(("https://google.com/search?" + s1)), z1, z2);
                if(bundle0 != null) {
                    bundle0.putString("_cis", "referrer");
                }
            }
            if(z) {
                Bundle bundle1 = zzjx0.zza.zzq().zza(uri0, zzpy.zza() && zzjx0.zza.zze().zza(zzbi.zzby), zzoi.zza() && zzjx0.zza.zze().zza(zzbi.zzcs));
                if(bundle1 != null) {
                    bundle1.putString("_cis", "intent");
                    if(!bundle1.containsKey("gclid") && bundle0 != null && bundle0.containsKey("gclid")) {
                        bundle1.putString("_cer", String.format("gclid=%s", bundle0.getString("gclid")));
                    }
                    zzjx0.zza.zzc(s, "_cmp", bundle1);
                    zzjx0.zza.zzb.zza(s, bundle1);
                }
            }
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            zzjx0.zza.zzj().zzc().zza("Activity created with referrer", s1);
            if(!zzjx0.zza.zze().zza(zzbi.zzbi)) {
                if(s1.contains("gclid") && (s1.contains("utm_campaign") || s1.contains("utm_source") || s1.contains("utm_medium") || s1.contains("utm_term") || s1.contains("utm_content"))) {
                    if(!TextUtils.isEmpty(s1)) {
                        zzjx0.zza.zza("auto", "_ldl", s1, true);
                    }
                    return;
                }
                zzjx0.zza.zzj().zzc().zza("Activity created with data \'referrer\' without required params");
                return;
            }
            if(bundle0 == null) {
                zzjx0.zza.zzj().zzc().zza("Referrer does not contain valid parameters", s1);
            }
            else {
                zzjx0.zza.zzc(s, "_cmp", bundle0);
                zzjx0.zza.zzb.zza(s, bundle0);
            }
            zzjx0.zza.zza("auto", "_ldl", null, true);
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        zzjx0.zza.zzj().zzg().zza("Throwable caught in handleReferrerForOnActivityCreated", runtimeException0);
    }
}

