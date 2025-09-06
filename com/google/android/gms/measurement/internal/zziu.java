package com.google.android.gms.measurement.internal;

import java.util.List;

public final class zziu implements Runnable {
    private zziq zza;
    private List zzb;

    public zziu(zziq zziq0, List list0) {
        this.zza = zziq0;
        this.zzb = list0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

