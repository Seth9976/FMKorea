package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdgy implements zzbir {
    private final WeakReference zza;

    zzdgy(zzdgz zzdgz0, zzdgx zzdgx0) {
        this.zza = new WeakReference(zzdgz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzdgz zzdgz0 = (zzdgz)this.zza.get();
        if(zzdgz0 == null) {
            return;
        }
        zzdgz.zzc(zzdgz0).zza();
    }
}

