package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzhe {
    private final Map zza;
    private Map zzb;

    public zzhe() {
        this.zza = new HashMap();
    }

    public final Map zza() {
        synchronized(this) {
            if(this.zzb == null) {
                this.zzb = Collections.unmodifiableMap(new HashMap(this.zza));
            }
            return this.zzb;
        }
    }
}

