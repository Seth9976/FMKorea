package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class zztj {
    public final zzgn zza;
    public final Uri zzb;
    public final Map zzc;
    private static final AtomicLong zzd;

    static {
        zztj.zzd = new AtomicLong();
    }

    public zztj(long v, zzgn zzgn0, Uri uri0, Map map0, long v1, long v2, long v3) {
        this.zza = zzgn0;
        this.zzb = uri0;
        this.zzc = map0;
    }

    public static long zza() {
        return zztj.zzd.getAndIncrement();
    }
}

