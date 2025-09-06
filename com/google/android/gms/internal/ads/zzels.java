package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final class zzels implements Runnable {
    public final zzelt zza;
    public final zze zzb;

    public zzels(zzelt zzelt0, zze zze0) {
        this.zza = zzelt0;
        this.zzb = zze0;
    }

    @Override
    public final void run() {
        zzelu.zzd(this.zza.zze).zza().zzbF(this.zzb);
    }
}

