package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzq;

public final class zzdlq implements zzfxl {
    public final zzdlx zza;
    public final zzq zzb;
    public final zzfbe zzc;
    public final zzfbi zzd;
    public final String zze;
    public final String zzf;

    public zzdlq(zzdlx zzdlx0, zzq zzq0, zzfbe zzfbe0, zzfbi zzfbi0, String s, String s1) {
        this.zza = zzdlx0;
        this.zzb = zzq0;
        this.zzc = zzfbe0;
        this.zzd = zzfbi0;
        this.zze = s;
        this.zzf = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, object0);
    }
}

