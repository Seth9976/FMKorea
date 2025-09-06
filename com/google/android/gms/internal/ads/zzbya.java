package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

public final class zzbya implements Callable {
    public final zzbyf zza;
    public final Context zzb;

    public zzbya(zzbyf zzbyf0, Context context0) {
        this.zza = zzbyf0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        return this.zza.zzg(this.zzb);
    }
}

