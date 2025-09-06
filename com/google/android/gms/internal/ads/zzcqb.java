package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcqb implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzcqb(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzcyx zza() {
        return new zzcyx(((ScheduledExecutorService)this.zza.zzb()), ((Clock)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

