package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzckt implements zzfax {
    private final zzciz zza;
    private Context zzb;
    private String zzc;

    zzckt(zzciz zzciz0, zzcks zzcks0) {
        this.zza = zzciz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfax
    public final zzfax zza(String s) {
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfax
    public final zzfax zzb(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfax
    public final zzfay zzc() {
        zzgzb.zzc(this.zzb, Context.class);
        return new zzckv(this.zza, this.zzb, this.zzc, null);
    }
}

