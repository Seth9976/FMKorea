package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

final class zzdgf implements zzcsh {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgzg zzd;
    private final zzdin zze;

    zzdgf(Map map0, Map map1, Map map2, zzgzg zzgzg0, zzdin zzdin0) {
        this.zza = map0;
        this.zzb = map1;
        this.zzc = map2;
        this.zzd = zzgzg0;
        this.zze = zzdin0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcsh
    public final zzedn zza(int v, String s) {
        zzedn zzedn0 = (zzedn)this.zza.get(s);
        if(zzedn0 != null) {
            return zzedn0;
        }
        switch(v) {
            case 1: {
                if(this.zze.zze() != null) {
                    zzedn zzedn1 = ((zzcsh)this.zzd.zzb()).zza(1, s);
                    return zzedn1 == null ? null : zzcsl.zza(zzedn1);
                }
                return null;
            }
            case 4: {
                zzegb zzegb0 = (zzegb)this.zzc.get(s);
                if(zzegb0 != null) {
                    return new zzedo(zzegb0, (Object object0) -> new zzcsl(((List)object0)));
                }
                zzedn zzedn2 = (zzedn)this.zzb.get(s);
                return zzedn2 == null ? null : zzcsl.zza(zzedn2);
            }
            default: {
                return null;
            }
        }
    }
}

