package com.google.android.gms.internal.ads;

import android.util.Log;

public class zzcaa {
    protected static final zzfrv zza;

    static {
        zzcaa.zza = zzfrv.zzb(4000);
    }

    static String zzd(String s) {
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        return arr_stackTraceElement.length < 4 ? s : s + " @" + arr_stackTraceElement[3].getLineNumber();
    }

    public static void zze(String s) {
        if(zzcaa.zzm(3)) {
            if(s != null && s.length() > 4000) {
                boolean z = true;
                for(Object object0: zzcaa.zza.zzd(s)) {
                    String s1 = (String)object0;
                    if(z) {
                        Log.d("Ads", s1);
                    }
                    else {
                        Log.d("Ads-cont", s1);
                    }
                    z = false;
                }
                return;
            }
            Log.d("Ads", s);
        }
    }

    public static void zzf(String s, Throwable throwable0) {
        if(zzcaa.zzm(3)) {
            Log.d("Ads", s, throwable0);
        }
    }

    public static void zzg(String s) {
        if(zzcaa.zzm(6)) {
            if(s != null && s.length() > 4000) {
                boolean z = true;
                for(Object object0: zzcaa.zza.zzd(s)) {
                    String s1 = (String)object0;
                    if(z) {
                        Log.e("Ads", s1);
                    }
                    else {
                        Log.e("Ads-cont", s1);
                    }
                    z = false;
                }
                return;
            }
            Log.e("Ads", s);
        }
    }

    public static void zzh(String s, Throwable throwable0) {
        if(zzcaa.zzm(6)) {
            Log.e("Ads", s, throwable0);
        }
    }

    public static void zzi(String s) {
        if(zzcaa.zzm(4)) {
            if(s != null && s.length() > 4000) {
                boolean z = true;
                for(Object object0: zzcaa.zza.zzd(s)) {
                    String s1 = (String)object0;
                    if(z) {
                        Log.i("Ads", s1);
                    }
                    else {
                        Log.i("Ads-cont", s1);
                    }
                    z = false;
                }
                return;
            }
            Log.i("Ads", s);
        }
    }

    public static void zzj(String s) {
        if(zzcaa.zzm(5)) {
            if(s != null && s.length() > 4000) {
                boolean z = true;
                for(Object object0: zzcaa.zza.zzd(s)) {
                    String s1 = (String)object0;
                    if(z) {
                        Log.w("Ads", s1);
                    }
                    else {
                        Log.w("Ads-cont", s1);
                    }
                    z = false;
                }
                return;
            }
            Log.w("Ads", s);
        }
    }

    public static void zzk(String s, Throwable throwable0) {
        if(zzcaa.zzm(5)) {
            Log.w("Ads", s, throwable0);
        }
    }

    public static void zzl(String s, Throwable throwable0) {
        if(zzcaa.zzm(5)) {
            if(throwable0 != null) {
                zzcaa.zzk(zzcaa.zzd(s), throwable0);
                return;
            }
            zzcaa.zzj(zzcaa.zzd(s));
        }
    }

    public static boolean zzm(int v) {
        return v >= 5 || Log.isLoggable("Ads", v);
    }
}

