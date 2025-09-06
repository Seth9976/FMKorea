package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzgz implements zzfrj {
    public static final zzgz zza;

    static {
        zzgz.zza = new zzgz();
    }

    @Override  // com.google.android.gms.internal.ads.zzfrj
    public final boolean zza(Object object0) {
        if(((String)object0) != null) {
            String s = zzfqo.zza(((String)object0));
            return !TextUtils.isEmpty(s) && (!s.contains("text") || s.contains("text/vtt")) && !s.contains("html") && !s.contains("xml");
        }
        return false;
    }
}

