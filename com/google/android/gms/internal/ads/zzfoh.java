package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

final class zzfoh {
    private static zzfoh zza;
    private final String zzb;
    private final SharedPreferences zzc;

    static {
    }

    private zzfoh(Context context0) {
        this.zzb = "com.fmkorea.m.fmk";
        this.zzc = context0.getSharedPreferences("paid_storage_sp", 0);
    }

    final long zza(String s, long v) {
        return this.zzc.getLong(s, -1L);
    }

    static zzfoh zzb(Context context0) {
        if(zzfoh.zza == null) {
            zzfoh.zza = new zzfoh(context0);
        }
        return zzfoh.zza;
    }

    final String zzc(String s, String s1) {
        return this.zzc.getString(s, null);
    }

    final void zzd(String s, Object object0) {
        boolean z;
        if(object0 instanceof String) {
            z = this.zzc.edit().putString(s, ((String)object0)).commit();
            goto label_8;
        }
        boolean z1 = false;
        if(object0 instanceof Long) {
            z1 = true;
            z = this.zzc.edit().putLong(s, ((long)(((Long)object0)))).commit();
        }
        else if(object0 instanceof Boolean) {
            z1 = true;
            z = this.zzc.edit().putBoolean(s, ((Boolean)object0).booleanValue()).commit();
        }
        if(z1) {
        label_8:
            if(z) {
                return;
            }
            String s1 = "Failed to store " + s + " for app " + this.zzb;
            Log.e("PaidLifecycleSPHandler", s1);
            throw new IOException(s1);
        }
        String s2 = "Unexpected object class " + object0.getClass() + " for app " + this.zzb;
        Log.e("PaidLifecycleSPHandler", s2);
        throw new IllegalArgumentException(s2);
    }

    final void zze(String s) {
        if(this.zzc.edit().remove(s).commit()) {
            return;
        }
        String s1 = "Failed to remove " + s + " for app " + this.zzb;
        Log.e("PaidLifecycleSPHandler", s1);
        throw new IOException(s1);
    }

    final boolean zzf(String s, boolean z) {
        return this.zzc.getBoolean(s, true);
    }

    final boolean zzg(String s) {
        return this.zzc.contains(s);
    }
}

