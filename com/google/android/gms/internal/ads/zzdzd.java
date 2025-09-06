package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdzd implements Callable {
    public final d zza;
    public final d zzb;
    public final d zzc;

    public zzdzd(d d0, d d1, d d2) {
        this.zza = d0;
        this.zzb = d1;
        this.zzc = d2;
    }

    @Override
    public final Object call() {
        return new zzdzn(((zzeab)this.zza.get()), ((JSONObject)this.zzb.get()), ((zzbuq)this.zzc.get()));
    }
}

