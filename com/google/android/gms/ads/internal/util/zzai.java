package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzfyo;

public final class zzai implements Runnable {
    public final zzas zza;
    public final zzfyo zzb;

    public zzai(zzas zzas0, zzfyo zzfyo0) {
        this.zza = zzas0;
        this.zzb = zzfyo0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb);
    }
}

