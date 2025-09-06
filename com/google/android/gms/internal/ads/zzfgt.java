package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class zzfgt {
    private final Clock zza;
    private final Map zzb;
    private final Map zzc;

    public zzfgt(Clock clock0) {
        this.zza = clock0;
        this.zzb = new HashMap();
        this.zzc = new HashMap();
    }

    public final List zza() {
        List list0 = new ArrayList();
        for(Object object0: this.zzb.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            int v = 0;
            if(((List)map$Entry0.getValue()).size() > 1) {
                for(Object object1: ((List)map$Entry0.getValue())) {
                    ++v;
                    list0.add(new zzfgs(((String)map$Entry0.getKey()) + "." + v, ((String)object1)));
                }
            }
            else {
                list0.add(new zzfgs(((String)map$Entry0.getKey()), ((String)((List)map$Entry0.getValue()).get(0))));
            }
        }
        return list0;
    }

    public final void zzb(String s) {
        if(this.zzc.containsKey(s)) {
            long v = this.zza.elapsedRealtime();
            long v1 = (long)(((Long)this.zzc.remove(s)));
            this.zzd(s, v - v1);
            return;
        }
        Long long0 = this.zza.elapsedRealtime();
        this.zzc.put(s, long0);
    }

    public final void zzc(String s, String s1) {
        if(this.zzc.containsKey(s)) {
            this.zzd(s, s1 + (this.zza.elapsedRealtime() - ((long)(((Long)this.zzc.remove(s))))));
            return;
        }
        Long long0 = this.zza.elapsedRealtime();
        this.zzc.put(s, long0);
    }

    private final void zzd(String s, String s1) {
        if(!this.zzb.containsKey(s)) {
            ArrayList arrayList0 = new ArrayList();
            this.zzb.put(s, arrayList0);
        }
        ((List)this.zzb.get(s)).add(s1);
    }
}

