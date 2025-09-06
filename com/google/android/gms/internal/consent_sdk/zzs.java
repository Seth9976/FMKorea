package com.google.android.gms.internal.consent_sdk;

import W1.c.b;

public final class zzs implements Runnable {
    public final zzx zza;
    public final b zzb;
    public final zzac zzc;

    public zzs(zzx zzx0, b c$b0, zzac zzac0) {
        this.zza = zzx0;
        this.zzb = c$b0;
        this.zzc = zzac0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}

