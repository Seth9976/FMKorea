package com.google.android.gms.ads.internal.client;

import android.content.Context;

public final class zzec implements Runnable {
    public final zzej zza;
    public final Context zzb;

    public zzec(zzej zzej0, Context context0, String s) {
        this.zza = zzej0;
        this.zzb = context0;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb, null);
    }
}

