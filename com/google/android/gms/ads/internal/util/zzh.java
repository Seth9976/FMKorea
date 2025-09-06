package com.google.android.gms.ads.internal.util;

import android.content.Context;

public final class zzh implements Runnable {
    public final zzj zza;
    public final Context zzb;
    public final String zzc;

    public zzh(zzj zzj0, Context context0, String s) {
        this.zza = zzj0;
        this.zzb = context0;
        this.zzc = "admob";
    }

    @Override
    public final void run() {
        this.zza.zzS(this.zzb, this.zzc);
    }
}

