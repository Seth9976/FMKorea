package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzewi implements Runnable {
    public final zzewj zza;
    public final zze zzb;

    public zzewi(zzewj zzewj0, zze zze0) {
        this.zza = zzewj0;
        this.zzb = zze0;
    }

    @Override
    public final void run() {
        zzewm.zzf(this.zza.zze).zzbF(this.zzb);
    }
}

