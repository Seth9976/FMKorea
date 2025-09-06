package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzcoq implements zzbir {
    final zzcot zza;

    zzcoq(zzcot zzcot0) {
        this.zza = zzcot0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(!zzcot.zzg(this.zza, map0)) {
            return;
        }
        zzcot.zzb(this.zza).execute(new zzcop(this));
    }
}

