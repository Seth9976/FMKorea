package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.List;

public final class zzeva implements zzesj {
    final zzfyo zza;
    final List zzb;
    final zzbbc zzc;

    public zzeva(zzbbc zzbbc0, zzfyo zzfyo0, List list0) {
        this.zzc = zzbbc0;
        this.zza = zzfyo0;
        this.zzb = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 0x30;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzeuz zzeuz0 = new zzeuz(this);
        return this.zza.zzb(zzeuz0);
    }
}

