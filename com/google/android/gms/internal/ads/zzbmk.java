package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzbmk implements zzcau {
    final zzbmt zza;
    final zzfhg zzb;
    final zzbmu zzc;

    zzbmk(zzbmu zzbmu0, zzbmt zzbmt0, zzfhg zzfhg0) {
        this.zzc = zzbmu0;
        this.zza = zzbmt0;
        this.zzb = zzfhg0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
        synchronized(zzbmu.zzf(this.zzc)) {
            zzbmu.zzh(this.zzc, 1);
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if(((Boolean)zzbdd.zzd.zze()).booleanValue()) {
                zzbmu zzbmu0 = this.zzc;
                if(zzbmu.zze(zzbmu0) != null) {
                    this.zzb.zzc("Failed loading new engine");
                    this.zzb.zzf(false);
                    zzbmu.zze(zzbmu0).zzb(this.zzb.zzl());
                }
            }
        }
    }
}

