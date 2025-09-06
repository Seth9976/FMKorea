package com.google.android.gms.internal.ads;

final class zzfrq extends zzfrt {
    final zzfrr zza;

    zzfrq(zzfrr zzfrr0, zzfrv zzfrv0, CharSequence charSequence0) {
        this.zza = zzfrr0;
        super(zzfrv0, charSequence0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfrt
    public final int zzc(int v) {
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfrt
    public final int zzd(int v) {
        return v + 4000 >= this.zzb.length() ? -1 : v + 4000;
    }
}

