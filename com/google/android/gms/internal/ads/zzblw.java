package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzblw implements zzbir {
    final zzblx zza;
    private final zzbir zzb;

    public zzblw(zzblx zzblx0, zzbir zzbir0) {
        this.zza = zzblx0;
        super();
        this.zzb = zzbir0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcfi zzcfi0 = (zzcfi)object0;
        this.zzb.zza(this.zza, map0);
    }

    static zzbir zzb(zzblw zzblw0) {
        return zzblw0.zzb;
    }
}

