package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzckf implements zzdsp {
    private final zzciz zza;
    private Context zzb;
    private zzbjp zzc;

    zzckf(zzciz zzciz0, zzcke zzcke0) {
        this.zza = zzciz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsp
    public final zzdsp zza(zzbjp zzbjp0) {
        zzbjp0.getClass();
        this.zzc = zzbjp0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsp
    public final zzdsp zzb(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsp
    public final zzdsq zzc() {
        zzgzb.zzc(this.zzb, Context.class);
        zzgzb.zzc(this.zzc, zzbjp.class);
        return new zzckh(this.zza, this.zzb, this.zzc, null);
    }
}

