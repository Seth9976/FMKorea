package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class zzcmq {
    private final Map zza;
    private final Map zzb;

    zzcmq(Map map0, Map map1) {
        this.zza = map0;
        this.zzb = map1;
    }

    public final void zza(zzfbr zzfbr0) {
        for(Object object0: zzfbr0.zzb.zzc) {
            zzfbp zzfbp0 = (zzfbp)object0;
            if(this.zza.containsKey(zzfbp0.zza)) {
                ((zzcmt)this.zza.get(zzfbp0.zza)).zza(zzfbp0.zzb);
            }
            else if(this.zzb.containsKey(zzfbp0.zza)) {
                zzcms zzcms0 = (zzcms)this.zzb.get(zzfbp0.zza);
                JSONObject jSONObject0 = zzfbp0.zzb;
                HashMap hashMap0 = new HashMap();
                Iterator iterator1 = jSONObject0.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    String s = (String)object1;
                    String s1 = jSONObject0.optString(s);
                    if(s1 != null) {
                        hashMap0.put(s, s1);
                    }
                }
                zzcms0.zza(hashMap0);
            }
        }
    }
}

