package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzcos implements zzbir {
    final zzcot zza;

    zzcos(zzcot zzcot0) {
        this.zza = zzcot0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(!zzcot.zzg(this.zza, map0)) {
            return;
        }
        zzcor zzcor0 = new zzcor(this);
        zzcot.zzb(this.zza).execute(zzcor0);
    }
}

