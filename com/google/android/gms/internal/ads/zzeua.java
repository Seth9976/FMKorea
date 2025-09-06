package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;

public final class zzeua implements zzesj {
    private final Context zza;
    private final String zzb;
    private final zzfyo zzc;

    public zzeua(zzbup zzbup0, Context context0, String s, zzfyo zzfyo0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = zzfyo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 42;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzetz zzetz0 = new zzetz(this);
        return this.zzc.zzb(zzetz0);
    }
}

