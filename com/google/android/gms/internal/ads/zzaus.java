package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class zzaus implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc;

    public zzaus(Application application0, Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        this.zzc = false;
        this.zzb = new WeakReference(application$ActivityLifecycleCallbacks0);
        this.zza = application0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.zza(new zzauk(this, activity0, bundle0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.zza(new zzauq(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.zza(new zzaun(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.zza(new zzaum(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.zza(new zzaup(this, activity0, bundle0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.zza(new zzaul(this, activity0));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        this.zza(new zzauo(this, activity0));
    }

    protected final void zza(zzaur zzaur0) {
        try {
            Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0 = (Application.ActivityLifecycleCallbacks)this.zzb.get();
            if(application$ActivityLifecycleCallbacks0 != null) {
                zzaur0.zza(application$ActivityLifecycleCallbacks0);
                return;
            }
            if(!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
            return;
        }
        catch(Exception exception0) {
        }
        zzcaa.zzh("Error while dispatching lifecycle callback.", exception0);
    }
}

