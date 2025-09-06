package com.google.android.gms.internal.ads;

final class zzus implements zzvj {
    final zzuv zza;
    private final int zzb;

    public zzus(zzuv zzuv0, int v) {
        this.zza = zzuv0;
        super();
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzkn0, zzht zzht0, int v) {
        return this.zza.zzg(this.zzb, zzkn0, zzht0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long v) {
        return this.zza.zzi(this.zzb, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
        this.zza.zzH(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}

