package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

public final class zzbzw implements zzbzy {
    public final String zza;
    public final String zzb;
    public final Map zzc;
    public final byte[] zzd;

    public zzbzw(String s, String s1, Map map0, byte[] arr_b) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = map0;
        this.zzd = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzbzy
    public final void zza(JsonWriter jsonWriter0) {
        zzbzz.zza(this.zza, this.zzb, this.zzc, this.zzd, jsonWriter0);
    }
}

