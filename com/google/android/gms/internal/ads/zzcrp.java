package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcrp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzcrp(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzcrk(((zzcud)this.zza).zza(), ((zzcro)this.zzb).zza(), ((zzcrn)this.zzc).zza(), ((Executor)this.zzd.zzb()));
    }
}

