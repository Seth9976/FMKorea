package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdna implements zzbir {
    final zzdnb zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbir zzd;

    zzdna(zzdnb zzdnb0, WeakReference weakReference0, String s, zzbir zzbir0, zzdmz zzdmz0) {
        this.zza = zzdnb0;
        super();
        this.zzb = weakReference0;
        this.zzc = s;
        this.zzd = zzbir0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        Object object1 = this.zzb.get();
        if(object1 == null) {
            this.zza.zzk(this.zzc, this);
            return;
        }
        this.zzd.zza(object1, map0);
    }
}

