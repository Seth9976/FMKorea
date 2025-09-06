package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public final class zzbch {
    private final Map zza;
    private final zzbcj zzb;

    public zzbch(zzbcj zzbcj0) {
        this.zzb = zzbcj0;
        this.zza = new HashMap();
    }

    public final zzbcj zza() {
        return this.zzb;
    }

    public final void zzb(String s, zzbcg zzbcg0) {
        this.zza.put(s, zzbcg0);
    }

    public final void zzc(String s, String s1, long v) {
        zzbcj zzbcj0 = this.zzb;
        zzbcg zzbcg0 = (zzbcg)this.zza.get(s1);
        String[] arr_s = {s};
        if(zzbcg0 != null) {
            zzbcj0.zze(zzbcg0, v, arr_s);
        }
        zzbcg zzbcg1 = new zzbcg(v, null, null);
        this.zza.put(s, zzbcg1);
    }
}

