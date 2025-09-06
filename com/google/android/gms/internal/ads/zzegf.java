package com.google.android.gms.internal.ads;

import Z1.d;
import org.json.JSONArray;

public final class zzegf implements zzfxl {
    public final zzegh zza;
    public final zzfbr zzb;
    public final zzfbe zzc;

    public zzegf(zzegh zzegh0, zzfbr zzfbr0, zzfbe zzfbe0) {
        this.zza = zzegh0;
        this.zzb = zzfbr0;
        this.zzc = zzfbe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return this.zza.zzf(this.zzb, this.zzc, ((JSONArray)object0));
    }
}

