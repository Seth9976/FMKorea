package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import java.util.Map;

final class zzbmg implements zzbir {
    final zzblp zza;
    final zzca zzb;
    final zzbmu zzc;

    zzbmg(zzbmu zzbmu0, zzaqx zzaqx0, zzblp zzblp0, zzca zzca0) {
        this.zzc = zzbmu0;
        this.zza = zzblp0;
        this.zzb = zzca0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzbmv zzbmv0 = (zzbmv)object0;
        synchronized(zzbmu.zzf(this.zzc)) {
            zzcaa.zzi("JS Engine is requesting an update");
            if(zzbmu.zza(this.zzc) == 0) {
                zzcaa.zzi("Starting reload.");
                zzbmu.zzh(this.zzc, 2);
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", ((zzbir)this.zzb.zza()));
        }
    }
}

