package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzhi implements Runnable {
    private zzhj zza;
    private String zzb;
    private Bundle zzc;

    public zzhi(zzhj zzhj0, String s, Bundle bundle0) {
        this.zza = zzhj0;
        this.zzb = s;
        this.zzc = bundle0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}

