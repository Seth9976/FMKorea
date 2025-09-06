package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbeb {
    static final AtomicBoolean zza;
    private static final AtomicReference zzb;
    private static final AtomicReference zzc;

    static {
        zzbeb.zzb = new AtomicReference();
        zzbeb.zzc = new AtomicReference();
        zzbeb.zza = new AtomicBoolean();
    }

    static zzbdz zza() {
        return (zzbdz)zzbeb.zzb.get();
    }

    static zzbea zzb() {
        return (zzbea)zzbeb.zzc.get();
    }

    public static void zzc(zzbdz zzbdz0) {
        zzbeb.zzb.set(zzbdz0);
    }
}

