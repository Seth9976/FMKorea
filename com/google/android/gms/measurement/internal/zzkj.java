package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzkj implements Runnable {
    private final Bundle zza;
    private final zzki zzb;
    private final zzki zzc;
    private final long zzd;
    private final zzkh zze;

    zzkj(zzkh zzkh0, Bundle bundle0, zzki zzki0, zzki zzki1, long v) {
        this.zze = zzkh0;
        this.zza = bundle0;
        this.zzb = zzki0;
        this.zzc = zzki1;
        this.zzd = v;
        super();
    }

    @Override
    public final void run() {
        zzkh.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}

