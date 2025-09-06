package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class zzdvq implements zzgyt {
    private final zzgzg zza;

    public zzdvq(zzgzg zzgzg0) {
        this.zza = zzgzg0;
    }

    public final ApplicationInfo zza() {
        ApplicationInfo applicationInfo0 = ((Context)this.zza.zzb()).getApplicationInfo();
        zzgzb.zzb(applicationInfo0);
        return applicationInfo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

