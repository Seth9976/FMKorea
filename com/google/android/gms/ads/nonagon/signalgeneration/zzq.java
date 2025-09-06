package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

public final class zzq implements Callable {
    public final zzaa zza;
    public final Uri zzb;
    public final IObjectWrapper zzc;

    public zzq(zzaa zzaa0, Uri uri0, IObjectWrapper iObjectWrapper0) {
        this.zza = zzaa0;
        this.zzb = uri0;
        this.zzc = iObjectWrapper0;
    }

    @Override
    public final Object call() {
        return this.zza.zzm(this.zzb, this.zzc);
    }
}

