package com.google.android.gms.internal.ads;

import android.view.View;

final class zzava implements Runnable {
    final View zza;
    final zzave zzb;

    zzava(zzave zzave0, View view0) {
        this.zzb = zzave0;
        this.zza = view0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}

