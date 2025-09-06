package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class zzgze implements zzgyt {
    private static final zzgyt zza;
    private final List zzb;
    private final List zzc;

    static {
        zzgze.zza = zzgyu.zza(Collections.emptySet());
    }

    zzgze(List list0, List list1, zzgzc zzgzc0) {
        this.zzb = list0;
        this.zzc = list1;
    }

    public static zzgzd zza(int v, int v1) {
        return new zzgzd(v, v1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zzc();
    }

    public final Set zzc() {
        int v = this.zzb.size();
        ArrayList arrayList0 = new ArrayList(this.zzc.size());
        int v1 = this.zzc.size();
        for(int v3 = 0; v3 < v1; ++v3) {
            Collection collection0 = (Collection)((zzgzg)this.zzc.get(v3)).zzb();
            v += collection0.size();
            arrayList0.add(collection0);
        }
        HashSet hashSet0 = zzgyq.zza(v);
        int v4 = this.zzb.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            Object object0 = ((zzgzg)this.zzb.get(v5)).zzb();
            object0.getClass();
            hashSet0.add(object0);
        }
        int v6 = arrayList0.size();
        for(int v2 = 0; v2 < v6; ++v2) {
            for(Object object1: ((Collection)arrayList0.get(v2))) {
                object1.getClass();
                hashSet0.add(object1);
            }
        }
        return Collections.unmodifiableSet(hashSet0);
    }
}

