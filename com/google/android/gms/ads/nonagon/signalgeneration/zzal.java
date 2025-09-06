package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdwd;
import com.google.android.gms.internal.ads.zzdwe;
import com.google.android.gms.internal.ads.zzgyt;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzg;

public final class zzal implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzal(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzak zza() {
        zzgzb.zzb(zzcan.zza);
        zzdwd zzdwd0 = ((zzdwe)this.zzb).zza();
        return new zzak(zzcan.zza, zzdwd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

