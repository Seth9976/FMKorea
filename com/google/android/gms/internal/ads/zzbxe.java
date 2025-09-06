package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzbxe implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzbxe(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzbxd(((Context)this.zza.zzb()), ((zzg)this.zzb.zzb()), ((zzbyf)this.zzc.zzb()));
    }
}

