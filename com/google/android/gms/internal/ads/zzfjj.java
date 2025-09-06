package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class zzfjj implements Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private zzfji zzc;

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.zza(true);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        this.zza(this.zzh());
    }

    private final void zza(boolean z) {
        if(this.zza != z) {
            this.zza = z;
            if(this.zzb) {
                this.zzb(z);
                zzfji zzfji0 = this.zzc;
                if(zzfji0 != null) {
                    zzfji0.zzc(z);
                }
            }
        }
    }

    protected void zzb(boolean z) {
    }

    protected boolean zzc() {
        return false;
    }

    public final void zzd(Context context0) {
        if(context0 instanceof Application) {
            ((Application)context0).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze(zzfji zzfji0) {
        this.zzc = zzfji0;
    }

    public final void zzf() {
        this.zzb = true;
        boolean z = this.zzh();
        this.zza = z;
        this.zzb(z);
    }

    public final void zzg() {
        this.zzb = false;
        this.zzc = null;
    }

    private final boolean zzh() {
        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
        return activityManager$RunningAppProcessInfo0.importance == 100 || this.zzc();
    }
}

