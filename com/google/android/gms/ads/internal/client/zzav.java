package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbwi;

final class zzav extends zzax {
    final Context zza;
    final String zzb;
    final zzbof zzc;
    final zzaw zzd;

    zzav(zzaw zzaw0, Context context0, String s, zzbof zzbof0) {
        this.zzd = zzaw0;
        this.zza = context0;
        this.zzb = s;
        this.zzc = zzbof0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    protected final Object zza() {
        zzaw.zzt(this.zza, "rewarded");
        return new zzfc();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb(zzce zzce0) {
        return zzce0.zzo(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233012000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc() {
        return zzbwi.zza(this.zza, this.zzb, this.zzc);
    }
}

