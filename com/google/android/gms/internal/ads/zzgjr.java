package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

public final class zzgjr {
    private HashMap zza;

    public zzgjr() {
        this.zza = new HashMap();
    }

    public final zzgjt zza() {
        if(this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgjt zzgjt0 = new zzgjt(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgjt0;
    }
}

