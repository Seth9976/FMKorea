package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdqo implements zzfgf {
    private final Map zza;
    private final zzaxe zzb;

    zzdqo(zzaxe zzaxe0, Map map0) {
        this.zza = map0;
        this.zzb = zzaxe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffy0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffy0, String s, Throwable throwable0) {
        if(this.zza.containsKey(zzffy0)) {
            int v = ((zzdqn)this.zza.get(zzffy0)).zzc;
            this.zzb.zzc(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffy0, String s) {
        if(this.zza.containsKey(zzffy0)) {
            int v = ((zzdqn)this.zza.get(zzffy0)).zza;
            this.zzb.zzc(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffy0, String s) {
        if(this.zza.containsKey(zzffy0)) {
            int v = ((zzdqn)this.zza.get(zzffy0)).zzb;
            this.zzb.zzc(v);
        }
    }
}

