package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

final class zzga implements Runnable {
    private final zzfx zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    private zzga(String s, zzfx zzfx0, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        Preconditions.checkNotNull(zzfx0);
        this.zza = zzfx0;
        this.zzb = v;
        this.zzc = throwable0;
        this.zzd = arr_b;
        this.zze = s;
        this.zzf = map0;
    }

    zzga(String s, zzfx zzfx0, int v, Throwable throwable0, byte[] arr_b, Map map0, zzfz zzfz0) {
        this(s, zzfx0, v, throwable0, arr_b, map0);
    }

    @Override
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}

