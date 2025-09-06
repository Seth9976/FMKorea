package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import java.util.concurrent.Callable;

final class zzo implements Callable {
    final zzs zza;

    zzo(zzs zzs0) {
        this.zza = zzs0;
        super();
    }

    @Override
    public final Object call() {
        return new zzaqx(zzaqw.zzt(zzs.zzm(this.zza).zza, zzs.zzc(this.zza), false));
    }
}

