package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzcph implements Runnable {
    public final zzcpi zza;
    public final JSONObject zzb;

    public zzcph(zzcpi zzcpi0, JSONObject jSONObject0) {
        this.zza = zzcpi0;
        this.zzb = jSONObject0;
    }

    @Override
    public final void run() {
        this.zza.zzd(this.zzb);
    }
}

