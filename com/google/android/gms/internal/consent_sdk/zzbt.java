package com.google.android.gms.internal.consent_sdk;

public final class zzbt implements Runnable {
    public final zzbw zza;
    public final String zzb;

    public zzbt(zzbw zzbw0, String s) {
        this.zza = zzbw0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        zzcu.zza(this.zza, this.zzb);
    }
}

