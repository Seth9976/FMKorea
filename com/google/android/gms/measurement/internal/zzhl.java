package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzhl implements Runnable {
    private final zzo zza;
    private final zzhj zzb;

    zzhl(zzhj zzhj0, zzo zzo0) {
        this.zzb = zzhj0;
        this.zza = zzo0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza.zzr();
        zzmp zzmp0 = this.zzb.zza;
        zzmp0.zzl().zzt();
        zzmp0.zzs();
        Preconditions.checkNotEmpty(this.zza.zza);
        zzmp0.zza(this.zza);
    }
}

