package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

public final class zzblr implements Predicate {
    public final zzbir zza;

    public zzblr(zzbir zzbir0) {
        this.zza = zzbir0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.common.util.Predicate
    public final boolean apply(Object object0) {
        return ((zzbir)object0) instanceof zzblw && zzblw.zzb(((zzblw)(((zzbir)object0)))).equals(this.zza);
    }
}

