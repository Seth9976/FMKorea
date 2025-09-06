package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

public final class zzdvk implements Callable {
    public final zzaqx zza;
    public final Context zzb;

    public zzdvk(zzaqx zzaqx0, Context context0) {
        this.zza = zzaqx0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc().zzg(this.zzb);
    }
}

