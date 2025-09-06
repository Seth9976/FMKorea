package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfqw;
import java.util.List;

public final class zzn implements zzfqw {
    public final zzaa zza;
    public final List zzb;

    public zzn(zzaa zzaa0, List list0) {
        this.zza = zzaa0;
        this.zzb = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        return this.zza.zzB(this.zzb, ((String)object0));
    }
}

