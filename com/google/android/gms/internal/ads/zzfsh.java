package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

final class zzfsh extends zzfuu {
    final zzfsj zza;

    zzfsh(zzfsj zzfsj0) {
        this.zza = zzfsj0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfuu
    public final boolean contains(Object object0) {
        return zzftc.zza(this.zza.zza.entrySet(), object0);
    }

    @Override
    public final Iterator iterator() {
        return new zzfsi(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfuu
    public final boolean remove(Object object0) {
        if(!this.contains(object0)) {
            return false;
        }
        ((Map.Entry)object0).getClass();
        Object object1 = ((Map.Entry)object0).getKey();
        zzfsw.zzo(this.zza.zzb, object1);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuu
    final Map zza() {
        return this.zza;
    }
}

