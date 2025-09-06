package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class zzfsz implements zzfuz {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzfuz ? this.zzs().equals(((zzfuz)object0).zzs()) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzs().hashCode();
    }

    @Override
    public final String toString() {
        return this.zzs().toString();
    }

    abstract Collection zzf();

    Iterator zzg() {
        throw null;
    }

    abstract Map zzj();

    abstract Set zzl();

    @Override  // com.google.android.gms.internal.ads.zzfuz
    public boolean zzq(Object object0, Object object1) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuz
    public final Collection zzr() {
        Collection collection0 = this.zzb;
        if(collection0 == null) {
            collection0 = this.zzf();
            this.zzb = collection0;
        }
        return collection0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuz
    public final Map zzs() {
        Map map0 = this.zzc;
        if(map0 == null) {
            map0 = this.zzj();
            this.zzc = map0;
        }
        return map0;
    }

    public final Set zzt() {
        Set set0 = this.zza;
        if(set0 == null) {
            set0 = this.zzl();
            this.zza = set0;
        }
        return set0;
    }
}

