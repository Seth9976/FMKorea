package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzgzd {
    private final List zza;
    private final List zzb;

    zzgzd(int v, int v1, zzgzc zzgzc0) {
        this.zza = zzgyq.zzc(v);
        this.zzb = zzgyq.zzc(v1);
    }

    public final zzgzd zza(zzgzg zzgzg0) {
        this.zzb.add(zzgzg0);
        return this;
    }

    public final zzgzd zzb(zzgzg zzgzg0) {
        this.zza.add(zzgzg0);
        return this;
    }

    public final zzgze zzc() {
        return new zzgze(this.zza, this.zzb, null);
    }
}

