package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzgo implements zzgh {
    private final Context zza;
    private final zzgh zzb;

    public zzgo(Context context0) {
        zzgq zzgq0 = new zzgq();
        super();
        this.zza = context0.getApplicationContext();
        this.zzb = zzgq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgh
    public final zzgi zza() {
        zzgv zzgv0 = ((zzgq)this.zzb).zzg();
        return new zzgp(this.zza, zzgv0);
    }
}

