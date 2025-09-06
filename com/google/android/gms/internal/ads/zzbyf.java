package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbyf {
    final AtomicBoolean zza;
    private final AtomicReference zzb;
    private final Object zzc;
    private String zzd;
    private String zze;
    private final AtomicInteger zzf;
    private final AtomicReference zzg;
    private final AtomicReference zzh;
    private final ConcurrentMap zzi;
    private final AtomicReference zzj;
    private final BlockingQueue zzk;
    private final Object zzl;

    public zzbyf() {
        this.zzb = new AtomicReference(null);
        this.zzc = new Object();
        this.zzd = null;
        this.zze = null;
        this.zza = new AtomicBoolean(false);
        this.zzf = new AtomicInteger(-1);
        this.zzg = new AtomicReference(null);
        this.zzh = new AtomicReference(null);
        this.zzi = new ConcurrentHashMap(9);
        this.zzj = new AtomicReference(null);
        this.zzk = new ArrayBlockingQueue(20);
        this.zzl = new Object();
    }

    private final void zzA(Context context0, String s, String s1) {
        if(this.zzE(context0, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            Method method0 = (Method)this.zzi.get(s1);
            if(method0 == null) {
                try {
                    method0 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(s1, String.class);
                    this.zzi.put(s1, method0);
                }
                catch(Exception unused_ex) {
                    this.zzC(s1, false);
                    method0 = null;
                }
            }
            try {
                method0.invoke(this.zzg.get(), s);
                zze.zza(("Invoke Firebase method " + s1 + ", Ad Unit Id: " + s));
            }
            catch(Exception unused_ex) {
                this.zzC(s1, false);
            }
        }
    }

    private final void zzB(Context context0, String s, String s1, Bundle bundle0) {
        if(this.zzu(context0)) {
            Bundle bundle1 = new Bundle();
            try {
                bundle1.putLong("_aeid", Long.parseLong(s1));
            }
            catch(NullPointerException | NumberFormatException nullPointerException0) {
                zzcaa.zzh(("Invalid event ID: " + s1), nullPointerException0);
            }
            if("_ac".equals(s)) {
                bundle1.putInt("_r", 1);
            }
            if(bundle0 != null) {
                bundle1.putAll(bundle0);
            }
            if(zzbyf.zzv(context0)) {
                this.zzD("logEventInternal", new zzbxr(s, bundle1));
                return;
            }
            if(this.zzE(context0, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                Method method0 = (Method)this.zzi.get("logEventInternal");
                if(method0 == null) {
                    try {
                        method0 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzi.put("logEventInternal", method0);
                    }
                    catch(Exception unused_ex) {
                        this.zzC("logEventInternal", true);
                        method0 = null;
                    }
                }
                try {
                    method0.invoke(this.zzg.get(), "am", s, bundle1);
                }
                catch(Exception unused_ex) {
                    this.zzC("logEventInternal", true);
                }
            }
        }
    }

    private final void zzC(String s, boolean z) {
        if(!this.zza.get()) {
            zzcaa.zzj(("Invoke Firebase method " + s + " error."));
            if(z) {
                zzcaa.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zza.set(true);
            }
        }
    }

    private final void zzD(String s, zzbye zzbye0) {
        synchronized(this.zzj) {
            FutureTask futureTask0 = new FutureTask(() -> if(((zzcgz)this.zzj.get()) != null) {
                try {
                    zzbye0.zza(((zzcgz)this.zzj.get()));
                }
                catch(Exception unused_ex) {
                    this.zzC(s, false);
                }
            }, null);
            if(this.zzj.get() == null) {
                this.zzk.offer(futureTask0);
            }
            else {
                futureTask0.run();
            }
        }
    }

    private final boolean zzE(Context context0, String s, AtomicReference atomicReference0, boolean z) {
        if(atomicReference0.get() == null) {
            try {
                zzbxo.zza(atomicReference0, null, context0.getClassLoader().loadClass(s).getDeclaredMethod("getInstance", Context.class).invoke(null, context0));
                return true;
            }
            catch(Exception unused_ex) {
                this.zzC("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final String zza(Context context0) {
        if(!this.zzu(context0)) {
            return null;
        }
        if(zzbyf.zzv(context0)) {
            Long long0 = (Long)this.zzw("getAdEventId", null, (zzbxt this) -> zzcgz0.zzc());
            return long0 == null ? null : Long.toString(((long)long0));
        }
        Object object0 = this.zzx("generateEventId", context0);
        return object0 == null ? null : object0.toString();
    }

    public final String zzb(Context context0) {
        if(!this.zzu(context0)) {
            return null;
        }
        synchronized(this.zzc) {
            String s = this.zze;
            if(s != null) {
                return s;
            }
            this.zze = zzbyf.zzv(context0) ? ((String)this.zzw("getAppIdOrigin", this.zze, (zzbxx this) -> zzcgz0.zze())) : "fa";
            return this.zze;
        }
    }

    public final String zzc(Context context0) {
        if(!this.zzu(context0)) {
            return null;
        }
        long v = (long)(((Long)zzba.zzc().zzb(zzbbr.zzag)));
        if(zzbyf.zzv(context0)) {
            try {
                return v >= 0L ? ((String)this.zzz().submit(() -> ((String)this.zzw("getAppInstanceId", null, (zzbxy this) -> zzcgz0.zzf()))).get(v, TimeUnit.MILLISECONDS)) : ((String)this.zzw("getAppInstanceId", null, (zzbxy this) -> zzcgz0.zzf()));
            }
            catch(TimeoutException unused_ex) {
                return "TIME_OUT";
            }
            catch(Exception unused_ex) {
                return null;
            }
        }
        if(v < 0L) {
            return (String)this.zzx("getAppInstanceId", context0);
        }
        Future future0 = this.zzz().submit(() -> ((String)this.zzx("getAppInstanceId", context0)));
        try {
            return (String)future0.get(v, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException unused_ex) {
            return "TIME_OUT";
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public final String zzd(Context context0) {
        if(!this.zzu(context0)) {
            return "";
        }
        if(zzbyf.zzv(context0)) {
            return (String)this.zzw("getCurrentScreenNameOrScreenClass", "", zzbxu.zza);
        }
        if(!this.zzE(context0, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return "";
        }
        try {
            String s = (String)this.zzy(context0, "getCurrentScreenName").invoke(this.zzg.get(), null);
            if(s == null) {
                s = (String)this.zzy(context0, "getCurrentScreenClass").invoke(this.zzg.get(), null);
            }
            return s == null ? "" : s;
        }
        catch(Exception unused_ex) {
            this.zzC("getCurrentScreenName", false);
            return "";
        }
    }

    public final String zze(Context context0) {
        if(!this.zzu(context0)) {
            return null;
        }
        synchronized(this.zzc) {
            String s = this.zzd;
            if(s != null) {
                return s;
            }
            this.zzd = zzbyf.zzv(context0) ? ((String)this.zzw("getGmpAppId", this.zzd, (zzbxq this) -> zzcgz0.zzi())) : ((String)this.zzx("getGmpAppId", context0));
            return this.zzd;
        }
    }

    // 检测为 Lambda 实现
    final String zzf() [...]

    // 检测为 Lambda 实现
    final String zzg(Context context0) [...]

    public final void zzh(Context context0, String s) {
        if(!this.zzu(context0)) {
            return;
        }
        if(zzbyf.zzv(context0)) {
            this.zzD("beginAdUnitExposure", new zzbxp(s));
            return;
        }
        this.zzA(context0, s, "beginAdUnitExposure");
    }

    public final void zzi(Context context0, String s) {
        if(!this.zzu(context0)) {
            return;
        }
        if(zzbyf.zzv(context0)) {
            this.zzD("endAdUnitExposure", new zzbxw(s));
            return;
        }
        this.zzA(context0, s, "endAdUnitExposure");
    }

    // 检测为 Lambda 实现
    final void zzj(zzbye zzbye0, String s) [...]

    public final void zzk(Context context0, String s) {
        this.zzB(context0, "_aa", s, null);
    }

    public final void zzl(Context context0, String s) {
        this.zzB(context0, "_aq", s, null);
    }

    public final void zzm(Context context0, String s) {
        this.zzB(context0, "_ac", s, null);
    }

    public final void zzn(Context context0, String s) {
        this.zzB(context0, "_ai", s, null);
    }

    public final void zzo(Context context0, String s, String s1, String s2, int v) {
        if(!this.zzu(context0)) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s1);
        bundle0.putString("reward_type", s2);
        bundle0.putInt("reward_value", v);
        this.zzB(context0, "_ar", s, bundle0);
        zze.zza(("Log a Firebase reward video event, reward type: " + s2 + ", reward value: " + v));
    }

    public final void zzp(Context context0, zzl zzl0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzan)).booleanValue() && this.zzu(context0) && zzbyf.zzv(context0)) {
        }
    }

    public final void zzq(Context context0, zzff zzff0) {
        zzbyg.zzd(context0).zzb().zzd(zzff0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzan)).booleanValue() && this.zzu(context0) && zzbyf.zzv(context0)) {
        }
    }

    public final void zzr(Bundle bundle0) {
        this.zzD("setConsent", new zzbyb(bundle0));
    }

    @Deprecated
    public final void zzs(Context context0, String s) {
        if(!this.zzu(context0)) {
            return;
        }
        if(!(context0 instanceof Activity)) {
            return;
        }
        if(zzbyf.zzv(context0)) {
            this.zzD("setScreenName", new zzbxv(context0, s));
            return;
        }
        if(this.zzE(context0, "com.google.firebase.analytics.FirebaseAnalytics", this.zzh, false)) {
            Method method0 = (Method)this.zzi.get("setCurrentScreen");
            if(method0 == null) {
                try {
                    method0 = context0.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.zzi.put("setCurrentScreen", method0);
                }
                catch(Exception unused_ex) {
                    this.zzC("setCurrentScreen", false);
                    method0 = null;
                }
            }
            try {
                method0.invoke(this.zzh.get(), ((Activity)context0), s, "com.fmkorea.m.fmk");
            }
            catch(Exception unused_ex) {
                this.zzC("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzt() {
        synchronized(this.zzl) {
        }
        return false;
    }

    public final boolean zzu(Context context0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzab)).booleanValue() && !this.zza.get()) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzal)).booleanValue()) {
                return true;
            }
            if(this.zzf.get() == -1) {
                if(!zzbzt.zzs(context0, 12451000) && zzbzt.zzt(context0)) {
                    zzcaa.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.zzf.set(0);
                    return this.zzf.get() == 1;
                }
                this.zzf.set(1);
            }
            return this.zzf.get() == 1;
        }
        return false;
    }

    static final boolean zzv(Context context0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzai)).booleanValue() || DynamiteModule.getLocalVersion(context0, "com.google.android.gms.ads.dynamite") < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzaj))))) {
            return false;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzak)).booleanValue()) {
            try {
                context0.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        return true;
    }

    private final Object zzw(String s, Object object0, zzbyd zzbyd0) {
        synchronized(this.zzj) {
            if(((zzcgz)this.zzj.get()) != null) {
                try {
                    return zzbyd0.zza(((zzcgz)this.zzj.get()));
                }
                catch(Exception unused_ex) {
                    this.zzC(s, false);
                }
            }
            return object0;
        }
    }

    private final Object zzx(String s, Context context0) {
        if(!this.zzE(context0, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            return null;
        }
        Method method0 = this.zzy(context0, s);
        try {
            return method0.invoke(this.zzg.get(), null);
        }
        catch(Exception unused_ex) {
            this.zzC(s, true);
            return null;
        }
    }

    private final Method zzy(Context context0, String s) {
        Method method0 = (Method)this.zzi.get(s);
        if(method0 != null) {
            return method0;
        }
        try {
            Method method1 = context0.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(s, null);
            this.zzi.put(s, method1);
            return method1;
        }
        catch(Exception unused_ex) {
            this.zzC(s, false);
            return null;
        }
    }

    private final ExecutorService zzz() {
        if(this.zzb.get() == null) {
            ExecutorService executorService0 = new ThreadPoolExecutor(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzah)))), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzah)))), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbyc(this));
            zzbxo.zza(this.zzb, null, executorService0);
        }
        return (ExecutorService)this.zzb.get();
    }
}

