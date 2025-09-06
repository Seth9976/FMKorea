package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzfvq extends zzfui {
    private final transient zzfug zza;
    private final transient zzfud zzb;

    zzfvq(zzfug zzfug0, zzfud zzfud0) {
        this.zza = zzfug0;
        this.zzb = zzfud0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public final boolean contains(Object object0) {
        return this.zza.get(object0) != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final Iterator iterator() {
        return this.zzb.zzr(0);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zza(Object[] arr_object, int v) {
        return this.zzb.zza(arr_object, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfud zzd() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfwd zze() {
        return this.zzb.zzr(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        throw null;
    }
}

