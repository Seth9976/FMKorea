package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

final class zzegm extends zzbpv {
    final zzegn zza;
    private final zzedq zzb;

    zzegm(zzegn zzegn0, zzedq zzedq0, zzegl zzegl0) {
        this.zza = zzegn0;
        super();
        this.zzb = zzedq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpw
    public final void zze(String s) {
        ((zzefj)this.zzb.zzc).zzi(0, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpw
    public final void zzf(zze zze0) {
        ((zzefj)this.zzb.zzc).zzh(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpw
    public final void zzg(zzbou zzbou0) {
        zzegn.zzc(this.zza, zzbou0);
        ((zzefj)this.zzb.zzc).zzo();
    }
}

