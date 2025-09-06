package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zzhz implements Callable {
    private final zzbg zza;
    private final String zzb;
    private final zzhj zzc;

    zzhz(zzhj zzhj0, zzbg zzbg0, String s) {
        this.zzc = zzhj0;
        this.zza = zzbg0;
        this.zzb = s;
        super();
    }

    @Override
    public final Object call() {
        this.zzc.zza.zzr();
        return this.zzc.zza.zzm().zza(this.zza, this.zzb);
    }
}

