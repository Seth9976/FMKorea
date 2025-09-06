package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

final class zzbxf {
    private final Clock zza;
    private final zzg zzb;
    private final zzbyf zzc;

    zzbxf(Clock clock0, zzg zzg0, zzbyf zzbyf0) {
        this.zza = clock0;
        this.zzb = zzg0;
        this.zzc = zzbyf0;
    }

    public final void zza() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzar)).booleanValue()) {
        }
    }

    public final void zzb(int v, long v1) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzaq)).booleanValue()) {
            return;
        }
        if(v1 - this.zzb.zzf() < 0L) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzar)).booleanValue()) {
            this.zzb.zzL(v);
        }
        else {
            this.zzb.zzL(-1);
        }
        this.zzb.zzM(v1);
        this.zza();
    }
}

