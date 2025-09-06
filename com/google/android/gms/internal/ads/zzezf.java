package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzezf implements Runnable {
    public final zzezg zza;
    public final zze zzb;

    public zzezf(zzezg zzezg0, zze zze0) {
        this.zza = zzezg0;
        this.zzb = zze0;
    }

    @Override
    public final void run() {
        zzezh.zzd(this.zza.zze).zzbF(this.zzb);
    }
}

