package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzwh implements zzwy {
    public final zzwr zza;
    public final String zzb;

    public zzwh(zzwr zzwr0, String s) {
        this.zza = zzwr0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzwy
    public final List zza(int v, zzcy zzcy0, int[] arr_v) {
        zzwr zzwr0 = this.zza;
        String s = this.zzb;
        zzfua zzfua0 = new zzfua();
        for(int v1 = 0; v1 <= 0; ++v1) {
            zzfua0.zzf(new zzwx(v, zzcy0, v1, zzwr0, arr_v[v1], s));
        }
        return zzfua0.zzi();
    }
}

