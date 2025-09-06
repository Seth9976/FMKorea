package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzexu implements zzfxl {
    public final zzexw zza;
    public final zzfdw zzb;
    public final zzctl zzc;

    public zzexu(zzexw zzexw0, zzfdw zzfdw0, zzctl zzctl0) {
        this.zza = zzexw0;
        this.zzb = zzfdw0;
        this.zzc = zzctl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        zzctl zzctl0 = this.zzc;
        this.zzb.zzb = (zzfbr)object0;
        boolean z = false;
        for(Object object1: ((zzfbr)object0).zzb.zza) {
            for(Object object2: ((zzfbe)object1).zza) {
                if(((String)object2).contains("FirstPartyRenderer")) {
                    z = true;
                    continue;
                }
                return zzfye.zzh(null);
            }
        }
        return z ? zzctl0.zzi(zzfye.zzh(((zzfbr)object0))) : zzfye.zzh(null);
    }
}

