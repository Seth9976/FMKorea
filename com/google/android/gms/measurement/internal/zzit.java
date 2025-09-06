package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzit implements Runnable {
    private zziq zza;
    private Bundle zzb;

    public zzit(zziq zziq0, Bundle bundle0) {
        this.zza = zziq0;
        this.zzb = bundle0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

