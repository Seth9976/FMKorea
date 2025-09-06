package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzffw {
    private static final d zza;
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final zzffx zzd;

    static {
        zzffw.zza = zzfye.zzh(null);
    }

    public zzffw(zzfyo zzfyo0, ScheduledExecutorService scheduledExecutorService0, zzffx zzffx0) {
        this.zzb = zzfyo0;
        this.zzc = scheduledExecutorService0;
        this.zzd = zzffx0;
    }

    public final zzffm zza(Object object0, d[] arr_d) {
        return new zzffm(this, object0, Arrays.asList(arr_d), null);
    }

    public final zzffv zzb(Object object0, d d0) {
        return new zzffv(this, object0, null, d0, Collections.singletonList(d0), d0, null);
    }

    static d zzd() {
        return zzffw.zza;
    }

    static zzfyo zze(zzffw zzffw0) {
        return zzffw0.zzb;
    }

    protected abstract String zzf(Object arg1);

    static ScheduledExecutorService zzg(zzffw zzffw0) {
        return zzffw0.zzc;
    }
}

