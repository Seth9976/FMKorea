package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzddr implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzddr(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzddq(((Context)this.zza.zzb()), ((zzgze)this.zzb).zzc(), ((zzcsu)this.zzc).zza());
    }
}

