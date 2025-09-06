package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzbw {
    final Map zza;
    private final AtomicInteger zzb;

    public zzbw() {
        this.zza = new ConcurrentHashMap();
        this.zzb = new AtomicInteger(0);
    }

    public final Bitmap zza(Integer integer0) {
        return (Bitmap)this.zza.get(integer0);
    }
}

