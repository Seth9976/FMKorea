package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbof;

final class zzaj extends zzax {
    final Context zza;
    final zzq zzb;
    final String zzc;
    final zzbof zzd;
    final zzaw zze;

    zzaj(zzaw zzaw0, Context context0, zzq zzq0, String s, zzbof zzbof0) {
        this.zze = zzaw0;
        this.zza = context0;
        this.zzb = zzq0;
        this.zzc = s;
        this.zzd = zzbof0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zza() {
        zzaw.zzt(this.zza, "banner");
        return new zzew();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzd(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 233012000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 1);
    }
}

