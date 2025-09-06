package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcjh implements zzewe {
    private final zzciz zza;
    private Context zzb;
    private String zzc;

    zzcjh(zzciz zzciz0, zzcjg zzcjg0) {
        this.zza = zzciz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzewe
    public final zzewe zza(String s) {
        s.getClass();
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzewe
    public final zzewe zzb(Context context0) {
        context0.getClass();
        this.zzb = context0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzewe
    public final zzewf zzc() {
        zzgzb.zzc(this.zzb, Context.class);
        zzgzb.zzc(this.zzc, String.class);
        return new zzcjj(this.zza, this.zzb, this.zzc, null);
    }
}

