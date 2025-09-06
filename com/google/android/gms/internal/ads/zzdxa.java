package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

final class zzdxa implements zzczd {
    private final Context zza;
    private final zzbyf zzb;

    zzdxa(Context context0, zzbyf zzbyf0) {
        this.zza = context0;
        this.zzb = zzbyf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
        if(!TextUtils.isEmpty(zzfbr0.zzb.zzb.zzd)) {
            this.zzb.zzp(this.zza, zzfbr0.zza.zza.zzd);
            this.zzb.zzl(this.zza, zzfbr0.zzb.zzb.zzd);
        }
    }
}

