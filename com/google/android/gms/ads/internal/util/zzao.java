package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzfyo;

public final class zzao implements Runnable {
    public final zzas zza;
    public final zzfyo zzb;

    public zzao(zzas zzas0, zzfyo zzfyo0) {
        this.zza = zzas0;
        this.zzb = zzfyo0;
    }

    @Override
    public final void run() {
        this.zza.zzd(this.zzb);
    }
}

