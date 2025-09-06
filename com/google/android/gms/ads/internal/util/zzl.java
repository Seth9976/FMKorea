package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import java.util.concurrent.Callable;

public final class zzl implements Callable {
    public final Uri zza;

    public zzl(Uri uri0) {
        this.zza = uri0;
    }

    @Override
    public final Object call() {
        return zzs.zzM(this.zza);
    }
}

