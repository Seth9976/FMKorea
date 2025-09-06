package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class zzb extends LinkedHashMap {
    final zzc zza;

    zzb(zzc zzc0) {
        this.zza = zzc0;
        super();
    }

    @Override
    protected final boolean removeEldestEntry(Map.Entry map$Entry0) {
        synchronized(this.zza) {
            zzc zzc1 = this.zza;
            boolean z = false;
            if(this.size() <= zzc.zza(zzc1)) {
                return false;
            }
            zzc.zzc(zzc1).add(new Pair(((String)map$Entry0.getKey()), ((String)((Pair)map$Entry0.getValue()).second)));
            if(this.size() > zzc.zza(this.zza)) {
                z = true;
            }
            return z;
        }
    }
}

