package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzfqw;

public final class zzm implements zzfqw {
    public final zzaa zza;
    public final Uri zzb;

    public zzm(zzaa zzaa0, Uri uri0) {
        this.zza = zzaa0;
        this.zzb = uri0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        return zzaa.zzP(this.zzb, ((String)object0));
    }
}

