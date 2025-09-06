package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

public final class zzbzu implements zzbzy {
    public final int zza;
    public final Map zzb;

    public zzbzu(int v, Map map0) {
        this.zza = v;
        this.zzb = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbzy
    public final void zza(JsonWriter jsonWriter0) {
        zzbzz.zzb(this.zza, this.zzb, jsonWriter0);
    }
}

