package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.measurement.internal.zzim;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

public class zzdf {
    abstract class zza implements Runnable {
        final long zza;
        final long zzb;
        private final boolean zzc;
        private final zzdf zzd;

        zza() {
            this(true);
        }

        zza(boolean z) {
            this.zza = zzdf0.zza.currentTimeMillis();
            this.zzb = zzdf0.zza.elapsedRealtime();
            this.zzc = z;
        }

        @Override
        public void run() {
            if(zzdf.this.zzh) {
                this.zzb();
                return;
            }
            try {
                this.zza();
            }
            catch(Exception exception0) {
                zzdf.this.zza(exception0, false, this.zzc);
                this.zzb();
            }
        }

        abstract void zza();

        protected void zzb() {
        }
    }

    static final class zzb extends zzcz {
        private final zzil zza;

        zzb(zzil zzil0) {
            this.zza = zzil0;
        }

        @Override  // com.google.android.gms.internal.measurement.zzda
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override  // com.google.android.gms.internal.measurement.zzda
        public final void zza(String s, String s1, Bundle bundle0, long v) {
            this.zza.onEvent(s, s1, bundle0, v);
        }
    }

    static final class zzc extends zzcz {
        private final zzim zza;

        zzc(zzim zzim0) {
            this.zza = zzim0;
        }

        @Override  // com.google.android.gms.internal.measurement.zzda
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override  // com.google.android.gms.internal.measurement.zzda
        public final void zza(String s, String s1, Bundle bundle0, long v) {
            this.zza.interceptEvent(s, s1, bundle0, v);
        }
    }

    final class zzd implements Application.ActivityLifecycleCallbacks {
        final zzdf zza;

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity0, Bundle bundle0) {
            zzeo zzeo0 = new zzeo(this, bundle0, activity0);
            zzdf.this.zza(zzeo0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity0) {
            zzet zzet0 = new zzet(this, activity0);
            zzdf.this.zza(zzet0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity0) {
            zzes zzes0 = new zzes(this, activity0);
            zzdf.this.zza(zzes0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity0) {
            zzep zzep0 = new zzep(this, activity0);
            zzdf.this.zza(zzep0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
            zzcs zzcs0 = new zzcs();
            zzeu zzeu0 = new zzeu(this, activity0, zzcs0);
            zzdf.this.zza(zzeu0);
            Bundle bundle1 = zzcs0.zza(50L);
            if(bundle1 != null) {
                bundle0.putAll(bundle1);
            }
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity0) {
            zzeq zzeq0 = new zzeq(this, activity0);
            zzdf.this.zza(zzeq0);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity0) {
            zzer zzer0 = new zzer(this, activity0);
            zzdf.this.zza(zzer0);
        }
    }

    protected final Clock zza;
    private static volatile zzdf zzb;
    private final String zzc;
    private final ExecutorService zzd;
    private final AppMeasurementSdk zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    private volatile zzcu zzj;

    private zzdf(Context context0, String s, String s1, String s2, Bundle bundle0) {
        this.zzc = s == null || !this.zzc(s1, s2) ? "FA" : s;
        this.zza = DefaultClock.getInstance();
        this.zzd = zzch.zza().zza(new zzdr(this), zzcq.zza);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        int v = 1;
        if(zzdf.zzb(context0) && !this.zzk()) {
            this.zzi = null;
            this.zzh = true;
            Log.w(this.zzc, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if(this.zzc(s1, s2)) {
            this.zzi = s1;
        }
        else {
            this.zzi = "fa";
            if(s1 == null || s2 == null) {
                if(s2 != null) {
                    v = 0;
                }
                if(((s1 == null ? 1 : 0) ^ v) != 0) {
                    Log.w(this.zzc, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
            else {
                Log.v(this.zzc, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        this.zza(new zzdi(this, s1, s2, context0, bundle0));
        Application application0 = (Application)context0.getApplicationContext();
        if(application0 == null) {
            Log.w(this.zzc, "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application0.registerActivityLifecycleCallbacks(new zzd(this));
    }

    public static zzdf zza(Context context0) {
        return zzdf.zza(context0, null, null, null, null);
    }

    public static zzdf zza(Context context0, String s, String s1, String s2, Bundle bundle0) {
        Preconditions.checkNotNull(context0);
        if(zzdf.zzb == null) {
            synchronized(zzdf.class) {
                if(zzdf.zzb == null) {
                    zzdf.zzb = new zzdf(context0, s, s1, s2, bundle0);
                }
            }
        }
        return zzdf.zzb;
    }

    private final void zza(zza zzdf$zza0) {
        this.zzd.execute(zzdf$zza0);
    }

    private final void zza(Exception exception0, boolean z, boolean z1) {
        this.zzh |= z;
        if(z) {
            Log.w(this.zzc, "Data collection startup failed. No data will be collected.", exception0);
            return;
        }
        if(z1) {
            this.zza(5, "Error with data collection. Data lost.", exception0, null, null);
        }
        Log.w(this.zzc, "Error with data collection. Data lost.", exception0);
    }

    private final void zza(String s, String s1, Bundle bundle0, boolean z, boolean z1, Long long0) {
        this.zza(new zzel(this, long0, s, s1, bundle0, z, z1));
    }

    public final int zza(String s) {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzed(this, s, zzcs0));
        Integer integer0 = (Integer)zzcs.zza(zzcs0.zza(10000L), Integer.class);
        return integer0 == null ? 25 : ((int)integer0);
    }

    public final long zza() {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzdy(this, zzcs0));
        Long long0 = zzcs0.zzb(500L);
        if(long0 == null) {
            long v = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
            int v1 = this.zzg + 1;
            this.zzg = v1;
            return v + ((long)v1);
        }
        return (long)long0;
    }

    public final Bundle zza(Bundle bundle0, boolean z) {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzeb(this, bundle0, zzcs0));
        return z ? zzcs0.zza(5000L) : null;
    }

    protected final zzcu zza(Context context0, boolean z) {
        try {
            return zzct.asInterface(DynamiteModule.load(context0, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        }
        catch(LoadingException dynamiteModule$LoadingException0) {
            this.zza(dynamiteModule$LoadingException0, true, false);
            return null;
        }
    }

    public final Object zza(int v) {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzei(this, zzcs0, v));
        return zzcs.zza(zzcs0.zza(15000L), Object.class);
    }

    public final List zza(String s, String s1) {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzdj(this, s, s1, zzcs0));
        List list0 = (List)zzcs.zza(zzcs0.zza(5000L), List.class);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final Map zza(String s, String s1, boolean z) {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzdz(this, s, s1, z, zzcs0));
        Bundle bundle0 = zzcs0.zza(5000L);
        if(bundle0 != null && bundle0.size() != 0) {
            Map map0 = new HashMap(bundle0.size());
            for(Object object0: bundle0.keySet()) {
                String s2 = (String)object0;
                Object object1 = bundle0.get(s2);
                if(object1 instanceof Double || object1 instanceof Long || object1 instanceof String) {
                    map0.put(s2, object1);
                }
            }
            return map0;
        }
        return Collections.emptyMap();
    }

    public final void zza(int v, String s, Object object0, Object object1, Object object2) {
        this.zza(new zzec(this, false, 5, s, object0, null, null));
    }

    public final void zza(long v) {
        this.zza(new zzds(this, v));
    }

    public final void zza(Activity activity0, String s, String s1) {
        this.zza(new zzdl(this, activity0, s, s1));
    }

    public final void zza(Bundle bundle0) {
        this.zza(new zzdh(this, bundle0));
    }

    public final void zza(zzil zzil0) {
        zzb zzdf$zzb0;
        Preconditions.checkNotNull(zzil0);
        synchronized(this.zzf) {
            for(int v1 = 0; v1 < this.zzf.size(); ++v1) {
                if(zzil0.equals(((Pair)this.zzf.get(v1)).first)) {
                    Log.w(this.zzc, "OnEventListener already registered.");
                    return;
                }
            }
            zzdf$zzb0 = new zzb(zzil0);
            Pair pair0 = new Pair(zzil0, zzdf$zzb0);
            this.zzf.add(pair0);
        }
        if(this.zzj != null) {
            try {
                this.zzj.registerOnMeasurementEventListener(zzdf$zzb0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.zzc, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.zza(new zzej(this, zzdf$zzb0));
    }

    public final void zza(zzim zzim0) {
        zzc zzdf$zzc0 = new zzc(zzim0);
        if(this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzdf$zzc0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.zzc, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.zza(new zzee(this, zzdf$zzc0));
    }

    public final void zza(Boolean boolean0) {
        this.zza(new zzdo(this, boolean0));
    }

    public final void zza(String s, Bundle bundle0) {
        this.zza(null, s, bundle0, false, true, null);
    }

    public final void zza(String s, String s1, Bundle bundle0) {
        this.zza(new zzdk(this, s, s1, bundle0));
    }

    public final void zza(String s, String s1, Bundle bundle0, long v) {
        this.zza(s, s1, bundle0, true, false, v);
    }

    public final void zza(String s, String s1, Object object0, boolean z) {
        this.zza(new zzen(this, s, s1, object0, z));
    }

    public final void zza(boolean z) {
        this.zza(new zzeh(this, z));
    }

    private static boolean zzb(Context context0) {
        try {
            if(new zzgz(context0, zzgz.zza(context0)).zza("google_app_id") != null) {
                return true;
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        return false;
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    public final void zzb(Bundle bundle0) {
        this.zza(new zzdn(this, bundle0));
    }

    public final void zzb(zzil zzil0) {
        zzb zzdf$zzb0;
        Pair pair0;
        Preconditions.checkNotNull(zzil0);
        synchronized(this.zzf) {
            for(int v1 = 0; true; ++v1) {
                pair0 = null;
                if(v1 >= this.zzf.size()) {
                    break;
                }
                if(zzil0.equals(((Pair)this.zzf.get(v1)).first)) {
                    pair0 = (Pair)this.zzf.get(v1);
                    break;
                }
            }
            if(pair0 == null) {
                Log.w(this.zzc, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair0);
            zzdf$zzb0 = (zzb)pair0.second;
        }
        if(this.zzj != null) {
            try {
                this.zzj.unregisterOnMeasurementEventListener(zzdf$zzb0);
                return;
            }
            catch(RemoteException | BadParcelableException | IllegalArgumentException | IllegalStateException | NetworkOnMainThreadException | NullPointerException | SecurityException | UnsupportedOperationException unused_ex) {
                Log.w(this.zzc, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.zza(new zzem(this, zzdf$zzb0));
    }

    public final void zzb(String s) {
        this.zza(new zzdu(this, s));
    }

    public final void zzb(String s, String s1) {
        this.zza(null, s, s1, false);
    }

    public final void zzb(String s, String s1, Bundle bundle0) {
        this.zza(s, s1, bundle0, true, true, null);
    }

    private final boolean zzc(String s, String s1) {
        return s1 != null && s != null && !this.zzk();
    }

    public final Long zzc() {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzef(this, zzcs0));
        return zzcs0.zzb(120000L);
    }

    public final void zzc(Bundle bundle0) {
        this.zza(new zzdq(this, bundle0));
    }

    public final void zzc(String s) {
        this.zza(new zzdt(this, s));
    }

    public final String zzd() {
        return this.zzi;
    }

    public final void zzd(Bundle bundle0) {
        this.zza(new zzek(this, bundle0));
    }

    public final void zzd(String s) {
        this.zza(new zzdm(this, s));
    }

    public final String zze() {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzeg(this, zzcs0));
        return zzcs0.zzc(120000L);
    }

    public final String zzf() {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzdv(this, zzcs0));
        return zzcs0.zzc(50L);
    }

    public final String zzg() {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzea(this, zzcs0));
        return zzcs0.zzc(500L);
    }

    public final String zzh() {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzdx(this, zzcs0));
        return zzcs0.zzc(500L);
    }

    public final String zzi() {
        zzcs zzcs0 = new zzcs();
        this.zza(new zzdw(this, zzcs0));
        return zzcs0.zzc(500L);
    }

    public final void zzj() {
        this.zza(new zzdp(this));
    }

    private final boolean zzk() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, this.getClass().getClassLoader());
            return true;
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }
}

