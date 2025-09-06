package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzemf implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzemf(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzemd(((Clock)this.zza.zzb()), ((zzcvz)this.zzb).zza());
    }
}

