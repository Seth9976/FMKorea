package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzm;
import java.util.concurrent.Callable;

public final class zzgq implements Callable {
    private zzgp zza;
    private String zzb;

    public zzgq(zzgp zzgp0, String s) {
        this.zza = zzgp0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return new zzm("internal.remoteConfig", new zzgx(this.zza, this.zzb));
    }
}

