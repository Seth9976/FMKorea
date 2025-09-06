package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzbmp implements zzcaw {
    final zzbmo zza;

    zzbmp(zzbmt zzbmt0, zzbmo zzbmo0) {
        this.zza = zzbmo0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zza(Object object0) {
        zze.zza("Getting a new session for JS Engine.");
        zzbmw zzbmw0 = ((zzblp)object0).zzj();
        this.zza.zzh(zzbmw0);
    }
}

