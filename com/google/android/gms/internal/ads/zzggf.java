package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zzggf {
    private static final zzggf zza;
    private static final zzgge zzb;
    private final AtomicReference zzc;

    static {
        zzggf.zza = new zzggf();
        zzggf.zzb = new zzgge(null);
    }

    public zzggf() {
        this.zzc = new AtomicReference();
    }

    public static zzggf zza() {
        return zzggf.zza;
    }

    public final zzgjv zzb() {
        zzgjv zzgjv0 = (zzgjv)this.zzc.get();
        return zzgjv0 == null ? zzggf.zzb : zzgjv0;
    }
}

