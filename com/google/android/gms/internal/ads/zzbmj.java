package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzbmj implements zzcaw {
    final zzbmt zza;
    final zzfhg zzb;
    final zzbmu zzc;

    zzbmj(zzbmu zzbmu0, zzbmt zzbmt0, zzfhg zzfhg0) {
        this.zzc = zzbmu0;
        this.zza = zzbmt0;
        this.zzb = zzfhg0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zza(Object object0) {
        zzblp zzblp0 = (zzblp)object0;
        synchronized(zzbmu.zzf(this.zzc)) {
            zzbmu.zzh(this.zzc, 0);
            if(zzbmu.zzc(this.zzc) != null && this.zza != zzbmu.zzc(this.zzc)) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                zzbmu.zzc(this.zzc).zzb();
            }
            zzbmu.zzg(this.zzc, this.zza);
            if(((Boolean)zzbdd.zzd.zze()).booleanValue()) {
                zzbmu zzbmu0 = this.zzc;
                if(zzbmu.zze(zzbmu0) != null) {
                    this.zzb.zzf(true);
                    zzbmu.zze(zzbmu0).zzb(this.zzb.zzl());
                }
            }
        }
    }
}

