package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzegc implements Callable {
    public final zzegh zza;
    public final d zzb;
    public final d zzc;
    public final zzfbr zzd;
    public final zzfbe zze;
    public final JSONObject zzf;

    public zzegc(zzegh zzegh0, d d0, d d1, zzfbr zzfbr0, zzfbe zzfbe0, JSONObject jSONObject0) {
        this.zza = zzegh0;
        this.zzb = d0;
        this.zzc = d1;
        this.zzd = zzfbr0;
        this.zze = zzfbe0;
        this.zzf = jSONObject0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

