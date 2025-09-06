package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzr;
import java.util.concurrent.Callable;

public final class zzgs implements Callable {
    private zzgp zza;

    public zzgs(zzgp zzgp0) {
        this.zza = zzgp0;
    }

    @Override
    public final Object call() {
        return new zzr(this.zza.zzb);
    }
}

