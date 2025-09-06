package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzdrl implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdrl(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzdrk(((zzdrc)this.zza.zzb()), ((zzgze)this.zzb).zzc(), ((Clock)this.zzc.zzb()));
    }
}

