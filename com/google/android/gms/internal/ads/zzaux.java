package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class zzaux implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private final Object zzc;
    private boolean zzd;
    private boolean zze;
    private final List zzf;
    private final List zzg;
    private Runnable zzh;
    private boolean zzi;
    private long zzj;

    zzaux() {
        this.zzc = new Object();
        this.zzd = true;
        this.zze = false;
        this.zzf = new ArrayList();
        this.zzg = new ArrayList();
        this.zzi = false;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        synchronized(this.zzc) {
            Activity activity1 = this.zza;
            if(activity1 != null) {
                if(activity1.equals(activity0)) {
                    this.zza = null;
                }
                Iterator iterator0 = this.zzg.iterator();
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    zzavm zzavm0 = (zzavm)object1;
                    try {
                        if(!zzavm0.zza()) {
                            continue;
                        }
                        iterator0.remove();
                    }
                    catch(Exception exception0) {
                        zzt.zzo().zzu(exception0, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzcaa.zzh("", exception0);
                    }
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.zzk(activity0);
        synchronized(this.zzc) {
            for(Object object1: this.zzg) {
                zzavm zzavm0 = (zzavm)object1;
                try {
                    zzavm0.zzb();
                }
                catch(Exception exception0) {
                    zzt.zzo().zzu(exception0, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzcaa.zzh("", exception0);
                }
            }
        }
        this.zze = true;
        Runnable runnable0 = this.zzh;
        if(runnable0 != null) {
            zzs.zza.removeCallbacks(runnable0);
        }
        zzauw zzauw0 = new zzauw(this);
        this.zzh = zzauw0;
        zzs.zza.postDelayed(zzauw0, this.zzj);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.zzk(activity0);
        this.zze = false;
        boolean z = this.zzd;
        this.zzd = true;
        Runnable runnable0 = this.zzh;
        if(runnable0 != null) {
            zzs.zza.removeCallbacks(runnable0);
        }
        synchronized(this.zzc) {
            for(Object object1: this.zzg) {
                zzavm zzavm0 = (zzavm)object1;
                try {
                    zzavm0.zzc();
                }
                catch(Exception exception0) {
                    zzt.zzo().zzu(exception0, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzcaa.zzh("", exception0);
                }
            }
            if(z) {
                zzcaa.zze("App is still foreground.");
            }
            else {
                for(Object object2: this.zzf) {
                    zzauy zzauy0 = (zzauy)object2;
                    try {
                        zzauy0.zza(true);
                    }
                    catch(Exception exception1) {
                        zzcaa.zzh("", exception1);
                    }
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.zzk(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    static Object zzc(zzaux zzaux0) {
        return zzaux0.zzc;
    }

    static List zzd(zzaux zzaux0) {
        return zzaux0.zzf;
    }

    static void zze(zzaux zzaux0, boolean z) {
        zzaux0.zzd = false;
    }

    public final void zzf(zzauy zzauy0) {
        synchronized(this.zzc) {
            this.zzf.add(zzauy0);
        }
    }

    public final void zzg(Application application0, Context context0) {
        if(!this.zzi) {
            application0.registerActivityLifecycleCallbacks(this);
            if(context0 instanceof Activity) {
                this.zzk(((Activity)context0));
            }
            this.zzb = application0;
            this.zzj = (long)(((Long)zzba.zzc().zzb(zzbbr.zzaQ)));
            this.zzi = true;
        }
    }

    public final void zzh(zzauy zzauy0) {
        synchronized(this.zzc) {
            this.zzf.remove(zzauy0);
        }
    }

    static boolean zzi(zzaux zzaux0) {
        return zzaux0.zzd;
    }

    static boolean zzj(zzaux zzaux0) {
        return zzaux0.zze;
    }

    private final void zzk(Activity activity0) {
        synchronized(this.zzc) {
            if(!activity0.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.zza = activity0;
            }
        }
    }
}

