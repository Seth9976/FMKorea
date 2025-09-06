package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzbxi implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzbxi(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzbxh zza() {
        return new zzbxh(((Clock)this.zza.zzb()), ((zzbxf)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

