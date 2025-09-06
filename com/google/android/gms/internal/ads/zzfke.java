package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzfke {
    public static void zza(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException(s1);
        }
    }

    public static void zzb(Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException(s);
        }
    }
}

