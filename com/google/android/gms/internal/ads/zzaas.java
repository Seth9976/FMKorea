package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

public final class zzaas implements zzaau {
    public static final zzaas zza;

    static {
        zzaas.zza = new zzaas();
    }

    @Override  // com.google.android.gms.internal.ads.zzaau
    public final Constructor zza() {
        Object object0 = Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null);
        return Boolean.TRUE.equals(object0) ? Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzabb.class).getConstructor(Integer.TYPE) : null;
    }
}

