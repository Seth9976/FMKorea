package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.g;

public final class zzgc implements zzgh {
    private final g zza;

    zzgc(g g0) {
        this.zza = g0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzgh
    public final String zza(Uri uri0, String s, String s1, String s2) {
        g g0;
        if(uri0 == null) {
            g0 = s == null ? null : ((g)this.zza.get(s));
        }
        else {
            g0 = (g)this.zza.get(uri0.toString());
        }
        if(g0 == null) {
            return null;
        }
        if(s1 != null) {
            s2 = s1 + s2;
        }
        return (String)g0.get(s2);
    }
}

