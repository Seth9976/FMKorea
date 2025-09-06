package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

public final class zzeoj implements zzesj {
    private final AtomicReference zza;
    private final Clock zzb;
    private final zzesj zzc;
    private final long zzd;

    public zzeoj(zzesj zzesj0, long v, Clock clock0) {
        this.zza = new AtomicReference();
        this.zzb = clock0;
        this.zzc = zzesj0;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 16;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzeoi zzeoi0 = (zzeoi)this.zza.get();
        if(zzeoi0 == null || zzeoi0.zza()) {
            zzeoi0 = new zzeoi(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzeoi0);
        }
        return zzeoi0.zza;
    }
}

