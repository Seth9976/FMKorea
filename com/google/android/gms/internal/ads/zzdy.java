package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzdy {
    public static int zza(int v, int v1, int v2) {
        if(v < 0 || v >= v2) {
            throw new IndexOutOfBoundsException();
        }
        return v;
    }

    public static Object zzb(Object object0) {
        if(object0 == null) {
            throw new IllegalStateException();
        }
        return object0;
    }

    public static String zzc(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException();
        }
        return s;
    }

    public static void zzd(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(((String)object0));
        }
    }

    public static void zzf(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }
}

