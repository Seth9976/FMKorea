package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzwd implements zzwy {
    public final zzxd zza;
    public final zzwr zzb;
    public final boolean zzc;

    public zzwd(zzxd zzxd0, zzwr zzwr0, boolean z) {
        this.zza = zzxd0;
        this.zzb = zzwr0;
        this.zzc = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzwy
    public final List zza(int v, zzcy zzcy0, int[] arr_v) {
        zzwr zzwr0 = this.zzb;
        boolean z = this.zzc;
        zzwc zzwc0 = new zzwc(this.zza);
        zzfua zzfua0 = new zzfua();
        for(int v1 = 0; v1 <= 0; ++v1) {
            zzfua0.zzf(new zzwl(v, zzcy0, v1, zzwr0, arr_v[v1], z, zzwc0));
        }
        return zzfua0.zzi();
    }
}

