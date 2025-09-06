package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzd implements Callable {
    public final zzf zza;
    public final String zzb;
    public final JSONObject zzc;

    public zzd(zzf zzf0, String s, JSONObject jSONObject0) {
        this.zza = zzf0;
        this.zzb = s;
        this.zzc = jSONObject0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(this.zza.zzb(this.zzb, this.zzc));
    }
}

