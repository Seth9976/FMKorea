package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class zzfsf extends zzfsw implements zzfuo {
    protected zzfsf(Map map0) {
        super(map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsw
    Collection zza() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsw
    final Collection zzb(Collection collection0) {
        return Collections.unmodifiableList(((List)collection0));
    }

    @Override  // com.google.android.gms.internal.ads.zzfsw
    final Collection zzc(Object object0, Collection collection0) {
        return this.zzh(object0, ((List)collection0), null);
    }
}

