package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public final class zzes {
    private static final Object zza;
    private static final zzer zzb;

    static {
        zzes.zza = new Object();
        zzes.zzb = zzer.zza;
    }

    public static String zza(String s, Throwable throwable0) {
        CharSequence charSequence0;
        if(throwable0 == null) {
            return TextUtils.isEmpty(null) ? s : s + "\n  " + null.replace("\n", "\n  ") + "\n";
        }
        Object object0 = zzes.zza;
        __monitor_enter(object0);
        Throwable throwable1 = throwable0;
        try {
            while(true) {
                if(throwable1 == null) {
                    charSequence0 = Log.getStackTraceString(throwable0).trim().replace("\t", "    ");
                    break;
                }
                if(throwable1 instanceof UnknownHostException) {
                    charSequence0 = "UnknownHostException (no network)";
                    break;
                }
                throwable1 = throwable1.getCause();
            }
        }
        finally {
            __monitor_exit(object0);
        }
        return TextUtils.isEmpty(charSequence0) ? s : s + "\n  " + ((String)charSequence0).replace("\n", "\n  ") + "\n";
    }

    public static void zzb(String s, String s1) {
        synchronized(zzes.zza) {
            Log.d(s, zzes.zza(s1, null));
        }
    }

    public static void zzc(String s, String s1) {
        synchronized(zzes.zza) {
            Log.e(s, zzes.zza(s1, null));
        }
    }

    public static void zzd(String s, String s1, Throwable throwable0) {
        synchronized(zzes.zza) {
            Log.e(s, zzes.zza(s1, throwable0));
        }
    }

    public static void zze(String s, String s1) {
        synchronized(zzes.zza) {
            Log.i(s, zzes.zza(s1, null));
        }
    }

    public static void zzf(String s, String s1) {
        synchronized(zzes.zza) {
            Log.w(s, zzes.zza(s1, null));
        }
    }

    public static void zzg(String s, String s1, Throwable throwable0) {
        synchronized(zzes.zza) {
            Log.w(s, zzes.zza(s1, throwable0));
        }
    }
}

