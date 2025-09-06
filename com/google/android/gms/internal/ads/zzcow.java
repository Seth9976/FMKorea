package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzcow implements Runnable {
    public final zzcfi zza;
    public final JSONObject zzb;

    public zzcow(zzcfi zzcfi0, JSONObject jSONObject0) {
        this.zza = zzcfi0;
        this.zzb = jSONObject0;
    }

    @Override
    public final void run() {
        this.zza.zzl("AFMA_updateActiveView", this.zzb);
    }
}

