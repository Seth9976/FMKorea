package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzebc implements zzcwl, zzcxw {
    private static final Object zza;
    private static int zzb;
    private final zzg zzc;
    private final zzebm zzd;

    static {
        zzebc.zza = new Object();
    }

    public zzebc(zzebm zzebm0, zzg zzg0) {
        this.zzd = zzebm0;
        this.zzc = zzg0;
    }

    private final void zzb(boolean z) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
            return;
        }
        if(!this.zzc.zzQ()) {
            Object object0 = zzebc.zza;
            synchronized(object0) {
                int v = zzebc.zzb;
                int v1 = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzgc)));
            }
            if(v >= v1) {
                return;
            }
            this.zzd.zzd(z);
            synchronized(object0) {
                ++zzebc.zzb;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        this.zzb(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        this.zzb(true);
    }
}

