package com.google.android.gms.internal.consent_sdk;

import W1.c.a;
import W1.c.b;
import W1.d;
import android.app.Activity;

public final class zzw implements Runnable {
    public final zzx zza;
    public final Activity zzb;
    public final d zzc;
    public final b zzd;
    public final a zze;

    public zzw(zzx zzx0, Activity activity0, d d0, b c$b0, a c$a0) {
        this.zza = zzx0;
        this.zzb = activity0;
        this.zzc = d0;
        this.zzd = c$b0;
        this.zze = c$a0;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

