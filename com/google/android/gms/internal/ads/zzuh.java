package com.google.android.gms.internal.ads;

final class zzuh implements zzvj {
    private final zzvj zza;
    private final long zzb;

    public zzuh(zzvj zzvj0, long v) {
        this.zza = zzvj0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzkn0, zzht zzht0, int v) {
        int v1 = this.zza.zza(zzkn0, zzht0, v);
        if(v1 == -4) {
            zzht0.zzd += this.zzb;
            return -4;
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long v) {
        return this.zza.zzb(v - this.zzb);
    }

    public final zzvj zzc() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
        this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        return this.zza.zze();
    }
}

