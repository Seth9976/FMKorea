package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzal extends zzax {
    final Context zza;
    final zzq zzb;
    final String zzc;
    final zzaw zzd;

    zzal(zzaw zzaw0, Context context0, zzq zzq0, String s) {
        this.zzd = zzaw0;
        this.zza = context0;
        this.zzb = zzq0;
        this.zzc = s;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zza() {
        zzaw.zzt(this.zza, "search");
        return new zzew();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzf(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233012000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        return zzaw.zzb(this.zzd).zza(this.zza, this.zzb, this.zzc, null, 3);
    }
}

