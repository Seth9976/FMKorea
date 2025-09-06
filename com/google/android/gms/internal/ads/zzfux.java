package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class zzfux extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    @Override
    public final Set entrySet() {
        Set set0 = this.zza;
        if(set0 == null) {
            set0 = this.zzb();
            this.zza = set0;
        }
        return set0;
    }

    @Override
    public Set keySet() {
        Set set0 = this.zzb;
        if(set0 == null) {
            set0 = this.zze();
            this.zzb = set0;
        }
        return set0;
    }

    @Override
    public final Collection values() {
        Collection collection0 = this.zzc;
        if(collection0 == null) {
            collection0 = new zzfuw(this);
            this.zzc = collection0;
        }
        return collection0;
    }

    abstract Set zzb();

    Set zze() {
        return new zzfuv(this);
    }
}

