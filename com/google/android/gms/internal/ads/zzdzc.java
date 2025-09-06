package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdzc implements Callable {
    public final d zza;
    public final d zzb;

    public zzdzc(d d0, d d1) {
        this.zza = d0;
        this.zzb = d1;
    }

    @Override
    public final Object call() {
        return new zzeae(((JSONObject)this.zza.get()), ((zzbuq)this.zzb.get()));
    }
}

