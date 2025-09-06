package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class zzdrk implements zzfgf {
    private final Map zza;
    private final zzdrc zzb;
    private final Clock zzc;
    private final Map zzd;

    public zzdrk(zzdrc zzdrc0, Set set0, Clock clock0) {
        this.zzb = zzdrc0;
        this.zza = new HashMap();
        this.zzd = new HashMap();
        for(Object object0: set0) {
            zzffy zzffy0 = ((zzdrj)object0).zzc;
            this.zzd.put(zzffy0, ((zzdrj)object0));
        }
        this.zzc = clock0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffy0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffy0, String s, Throwable throwable0) {
        if(this.zza.containsKey(zzffy0)) {
            long v = this.zzc.elapsedRealtime();
            long v1 = (long)(((Long)this.zza.get(zzffy0)));
            this.zzb.zza().put("task." + s, "f." + Long.toString(v - v1));
        }
        if(this.zzd.containsKey(zzffy0)) {
            this.zze(zzffy0, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffy0, String s) {
        Long long0 = this.zzc.elapsedRealtime();
        this.zza.put(zzffy0, long0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffy0, String s) {
        if(this.zza.containsKey(zzffy0)) {
            long v = this.zzc.elapsedRealtime();
            long v1 = (long)(((Long)this.zza.get(zzffy0)));
            this.zzb.zza().put("task." + s, "s." + Long.toString(v - v1));
        }
        if(this.zzd.containsKey(zzffy0)) {
            this.zze(zzffy0, true);
        }
    }

    private final void zze(zzffy zzffy0, boolean z) {
        zzffy zzffy1 = ((zzdrj)this.zzd.get(zzffy0)).zzb;
        if(this.zza.containsKey(zzffy1)) {
            long v = this.zzc.elapsedRealtime();
            long v1 = (long)(((Long)this.zza.get(zzffy1)));
            String s = "label." + ((zzdrj)this.zzd.get(zzffy0)).zza;
            this.zzb.zza().put(s, (z ? "s." : "f.") + Long.toString(v - v1));
        }
    }
}

