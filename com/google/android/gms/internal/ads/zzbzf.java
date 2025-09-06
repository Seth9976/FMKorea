package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;

final class zzbzf extends zzb {
    final zzbzj zza;

    zzbzf(zzbzj zzbzj0) {
        this.zza = zzbzj0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbbx zzbbx0 = new zzbbx(zzbzj.zzb(this.zza), zzbzj.zzi(this.zza).zza);
        synchronized(zzbzj.zzl(this.zza)) {
            try {
                zzbca.zza(zzbzj.zze(this.zza), zzbbx0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzcaa.zzk("Cannot config CSI reporter.", illegalArgumentException0);
            }
        }
    }
}

