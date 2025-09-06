package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdfj implements zzgyt {
    private final zzdet zza;
    private final zzgzg zzb;

    public zzdfj(zzdet zzdet0, zzgzg zzgzg0) {
        this.zza = zzdet0;
        this.zzb = zzgzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Executor executor0 = (Executor)this.zzb.zzb();
        return this.zza.zzd(executor0);
    }
}

