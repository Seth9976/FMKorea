package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzctu implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzctu(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Clock clock0 = (Clock)this.zza.zzb();
        return ((zzchx)this.zzb).zza().zzc(clock0, ((zzcvz)this.zzc).zza().zzf);
    }
}

