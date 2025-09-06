package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzckd implements zzdsi {
    private final Long zza;
    private final String zzb;
    private final zzciz zzc;
    private final zzckh zzd;
    private final zzckd zze;

    zzckd(zzciz zzciz0, zzckh zzckh0, Long long0, String s, zzckc zzckc0) {
        this.zze = this;
        this.zzc = zzciz0;
        this.zzd = zzckh0;
        this.zza = long0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzdsi
    public final zzdss zza() {
        Context context0 = zzckh.zza(this.zzd);
        zzdsl zzdsl0 = zzckh.zzc(this.zzd);
        return zzdst.zza(((long)this.zza), context0, zzdsl0, this.zzc, this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzdsi
    public final zzdsw zzb() {
        zzdsl zzdsl0 = zzckh.zzc(this.zzd);
        return zzdsx.zza(((long)this.zza), zzckh.zza(this.zzd), zzdsl0, this.zzc, this.zzb);
    }
}

