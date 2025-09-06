package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class zzear implements zzfgf {
    private final Map zza;
    private final Map zzb;
    private final zzfgn zzc;

    public zzear(Set set0, zzfgn zzfgn0) {
        this.zzc = zzfgn0;
        this.zza = new HashMap();
        this.zzb = new HashMap();
        for(Object object0: set0) {
            zzffy zzffy0 = ((zzeaq)object0).zzb;
            String s = ((zzeaq)object0).zza;
            this.zza.put(zzffy0, s);
            zzffy zzffy1 = ((zzeaq)object0).zzc;
            String s1 = ((zzeaq)object0).zza;
            this.zzb.put(zzffy1, s1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffy0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffy0, String s, Throwable throwable0) {
        this.zzc.zze("task." + s, "f.");
        if(this.zzb.containsKey(zzffy0)) {
            String s1 = "label." + ((String)this.zzb.get(zzffy0));
            this.zzc.zze(s1, "f.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffy0, String s) {
        this.zzc.zzd("task." + s);
        if(this.zza.containsKey(zzffy0)) {
            String s1 = "label." + ((String)this.zza.get(zzffy0));
            this.zzc.zzd(s1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffy0, String s) {
        this.zzc.zze("task." + s, "s.");
        if(this.zzb.containsKey(zzffy0)) {
            String s1 = "label." + ((String)this.zzb.get(zzffy0));
            this.zzc.zze(s1, "s.");
        }
    }
}

