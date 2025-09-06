package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzx;
import java.util.concurrent.Callable;

public final class zzgt implements Callable {
    private zzgp zza;
    private String zzb;

    public zzgt(zzgp zzgp0, String s) {
        this.zza = zzgp0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return new zzx("internal.appMetadata", new zzgr(this.zza, this.zzb));
    }
}

