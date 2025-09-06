package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

public final class zzeqt implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzeqt(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzeqs(((zzdvq)this.zza).zza(), ((PackageInfo)this.zzb.zzb()));
    }
}

