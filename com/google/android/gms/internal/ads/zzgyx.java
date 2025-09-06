package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzgyx extends zzgyp {
    private static final zzgzg zza;

    static {
        zzgyx.zza = zzgyu.zza(Collections.emptyMap());
    }

    zzgyx(Map map0, zzgyv zzgyv0) {
        super(map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zzd();
    }

    public static zzgyw zzc(int v) {
        return new zzgyw(v, null);
    }

    public final Map zzd() {
        LinkedHashMap linkedHashMap0 = zzgyq.zzb(this.zza().size());
        for(Object object0: this.zza().entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), ((zzgzg)((Map.Entry)object0).getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMap0);
    }
}

