package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

final class zzejm implements zzf {
    final zzdeq zza;

    zzejm(zzejn zzejn0, zzdeq zzdeq0) {
        this.zza = zzdeq0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zza(View view0) {
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}

