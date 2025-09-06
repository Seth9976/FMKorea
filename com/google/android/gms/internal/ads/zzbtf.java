package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class zzbtf implements zzbth {
    static zzbth zza;
    static zzbth zzb;
    private static final Object zzc;
    private final Object zzd;
    private final Context zze;
    private final WeakHashMap zzf;
    private final ExecutorService zzg;
    private final zzcag zzh;

    static {
        zzbtf.zzc = new Object();
    }

    protected zzbtf(Context context0, zzcag zzcag0) {
        this.zzd = new Object();
        this.zzf = new WeakHashMap();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zze = context0;
        this.zzh = zzcag0;
    }

    public static zzbth zza(Context context0) {
        synchronized(zzbtf.zzc) {
            if(zzbtf.zza == null) {
                zzbtf.zza = !((Boolean)zzbds.zze.zze()).booleanValue() || ((Boolean)zzba.zzc().zzb(zzbbr.zzhv)).booleanValue() ? new zzbtg() : new zzbtf(context0, zzcag.zza());
            }
            return zzbtf.zza;
        }
    }

    public static zzbth zzb(Context context0, zzcag zzcag0) {
        synchronized(zzbtf.zzc) {
            if(zzbtf.zzb == null) {
                if(!((Boolean)zzbds.zze.zze()).booleanValue() || ((Boolean)zzba.zzc().zzb(zzbbr.zzhv)).booleanValue()) {
                    zzbtf.zzb = new zzbtg();
                }
                else {
                    zzbtf zzbtf0 = new zzbtf(context0, zzcag0);
                    Thread thread0 = Looper.getMainLooper().getThread();
                    if(thread0 != null) {
                        Object object1 = zzbtf0.zzd;
                        synchronized(object1) {
                            zzbtf0.zzf.put(thread0, Boolean.TRUE);
                        }
                        thread0.setUncaughtExceptionHandler(new zzbte(zzbtf0, thread0.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new zzbtd(zzbtf0, Thread.getDefaultUncaughtExceptionHandler()));
                    zzbtf.zzb = zzbtf0;
                }
            }
            return zzbtf.zzb;
        }
    }

    public static String zzc(Throwable throwable0) {
        StringWriter stringWriter0 = new StringWriter();
        throwable0.printStackTrace(new PrintWriter(stringWriter0));
        return stringWriter0.toString();
    }

    public static String zzd(Throwable throwable0) {
        return zzfrx.zzc(zzbzt.zzf(zzbtf.zzc(throwable0)));
    }

    protected final void zze(Thread thread0, Throwable throwable0) {
        if(throwable0 != null) {
            boolean z = false;
            boolean z1 = false;
            for(Throwable throwable1 = throwable0; throwable1 != null; throwable1 = throwable1.getCause()) {
                StackTraceElement[] arr_stackTraceElement = throwable1.getStackTrace();
                for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                    StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                    z |= zzbzt.zzo(stackTraceElement0.getClassName());
                    z1 |= "com.google.android.gms.internal.ads.zzbtf".equals(stackTraceElement0.getClassName());
                }
            }
            if(z && !z1) {
                this.zzg(throwable0, "", 1.0f);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbth
    public final void zzf(Throwable throwable0, String s) {
        this.zzg(throwable0, s, 1.0f);
    }

    @Override  // com.google.android.gms.internal.ads.zzbth
    public final void zzg(Throwable throwable0, String s, float f) {
        Throwable throwable1;
        boolean z = false;
        if(((Boolean)zzbds.zzf.zze()).booleanValue()) {
            throwable1 = throwable0;
            goto label_35;
        }
        else {
            LinkedList linkedList0 = new LinkedList();
            for(Throwable throwable2 = throwable0; throwable2 != null; throwable2 = throwable2.getCause()) {
                linkedList0.push(throwable2);
            }
            throwable1 = null;
            while(!linkedList0.isEmpty()) {
                Throwable throwable3 = (Throwable)linkedList0.pop();
                StackTraceElement[] arr_stackTraceElement = throwable3.getStackTrace();
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(new StackTraceElement(throwable3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z1 = false;
                for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                    StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                    if(zzbzt.zzo(stackTraceElement0.getClassName())) {
                        arrayList0.add(stackTraceElement0);
                        z1 = true;
                    }
                    else {
                        String s1 = stackTraceElement0.getClassName();
                        if(!TextUtils.isEmpty(s1) && (s1.startsWith("android.") || s1.startsWith("java."))) {
                            arrayList0.add(stackTraceElement0);
                        }
                        else {
                            arrayList0.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if(z1) {
                    throwable1 = throwable1 == null ? new Throwable(throwable3.getMessage()) : new Throwable(throwable3.getMessage(), throwable1);
                    throwable1.setStackTrace(((StackTraceElement[])arrayList0.toArray(new StackTraceElement[0])));
                }
            }
        label_35:
            if(throwable1 == null) {
                return;
            }
        }
        String s2 = throwable0.getClass().getName();
        String s3 = zzbtf.zzc(throwable0);
        String s4 = ((Boolean)zzba.zzc().zzb(zzbbr.zziu)).booleanValue() ? zzbtf.zzd(throwable0) : "";
        int v1 = Float.compare(f, 0.0f) <= 0 ? 1 : ((int)(1.0f / f));
        if(Math.random() < ((double)f)) {
            ArrayList arrayList1 = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            }
            catch(Throwable throwable4) {
                zzcaa.zzh("Error fetching instant app info", throwable4);
            }
            Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", "33").appendQueryParameter("device", (Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : Build.MANUFACTURER + " " + Build.MODEL)).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", "com.fmkorea.m.fmk").appendQueryParameter("exceptiontype", s2).appendQueryParameter("stacktrace", s3).appendQueryParameter("eids", TextUtils.join(",", zzba.zza().zza())).appendQueryParameter("exceptionkey", s).appendQueryParameter("cl", "559203513").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(v1)).appendQueryParameter("pb_tm", "1.0").appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", (this.zzh.zze ? "1" : "0"));
            if(!TextUtils.isEmpty(s4)) {
                uri$Builder0.appendQueryParameter("hash", s4);
            }
            arrayList1.add(uri$Builder0.toString());
            for(Object object0: arrayList1) {
                zzbtc zzbtc0 = new zzbtc(new zzcaf(null), ((String)object0));
                this.zzg.execute(zzbtc0);
            }
        }
    }
}

