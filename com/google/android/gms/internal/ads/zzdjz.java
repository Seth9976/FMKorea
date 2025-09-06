package com.google.android.gms.internal.ads;

import androidx.collection.a;

public final class zzdjz implements Runnable {
    public final zzcfi zza;

    public zzdjz(zzcfi zzcfi0) {
        this.zza = zzcfi0;
    }

    @Override
    public final void run() {
        a a0 = new a();
        this.zza.zzd("onSdkImpression", a0);
    }
}

