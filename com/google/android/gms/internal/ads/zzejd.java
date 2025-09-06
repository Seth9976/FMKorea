package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

final class zzejd implements zzf {
    final zzcas zza;
    final zzfbr zzb;
    final zzfbe zzc;
    final zzejj zzd;
    final zzeje zze;

    zzejd(zzeje zzeje0, zzcas zzcas0, zzfbr zzfbr0, zzfbe zzfbe0, zzejj zzejj0) {
        this.zze = zzeje0;
        this.zza = zzcas0;
        this.zzb = zzfbr0;
        this.zzc = zzfbe0;
        this.zzd = zzejj0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zza(View view0) {
        Object object0 = zzeje.zzd(this.zze).zza(this.zzb, this.zzc, view0, this.zzd);
        this.zza.zzc(object0);
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}

