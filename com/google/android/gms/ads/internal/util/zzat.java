package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;

final class zzat extends zzcz {
    final Context zza;
    final zzaw zzb;

    zzat(zzaw zzaw0, Context context0) {
        this.zzb = zzaw0;
        this.zza = context0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zze0) {
        if(zze0 == null) {
            return;
        }
        this.zzb.zzi(this.zza, zze0.zzb, true, true);
    }
}

