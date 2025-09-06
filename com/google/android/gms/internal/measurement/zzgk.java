package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.a;

public final class zzgk {
    private static final a zza;

    static {
        zzgk.zza = new a();
    }

    public static Uri zza(String s) {
        synchronized(zzgk.class) {
            a a0 = zzgk.zza;
            Uri uri0 = (Uri)a0.get(s);
            if(uri0 == null) {
                uri0 = Uri.parse(("content://com.google.android.gms.phenotype/" + Uri.encode(s)));
                a0.put(s, uri0);
            }
            return uri0;
        }
    }

    public static String zza(Context context0, String s) {
        if(s.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + s);
        }
        return s + "#" + "" + "com.fmkorea.m.fmk";
    }
}

